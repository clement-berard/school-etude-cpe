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

    /**
     * Action pour supprimer un élément du panier
     */
    $('.cart_delete_item').click(function() {
        var id_product = $(this).data('id');
        deleteItem(id_product);
    });

    /**
     * pour changer le nombre de produit que nous
     * avons dans le panier
     */
    $('.cart_number_of_item').change(function() {
        var id_product = $(this).data('id');
        var value = $(this).val();

        if (value == 0) {
            if (!deleteItem(id_product))
                $(this).val(1);
        }
        else {
            var uniqueprice = $(this).data('uniqueprice');
            var olderstock = $(this).data('olderstock');
            if(olderstock < value)
                addToCart(id_product, false);
            else
                deleteOneQuantityItem(id_product);



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
        url: "add_to_cart.php",
        beforeSend: function(xhr) {

        }
    })
            .done(function(data) {
                refreshNbCart(data.nb_product_cart);
                if (alerte)
                    alert(data.message);
            });
}

/**
 *
 */
function deleteItem(id_product) {
    if (confirm("Voulez-vous vraiment supprimer ce produit de votre panier ?")) {
        return true;
    }
    else {
        return false;
    }

}

 function deleteOneQuantityItem(id_product){
     $.ajax({
        type: "POST",
        dataType: 'json',
        data: {id: id_product},
        url: "add_to_cart.php",
        beforeSend: function(xhr) {

        }
    })
            .done(function(data) {
                refreshNbCart(data.nb_product_cart);
                if (alerte)
                    alert(data.message);
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

