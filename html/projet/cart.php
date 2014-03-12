<?php
include_once 'layout/header.php';
$page_name = "cart";
?>



<div class="main">

    <div id="page_cart">
        <h3>Votre panier</h3>
        <?php
        // on recupère tous les éléments du panier
        $all_cart = $cart->get('cart');
        $aDesArticles = !empty($all_cart);
//        echo "<pre>";
//        print_r($all_cart);die;
        ?>

        <?php if (!empty($all_cart)) { ?>
            <table id="table_cart">
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
                    <?php
                    foreach ($all_cart as $key => $value):
                        $stockActuel = (isset($value['nbcart'])) ? $value['nbcart'] : 1;
                        $prixActuel = (isset($value['nbcart'])) ? $value['nbcart'] * $value['price'] : $value['price'];
                        ?>
                        <tr id="tr_cart_item_no_<?php echo $value['id'] ?>">
                            <td><img alt="<?php echo $value['title'] ?>" src="data:image/gif;base64,<?php echo $value['imgbase64'] ?>" /></td>
                            <td><?php echo $value['title'] ?></td>
                            <td id="td_cart_item_no_<?php echo $value['id'] ?>"><?php echo $prixActuel ?></td>
                            <td><input type="number" class="cart_number_of_item" data-id="<?php echo $value['id'] ?>" data-olderstock="<?php echo $stockActuel ?>" data-uniqueprice="<?php echo $value['price'] ?>" value="<?php echo $stockActuel ?>" /></td>
                            <td><a href="#" class="cart_delete_item" data-id="<?php echo $value['id'] ?>">Supprimer</a></td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
            <div id="contain_valid_button">
                <button class="cart_btn_validate">Valider vos achats</button>
            </div>
        <?php } ?>

            <div id="empty_cart_div" class="alert alert-info <?php echo ($aDesArticles)? "cachee" : "" ?>">Votre panier ne contient aucun article</div>

    </div>

</div>





<?php include_once 'layout/footer.php'; ?>
