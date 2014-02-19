<?php
include_once 'layout/header.php';
$model_product = new products();
$lesproduitspromo = $model_product->getAll();
?>
<div class="portfolio portfolio-page container">
    <div class="portfolio-title">
        <h3>Tous nos Robots</h3>
    </div>
    <div class="row">
        <?php foreach ($lesproduitspromo as $k => $v): ?>

            <div class="work span3">
                <img src="data:image/gif;base64,<?php echo $v['imgbase64'] ?>" alt="" style="height: 237px">
                <h4><?php echo $v['title'] ?></h4>
                <p><?php echo $v['description'] ?></p>
                <p class="page_product_price">$<?php echo $v['price'] ?></p>
                <div class="icon-awesome">
                    <a href="product_detail.php?id=<?php echo $v['id'] ?>" class="link_with_tooltip" title="Voir la fiche du produit <?php echo $v['title'] ?>"><i class="icon-tag"></i></a>
                    <a href="#" class="link_with_tooltip add_to_cart" rel="<?php echo $v['id'] ?>" title="Ajouter le produit <?php echo $v['title'] ?> au panier"><i class="icon-shopping-cart"></i></a>
                </div>
            </div>
        <?php endforeach; ?>
    </div>
</div>
<?php include_once 'layout/footer.php'; ?>