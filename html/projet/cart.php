<?php include_once 'layout/header.php'; ?>

<!-- Page Title -->
<div class="page-title">
    <div class="container">
        <div class="row">
            <div class="span12">
                <i class="icon-shopping-cart page-title-icon"></i>
                <h2>Mon panier /</h2>
                <p>liste de vos produits</p>
                <button class="button_clear_cart btn btn-default"><i class="icon-trash"></i> Vider le panier</button>
            </div>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="span12">

            <?php
            // on recupère tous les éléments du panier
            $all_cart = $session->get('cart');
//        echo "<pre>";
//        print_r($all_cart);
            ?>

            <?php if (!empty($all_cart)) { ?>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th></th>
                            <th>Produit</th>
                            <th>Prix</th>
                            <th>Qté</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php foreach ($all_cart as $key => $value): ?>
                        <tr>
                            <td><img style="width: 25px;height: 25px" src="data:image/gif;base64,<?php echo $value['imgbase64'] ?>" /></td>
                            <td><?php echo $value['title'] ?></td>
                            <td><?php echo $value['price'] ?></td>
                            <td><?php echo $value['id'] ?></td>
                            <td><span title="Supprimer le produit <?php echo $value['title'] ?>" class="cart_delete_product"><i class="icon-trash"></i></span></td>
                        </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
                <button class="cart_btn_validate btn btn-default">Valider vos achat</button>
            <?php } else { ?>

                <div class="alert alert-info">Votre panier ne contient aucun article</div>

            <?php } ?>
        </div>
    </div>
</div>





<?php include_once 'layout/footer.php'; ?>
