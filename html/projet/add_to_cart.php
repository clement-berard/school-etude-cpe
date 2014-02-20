<?php
include_once 'includes/all.include.php';
$model_product = new products();
// recupération en GET de l'id
$id = $_POST['id'];
// si l'id est null ou si il n'existe pas en base, erreur (redirection)
if (!$id || !$model_product->exist($id))
    header('Location: erreur.php');
// on recupere le produit dans la base
$mon_produit = current($model_product->select('*', ["id" => $id]));
// on ajoute au panier
$cart->add($mon_produit);
// nombre de produit dans le panier
$nb_product_in_cart = sizeof($session->get('cart'));
?>
<?php // création de la div pour la modal bootstrap  ?>
<div id="ma_modal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <h4>Le produit <?php echo $mon_produit['title'] ?> a bien été ajouté au panier</h4>
            <h5>Vous avez <?php echo $nb_product_in_cart ?> articles dans votre panier</h5>
            <a type="button" href="#" class="btn btn-default" onclick="$('#ma_modal').modal('hide');">Continuer les achats</a> <a type="button" href="cart.php" class="btn btn-success">Aller au panier</a>
        </div>
    </div>
</div>
<script type="text/javascript">
    // on ouvre la modal
    $('#ma_modal').modal();
</script>