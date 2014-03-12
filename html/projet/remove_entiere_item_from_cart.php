<?php

include_once 'includes/all.include.php';
$model_product = new products();
// recupération en GET de l'id
$id = $_POST['id'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
if (!$id || !$model_product->exist('id = ' . $id))
    header('Location: erreur.php');
// on delete du panier
$cart->removeItem($id);
// nombre de produit dans le panier
$nb_product_in_cart = sizeof($cart->get('cart'));
// on renvoit du texte
$return = array();
//$return['message'] = "Le produit ".$mon_produit['title']." a bien été ajouté au panier !";
$return['nb_product_cart'] = $nb_product_in_cart;
echo json_encode($return);
?>
