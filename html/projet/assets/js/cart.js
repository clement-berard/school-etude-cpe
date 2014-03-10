/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
$(document).ready(function() {
    /**
     * 
     */
    $('.add_to_cart').click(function() {

        var id_product = $(this).data('idproduct');
        addToCart(id_product);
    });
});




/**
 * 
 * @param {type} id_product
 * @returns {undefined}
 */
function addToCart(id_product) {
    $.ajax({
        type: "POST",
        dataType: 'text',
        data : {id : id_product},
        url: "add_to_cart.php",
        beforeSend: function(xhr) {
            
        }
    })
            .done(function(data) {
                   alert(data);
            });
}
