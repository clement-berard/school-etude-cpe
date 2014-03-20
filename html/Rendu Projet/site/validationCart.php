<?php
/**
 * Page de validation des produits (avant d'acheter)
 */
include_once 'layout/header.php';
// nom de la page (pour le menu)
$page_name = "cart";
// compteur de total de la somme
$total_price = 0;
// récupération de tous les éléments du panier
$all_cart = $cart->get('cart');
// bouleen pour savoir si le panier est vide ou non
$aDesArticles = !empty($all_cart);
?>
<div class="main">
    <div id="page_cart_validation">
        <h3>Valider vos achats</h3>
        <?php
        // pour tous les articles du panier...
        foreach ($all_cart as $key => $value):
            // on calcul le prix total du produit en fonction de la quantité
            $prixActuel = (isset($value['nbcart'])) ? $value['nbcart'] * $value['price'] : $value['price'];
            // on ajoute au prix total de la commande
            $total_price += $prixActuel;
            ?>
            <div class="item">
                <div class="titre"><?php echo $value['title'] ?></div>
                <div class="quantite">
                    Vous en avez commandé <?php echo $value['nbcart'] ?>, ce qui vous fait un total de <?php echo $prixActuel ?>$
                </div>
            </div>
        <?php endforeach; ?>
        <div class="titre_total">
            Total de la commande : <?php echo $total_price ?>$,
            <a href="#"> je payes !</a>
        </div>
    </div>
</div>
<?php include_once 'layout/footer.php'; ?>
