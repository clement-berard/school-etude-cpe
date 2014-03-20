<?php
include_once 'layout/header.php';
$page_name = "inscription";
?>



<?php
// traitement de la requete post
$aDuPost = !empty($_POST);
if ($aDuPost) {
    $mes_donnees = $_POST;
    $model_user = new users();
    $good = $model_user->add($mes_donnees);

    if($good = 1){
        echo '<script type="text/javascript">showNotif("Votre inscription a été faite avec succès !","success");</script>';
    }
    else{
        echo '<script type="text/javascript">showNotif("Une erreur est survenue","error");</script>';
    }
}
?>
<div class="main">
    <div id="page_inscription">
    <h3>Créer votre compte RobotWithMe</h3>
        <div id="form_inscription">

            <p>En créant un compte sur RobotWithMe, vous pourrez mettre des produits dans votre panier et aussi voir les produits ! (eh oui !) Alors c'est partit, remplissez le formulaire ci-dessous !</p>
            <form id="formulaire_enregistrement" action="inscription" method="POST" >
                <label for="firstname">Prénom</label>
                <input id="firstname" name="firstname" type="text" required />
                <label for="lastname">Nom</label>
                <input id="lastname" name="lastname" type="text" required />

                <label for="age">Age</label>
                <select id="age" name="age" required >
                    <option value=""> </option>
                    <?php
                    for ($i = 16; $i <= 90; $i++)
                        echo '<option value="' . $i . '">' . $i . '</option>';
                    ?>
                </select>
                <label for="email">E-Mail</label>
                <input id="email" type="email" name="email" required/>
                <input type="submit" />
            </form>
        </div>
    </div>



</div>
<?php include_once 'layout/footer.php'; ?>