           <?php

$model_product_slider = new products();
$lesproduits = $model_product_slider->select('*',null,4);
/*echo "<pre>";
print_r($lesproduits);*/

           ?>


            <div class="slider-holder">
                
                <!-- slider -->
                <div class="slider">

                    <div class="arrs">
                        <a href="#" class="prev-arr"></a>
                        <a href="#" class="next-arr"></a>
                    </div>

                    <ul>

					<?php foreach ($lesproduits as $key => $value) : ?>


                        <li id="img<?php echo $value['id']  ?>">
                            <div class="slide-cnt">
                                <h4><?php echo $value['title']  ?></h4>
                                <p>Acor porta mi, non venenatis augue imperdiet quis. Nam faucibus, felis ut suscipit vulputate, tortor quam ultricies neque, eget dignissim elit urna a metus. Aliquam sed quam dui, id lacinia nunc. <a href="product_detail.php?id=<?php echo $value['id'] ?>">Fiche du produit</a></p>
                            </div>
                            <img style="width:398px;height:365px" src="data:image/gif;base64,<?php echo $value['imgbase64'] ?>" alt="<?php echo $value['title']  ?>" />
                        </li>
					




					<?php endforeach; ?>

                    </ul>
                </div>
                <!-- end of slider -->

                <!-- thumbs -->
                <div id="thumbs-wrapper">
                    <div id="thumbs">

					<?php foreach ($lesproduits as $k => $v) : ?>
				

					
						<?php
							if($key == 0){
								echo '<a href="#img'.$v['id'].'" class="selected"><img  src="data:image/gif;base64,'.$v['imgbase64'].'" alt="'.$v['title'].'"/></a>';
							}
							else{
								echo '<a href="#img'.$v['id'].'" ><img  src="data:image/gif;base64,'.$v['imgbase64'].'" alt="'.$v['title'].'"/></a>';
							}
						?>


					<?php endforeach; ?>
                    </div>
                    <a id="prev" href="#"></a>
                    <a id="next" href="#"></a>
                </div>
                <!-- end of thumbs -->
            </div>

