<?php

$action = $_GET['action'];

/**
 * pour déterminer l'action appelée dans l'URL
 */
switch ($action) {
    case "clearAllCart":
        clearAllCart();
        break;
    case "deleteOneQuantityItem":
        deleteOneQuantityItem();
        break;
    case "deleteItem":
        deleteItem();
        break;
    case "addToCart":
        addToCart();
        break;
    default:
        break;
}

/**
 *
 * @return type
 */
function clearAllCart() {
    include_once 'includes/all.include.php';
    $all_cart = $cart->get('cart');
    foreach ($all_cart as $key => $value) {
        $product = new products();
        $product->selectById($value['id']);
        if (isset($value['nbcart']))
            $product->updateQuantity($product->getNumber() + $value['nbcart']);
        else
            $product->updateQuantity($product->getNumber() + 1);
    }
    $cart->clearAll();
    echo json_encode("ok");
}

/**
 * AJAX -
 */
function deleteOneQuantityItem() {
    include_once 'includes/all.include.php';
    $product = new products();
// recupération en GET de l'id
    $id = $_POST['id'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
    if (!$id || !$product->exist('id = ' . $id))
        header('Location: erreur.php');
// on delete du panier
    $cart->removeOneItem($id);
    $product->selectById($id);
// on ajoute un en plus dans le stock
    $product->updateQuantity($product->getNumber() + 1);
// nombre de produit dans le panier
    $nb_product_in_cart = sizeof($cart->get('cart'));
// on renvoit du texte
    $return = array();
//$return['message'] = "Le produit ".$mon_produit['title']." a bien été ajouté au panier !";
    $return['nb_product_cart'] = $nb_product_in_cart;
    echo json_encode($return);
}

/**
 *
 */
function deleteItem() {
    include_once 'includes/all.include.php';
    $product = new products();
// recupération en GET de l'id
    $id = $_POST['id'];
    $number = $_POST['number'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
    if (!$id || !$product->exist('id = ' . $id))
        header('Location: erreur.php');
// on delete du panier
    $cart->removeItem($id);
// on récupère le produit (pour ensuite mettre a jour la quantité)
    $product->selectById($id);
// on ajoute un en plus dans le stock
    $product->updateQuantity($product->getNumber() + $number);
// nombre de produit dans le panier
    $nb_product_in_cart = sizeof($cart->get('cart'));
// on renvoit du texte
    $return = array();
    $return['nb_product_cart'] = $nb_product_in_cart;
    echo json_encode($return);
}

/**
 *
 */
function addToCart() {
    include_once 'includes/all.include.php';
    $product = new products();
// recupération en GET de l'id
    $id = $_POST['id'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
    if (!$id || !$product->exist('id = ' . $id))
        header('Location: erreur.php');
// on recupere le produit dans la base
    $mon_produit_tableau = $product->selectById($id);
// on ajoute au panier
    $cart->add($mon_produit_tableau);
// on met a jour la quantité dans la base de données
    $product->updateQuantity($product->getNumber() - 1);
// nombre de produit dans le panier
    $nb_product_in_cart = sizeof($cart->get('cart'));
// on renvoit du texte
    $return = array();
    $return['message'] = "Le produit " . $mon_produit_tableau['title'] . " a bien été ajouté au panier !";
    $return['nb_product_cart'] = $nb_product_in_cart;
    $return['quantity'] = $product->getNumber();
    echo json_encode($return);
}
