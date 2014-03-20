<?php
include_once 'layout/header.php';
$page_name = "products";
// init d'un model de product
$model_product = new products();
// recupération en GET de l'id
$id = $_GET['id'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
if (!$id || !$model_product->exist($id))
    header('Location: erreur.php');
// on recupere le produit dans la base
$mon_produit = $model_product->selectById($id);
?>

<div class="main">
    <div id="page_product_detail">
        <h3>Détail du produit <?php echo $mon_produit['title'] ?></h3>

        <?php echo $mon_produit['description'] ?>
        <br>
        <h3 class="price">$<?php echo $mon_produit['price'] ?></h3>
        <button type="button" class="add_to_cart btn_add_to_cart_singleproduct" data-idproduct="<?php echo $mon_produit['id'] ?>">Ajouter au panier</button>

        <div class="image"><img src="data:image/gif;base64,<?php echo $mon_produit['imgbase64'] ?>" /></div>

    </div>

</div>



<?php include_once 'layout/footer.php'; ?>