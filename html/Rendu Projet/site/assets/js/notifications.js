/**
 * petite fonction pour afficher une notification
 * avec noty
 * @param {type} text
 * @param {type} type
 * @returns {undefined}
 */
function showNotif(text, type) {
    var n = noty({
        text: text,
        type: type,
        timeout: 2000
    });
}

