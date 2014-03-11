<?php include_once 'layout/header.php'; ?>



<div class="main">

    <div id="page_cart">
        <h3>Votre panier</h3>
        <?php
        // on recupère tous les éléments du panier
        $all_cart = $cart->get('cart');
//        echo "<pre>";
//        print_r($all_cart);die;
        ?>

        <?php if (!empty($all_cart)) { ?>
            <table>
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
                            <td><img alt="<?php echo $value['title'] ?>" src="data:image/gif;base64,<?php echo $value['imgbase64'] ?>" /></td>
                            <td><?php echo $value['title'] ?></td>
                            <td><?php echo (isset($value['nbcart'])) ? $value['nbcart']*$value['price'] : $value['price'] ?></td>
                            <td><?php echo (isset($value['nbcart'])) ? $value['nbcart'] : 1 ?></td>
                            <td><button class="cart_delete_item" data-id="<?php echo $value['id'] ?>">Supprimer</button></td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        <div id="contain_valid_button">
                        <button class="cart_btn_validate">Valider vos achats</button>
        </div>
        <?php } else { ?>

            <div class="alert alert-info">Votre panier ne contient aucun article</div>

        <?php } ?>
    </div>

</div>





<?php include_once 'layout/footer.php'; ?>
