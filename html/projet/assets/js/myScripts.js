
jQuery(document).ready(function() {
    $('.social_link').click(function() {
        alert('Nous ne sommes pas sur ' + $(this).attr('rel'));
        return false;
    });
});

jQuery(document).ready(function() {
    $('.add_to_cart').click(function() {
        $.ajax({
            type: "POST",
            dataType: 'text',
            url: "add_to_cart.php",
            data: {id: $(this).attr('rel')},
            beforeSend: function(xhr) {

            }
        })
                .done(function(data) {
                    $('#result_add_to_cart').html(data);
                });
    });
});