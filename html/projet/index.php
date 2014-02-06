<!DOCTYPE html>
<html>
    <head>
        <title>RobotWithMe</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <link rel="stylesheet" type="text/css" href="css/aboutus.css">
        <link rel="stylesheet" type="text/css" href="plugins/caroussel/css/feature-carousel.css">
        <link href='http://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div id="entete">
            <div id="name">RobotWithMe</div>
        </div>
        <div id="menu">
            <ul id="lemenu">
                <li><a href="index.html" class="active">About us</a></li>
                <li><a href="experiences.html">Products</a></li>
                <li><a href="competenses.html">Inscription</a></li>
            </ul>
        </div>

        <div id="content">
            <div id="content-aboutus">
                <div id="carousel">
                    <div class="carousel-feature">
                        <a href="#"><img class="carousel-image" alt="Image Caption" src="images/sample1.jpg"></a>
                        <div class="carousel-caption">
                            <p>
                                This area is typically used to display captions associated with the images. They are set to hide and fade in on rotation.
                            </p>
                        </div>
                    </div>
                    <div class="carousel-feature">
                        <a href="#"><img class="carousel-image" alt="Image Caption" src="images/sample2.jpg"></a>
                        <div class="carousel-caption">
                            <p>
                                The background will expand up or down to fit the caption.
                            </p>
                        </div>
                    </div>
                    <div class="carousel-feature">
                        <a href="#"><img class="carousel-image" alt="Image Caption" src="images/sample3.jpg"></a>
                        <div class="carousel-caption">
                            <p>
                                Images can be placed here as well.
                            </p>
                        </div>
                    </div>
                    <div class="carousel-feature">
                        <a href="#"><img class="carousel-image" alt="Image Caption" src="images/sample4.jpg"></a>
                    </div>
                    <div class="carousel-feature">
                        <a href="#"><img class="carousel-image" alt="Image Caption" src="images/sample5.jpg"></a>
                        <div class="carousel-caption">
                            <p>
                                The background color of the caption area can be changed using CSS. The opacity can be changed in the options, but it will also change the opacity of the text.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="item aboutus">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, perspiciatis omnis natus officiis inventore sit quidem odio a ad similique iure facere vel optio culpa qui explicabo repudiandae doloribus architecto.
                </div>
                <div class="item sponsors">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, perspiciatis omnis natus officiis inventore sit quidem odio a ad similique iure facere vel optio culpa qui explicabo repudiandae doloribus architecto.

                </div>
                <div class="item contact">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, perspiciatis omnis natus officiis inventore sit quidem odio a ad similique iure facere vel optio culpa qui explicabo repudiandae doloribus architecto.
                    </p>
                    <div class="map-google">
                        <iframe width="250" height="160" frameborder="no" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&hl=fr&geocode=&q=nice&ie=UTF8&z=11&iwloc=addr&om=1&ll=43.76068,7.299728&output=embed&s=AARTsJotOehFyV7Ld4EHPP1WtrZKl2G9Tw"></iframe><br/>

                    </div>
                </div>
            </div>
        </div>
        <div id="piedepage">
            <div id="copyright">Copyright "CPE 4ETI" 2013, tous droits réservés.</div>
        </div>
        <script src="scripts/jquery-1.7.min.js"></script>
        <script src="plugins/caroussel/js/jquery.featureCarousel.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                var carousel = $("#carousel").featureCarousel({
                    // include options like this:
                    // (use quotes only for string values, and no trailing comma after last option)
                    // option: value,
                    // option: value
                });
            });
        </script>
    </body>
</html>
