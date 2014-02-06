<?php include_once 'layout/header.php'; ?>
<div id="content">
<?php
$model_product = new products();
echo "<pre>";
print_r($model_product->select('title'));
?>
</div>
<?php include_once 'layout/footer.php'; ?>