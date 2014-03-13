<?php
include_once 'layout/header.php';
$page_name = "products";
$model_product = new products();
$lesproduitspromo = $model_product->getAll();
?>
<div class="main">
    <div id="page_products">
        <h3>Tous nos Robots</h3>


        <?php foreach ($lesproduitspromo as $k => $v): ?>
            <div class="item_product">
                <div class="image">
                    <img src="data:image/gif;base64,<?php echo $v['imgbase64'] ?>" alt="<?php echo $v['title'] ?>" >
                </div>
                <div class="infos">
                    <h4><?php echo $v['title'] ?></h4>
                    <p><?php echo $v['description'] ?></p>
                    <div class="icon-awesome">
                        <a href="product_detail.php?id=<?php echo $v['id'] ?>" class="link_with_tooltip" title="Voir la fiche du produit <?php echo $v['title'] ?>">Voir la fiche</a> |
                        <a href="#" class="add_to_cart" data-idproduct="<?php echo $v['id'] ?>" title="Ajouter le produit <?php echo $v['title'] ?> au panier">Ajouter au panier</a>
                    </div>
                </div>
                <div class="qandp">
                    <p class="page_product_price">
                        $<?php echo $v['price'] ?>
                    </p>
                    <p class="page_product_quantity">
                        Il reste <span id="product_quantity_<?php echo $v['id'] ?>"><?php echo $v['number'] ?></span> pièces
                    </p>

                </div>
            </div>
        <?php endforeach; ?>
    </div>
</div>
<?php include_once 'layout/footer.php'; ?>