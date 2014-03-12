/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    /**
     *
     */

});

/**
 * Fonction pour mettre en actif le bon onglet du
 * menu
 * @param {type} page_name
 * @returns {undefined}
 */
function changeActiveMenu(page_name) {
    // selecteur du menu
    var menu_global = $('#menu_global');
    // on supprime toutes les classes actives du menu (li)
    menu_global.find('li').each(function() {
        $(this).removeClass("active");
    });
    // on cherche le bon li avec le bon data-attribute
    var active = menu_global.find("[data-pagename='" + page_name + "']");
    // on lui ajoute la classe active
    active.addClass('active');
}