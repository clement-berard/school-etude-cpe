/*
 * Javascript pour la page du panier
 *
 *
 */

/**
 * Quand le DOM est prêt
 */
$(document).ready(function() {
    /**
     * Evenemet pour l'ajout dans le panier
     * Appel à une fonction d'ajout (plus bas)
     */
    $('.add_to_cart').click(function() {
        var id_product = $(this).data('idproduct');
        addToCart(id_product);
    });

    // pour vider le panier
    $('#clearAllCartLink').click(function() {
        clearCart();
    });

    /**
     * Action pour supprimer un élément du panier
     */
    $('.cart_delete_item').click(function() {
        var id_product = $(this).data('id');
        var number = $(this).parent('td').parent('tr').find('.cart_number_of_item');
        deleteItem(id_product, number.val());
    });

    /**
     * pour changer le nombre de produit que nous
     * avons dans le panier
     */
    $('.cart_number_of_item').change(function() {
        var id_product = $(this).data('id');
        var value = $(this).val();
        if (value == 0) {
            if (!deleteItem(id_product, value))
                $(this).val(1);
        }
        else {
            var uniqueprice = $(this).data('uniqueprice');
            var olderstock = $(this).data('olderstock');
            if (olderstock < value) {
                addToCart(id_product, false);
            }
            else {
                deleteOneQuantityItem(id_product);
            }

            $("#td_cart_item_no_" + id_product).html(value * uniqueprice);
        }

    });

});


/**
 * Supprimer le tableau du panier si il ne reste plus
 * d'articles de le panier
 * @returns {undefined}
 */
function noMoreItem(clear) {
    clear = typeof clear !== 'undefined' ? clear : false;
    var rowCount = $('#table_cart >tbody >tr').length;
    var tableau = $('#table_cart');
    var noItemDiv = $('#empty_cart_div');
    var validateCartButton = $('#contain_valid_button');

    if (clear)
        rowCount = 0;

    if (rowCount == 0) {
        tableau.hide();
        $('#clearAllCartLink').hide();
        $('#contain_totalprice').hide();
        validateCartButton.hide();
        noItemDiv.removeClass('cachee');
    }
}

/**
 *
 * @param {type} id_product
 * @returns {undefined}
 */
function addToCart(id_product, alerte) {
    // valeur par défaut
    alerte = typeof alerte !== 'undefined' ? alerte : true;
    // appel ajax
    $.ajax({
        type: "POST",
        dataType: 'json',
        data: {id: id_product},
        url: "ajaxHandler.php?action=addToCart",
        beforeSend: function(xhr) {

        }
    })
            .done(function(data) {
                refreshNbCart(data.nb_product_cart);
                $('#product_quantity_' + id_product).html(data.quantity);
                if (alerte)
                    showNotif(data.message, 'success');
            });
}

/**
 * fonction de suppression d'un élément du panier
 */
function deleteItem(id_product, num) {
    noty({
        text: 'Voulez-vous vraiment supprimer ce produit ?',
        buttons: [
            {addClass: 'btn-notif btn-cancel-notif', text: 'Oui', onClick: function($noty) {
                    $noty.close();
                    $.ajax({
                        type: "POST",
                        dataType: 'json',
                        data: {id: id_product, number: num},
                        url: "ajaxHandler.php?action=deleteItem",
                        beforeSend: function(xhr) {

                        }
                    })
                            .done(function(data) {
                                $("#tr_cart_item_no_" + id_product).fadeOut('fast').remove();
                                refreshNbCart(data.nb_product_cart);
                                noMoreItem();
                            });
                }
            },
            {addClass: 'btn-notif btn-cancel-notif', text: 'Non', onClick: function($noty) {
                    $noty.close();
                }
            }
        ]
    });
}

/**
 * Fonction qui supprime juste UNE quantité d'un produit
 * @param {type} id_product
 * @returns {undefined}
 */
function deleteOneQuantityItem(id_product) {
    $.ajax({
        type: "POST",
        dataType: 'json',
        data: {id: id_product},
        url: "ajaxHandler.php?action=deleteOneQuantityItem",
        beforeSend: function(xhr) {

        }
    })
            .done(function(data) {
                refreshNbCart(data.nb_product_cart);
            });
}

/**
 * Pour raffraichier le nombre d'éléments dans la panier
 * POUR LE MENU du site
 * @param {type} number
 * @returns {undefined}
 */
function refreshNbCart(number) {
    $('#number_product_cart').html(number);
}



/**
 *
 * @returns {undefined}
 */
function clearCart() {
    noty({
        text: 'Voulez-vous vraiment supprimer tous les produits du panier ?',
        buttons: [
            {addClass: 'btn-notif btn-cancel-notif', text: 'Oui', onClick: function($noty) {
                    $noty.close();
                    $.ajax({
                        type: "POST",
                        dataType: 'json',
                        url: "ajaxHandler.php?action=clearAllCart",
                        beforeSend: function(xhr) {

                        }
                    })
                            .done(function(data) {
                                console.log("rien ne vas");
                                noMoreItem(true);
                                refreshNbCart(0);
                            });
                }
            },
            {addClass: 'btn-notif btn-cancel-notif', text: 'Non', onClick: function($noty) {
                    $noty.close();
                }
            }
        ]
    });
}

