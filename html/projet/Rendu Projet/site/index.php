<?php
// page d'index, avec le slider
include_once 'layout/header.php';
include_once('layout/slider.php');
$page_name = "index";
?>
<div class="main">
    <section class="cols">
        <div class="col">
            <h3>A propos de nous</h3>
            <h5>RobotWithMe, l'entreprise qui facilite votre vie dans la création de robots</h5>
            <p>Depuis 10 ans, nous nous efforcons de créer de véritables appareils qui vous facilite le quotidien. De la domotique au appareil pour les handicapés, nous ne cessons de redoubler d'effort pour vous donner le meilleur</p>
        </div>

        <div class="col">
            <h3>Nos sponsors</h3>
            <img src="assets/images/sponsors/iRobot_Roomba_logo.gif" alt="" class="image-index"/>
            <img src="assets/images/sponsors/robot_start_pme_logo_1.jpg" alt="" class="image-index"/>
        </div>

        <div class="col">
            <h3>Nous contacter</h3>
            <ul>
                <address>
                    RobotWithMe<br>
                    Boulevard du Robot <br>
                    10101, iRobot, R2D2, Pandora<br>
                    Tél: 0039 333 12 68 347 <br>
                </address>
            </ul>
        </div>
        <div class="cl">&nbsp;</div>
    </section>

</div>


<?php include_once 'layout/footer.php'; ?>

