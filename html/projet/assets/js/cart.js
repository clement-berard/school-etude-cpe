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
 *
 * @param {type} id_product
 * @returns {undefined}
 */
function addToCart(id_product, alerte) {
    alerte = typeof alerte !== 'undefined' ? alerte : true;
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
                    alert(data.message);
            });
}

/**
 *
 */
function deleteItem(id_product, num) {
    if (confirm("Voulez-vous vraiment supprimer ce produit de votre panier ?")) {
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
    else {
        return false;
    }

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
 * Supprimer le tableau du panier si il ne reste plus
 * d'articles de le panier
 * @returns {undefined}
 */
function noMoreItem() {
    var rowCount = $('#table_cart >tbody >tr').length;
    var tableau = $('#table_cart');
    var noItemDiv = $('#empty_cart_div');
    var validateCartButton = $('#contain_valid_button');
    if (rowCount == 0) {
        tableau.hide();
        validateCartButton.hide();
        noItemDiv.removeClass('cachee');
    }
}

/**
 *
 * @returns {undefined}
 */
function clearCart() {
    $.ajax({
        type: "POST",
        dataType: 'json',
        url: "ajaxHandler.php?action=clearAllCart",
        beforeSend: function(xhr) {

        }
    })
            .done(function(data) {
                alert(data.message);
                noMoreItem();
            });
}

