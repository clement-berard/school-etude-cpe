<?php
// initialisation du chemin des images :
$images_slider = array(
    "1" => array(
        "url" => "assets/images/slider/robotic_pet.png",
        'title' => "Haute qualité",
        'description' => "Nous garentissons des produits d'une qualité execptionnelle, resistants, surprenant !"
    ),
    "2" => array(
        "url" => "assets/images/slider/robot.png",
        'title' => "Pour toutes les utilisations !",
        'description' => "La diversité de nos produits sont des meilleurs. Avec nous, chacun de vos problèmes trouvent une solution"
    ),
    "3" => array(
        "url" => "assets/images/slider/Robot-Arm-stock5858-large.png",
        'title' => "Des robots pour l'homme",
        'description' => "Nos ingénieurs travaillent sans relâche pour améliorer les robots dans le milieu médical"
    ),
    "4" => array(
        "url" => "assets/images/slider/confiance.jpg",
        'title' => "Plus qu'un service, une garentie de performance !",
        'description' => "Nos produits, conçus avec notre plus grand savoir faire, est une garantie de performance au quotidient, et nous avons le meilleur service après vente !"
    )
);
?>
<div class="slider-holder">
    <!-- slider -->
    <div class="slider">
        <div class="arrs">
            <a href="#" class="prev-arr"></a>
            <a href="#" class="next-arr"></a>
        </div>
        <ul>
            <?php foreach ($images_slider as $key => $value) : ?>
                <li id="img<?php echo $key ?>">
                    <div class="slide-cnt">
                        <h4><?php echo $value['title'] ?></h4>
                        <p><?php echo $value['description'] ?></p>
                    </div>
                    <img style="width:398px;height:365px" src="<?php echo $value['url'] ?>" alt="<?php echo $value['title'] ?>" />
                </li>
            <?php endforeach; ?>
        </ul>
    </div>
    <!-- end of slider -->
    <!-- thumbs -->
    <div id="thumbs-wrapper">
        <div id="thumbs">
            <?php foreach ($images_slider as $k => $v) : ?>
                <?php
                if ($key == 1) {
                    echo '<a href="#img' . $k . '" class="selected"><img  src="' . $v['url'] . '" alt="' . $v['title'] . '"/></a>';
                } else {
                    echo '<a href="#img' . $k . '" ><img  src="' . $v['url'] . '" alt="' . $v['title'] . '"/></a>';
                }
                ?>
            <?php endforeach; ?>
        </div>
        <a id="prev" href="#"></a>
        <a id="next" href="#"></a>
    </div>
    <!-- end of thumbs -->
</div>

