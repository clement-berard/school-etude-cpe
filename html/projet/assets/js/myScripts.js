

jQuery(document).ready(function() {
    /**
     * fonction qui ne sert a rien, juste a dire que
     * nous ne sommes pas sur les réseaux sociaux
     */
    $('.social_link').click(function() {
        alert('Nous ne sommes pas sur ' + $(this).attr('rel'));
        return false;
    });
    /**
     * petit tooltip sur la page product
     *
     */
    $('.link_with_tooltip').tooltip();
    $('.cart_delete_product').tooltip();
    /**
     * pour valider le formulaire d'ajout de user
     *
     */
    $("#formulaire_enregistrement").validate({
        rules: {
            "fname": {
                "required": true,
                "minlength": 2,
                "maxlength": 60000
            },
            "lname": {
                "required": true,
                "maxlength": 255
            },
            "comment": {
                "required": true
            }
        }
    });
    /**
     * fonction d'ajour (ajax) des produits dans le panie
     *
     */
    $('.add_to_cart').click(function() {
        $.ajax({
            type: "POST", // envois des données en POST
            dataType: 'text', // pas de json, du text
            url: "add_to_cart.php", // mon fichier qui va traiter
            data: {id: $(this).attr('rel')}, // mes données (juste l'id)
            beforeSend: function(xhr) {
                // on fait rien avant, pas besoin, je le laisse
                // au cas ou
            }
        })
                .done(function(data) {
                    // on affiche le rendu Html dans la div result_add_to_cart
                    $('#result_add_to_cart').html(data);
                });
    });

});
