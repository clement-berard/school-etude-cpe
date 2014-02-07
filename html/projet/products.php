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
                <img src="data:image/gif;base64,<?php echo $v['imgbase64'] ?>" alt="">
                <h4><?php echo $v['title'] ?></h4>
                <p><?php echo $v['description'] ?></p>
                <div class="icon-awesome">
                    <a href="assets/img/portfolio/work1.jpg" rel="prettyPhoto"><i class="icon-search"></i></a>
                    <a href="portfolio.html"><i class="icon-link"></i></a>
                </div>
            </div>



        <?php endforeach; ?>

    </div>


</div>
<?php include_once 'layout/footer.php'; ?>