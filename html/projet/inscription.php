<?php include_once 'layout/header.php'; ?>



<?php
// traitement de la requete post
$aDuPost = !empty($_POST);

if ($aDuPost) {
    $mes_donnees = $_POST;
    $model_user = new users();
    $good = $model_user->add($mes_donnees);

    if($good){
        echo '<div class="alert alert-success">Votre inscription a été faite avec succès !</div>';
    }
    else{
        echo '<div class="alert alert-danger">Une erreur est survenue lors de votre inscription</div>';
    }
}
?>
<!-- Page Title -->
<div class="page-title">
    <div class="container">
        <div class="row">
            <div class="span12">
                <i class="icon-envelope-alt page-title-icon"></i>
                <h2>Inscription /</h2>
                <p>Créer votre compte RobotWithMe</p>
            </div>
        </div>
    </div>
</div>

<!-- Contact Us -->
<div class="contact-us container">
    <div class="row">
        <div class="span7">

            <p>En créant un compte sur RobotWithMe, vous pourrez mettre des produits dans votre panier et aussi voir les produits ! (eh oui !) Alors c'est partit, remplissez le formulaire ci-dessous !</p>
            <form id="formulaire_enregistrement" action="inscription.php" method="POST" >
                <label for="firstname">Prénom</label>
                <input id="firstname" name="firstname" minlength="2" type="text" required/>
                <label for="lastname">Nom</label>
                <input id="lastname" name="lastname" minlength="2" type="text" required/>
                <label for="age">Age</label>
                <select id="age" name="age" required>
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
        <div class="contact-address span5">
            <h4>Où nous trouver ?</h4>
            <div class="map"></div>
            <h4>Adresse</h4>
            <p>Boulevard du Robot <br> 10101, iRobot, R2D2, Pandora</p>
            <p>Tél: 0039 333 12 68 347</p>
        </div>
    </div>



</div>
<?php include_once 'layout/footer.php'; ?>