<?php
include_once 'layout/header.php';
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
<div class="portfolio portfolio-page container">
    <div class="portfolio-title">
        <h3><?php echo $mon_produit['title'] ?></h3>
    </div>
    <div class="row">
        <div class="span6">

            <?php echo $mon_produit['description'] ?>
            <br>
            <h3>$<?php echo $mon_produit['price'] ?></h3>
            <button type="button" class="btn btn-default add_to_cart" rel="<?php echo $mon_produit['id'] ?>"><i class="icon-shopping-cart"></i> Ajouter au panier</button>


        </div>
        <div class="span6"><img src="data:image/gif;base64,<?php echo $mon_produit['imgbase64'] ?>" /></div>

    </div>


</div>

<script type="text/javascript">



</script>

<?php include_once 'layout/footer.php'; ?>