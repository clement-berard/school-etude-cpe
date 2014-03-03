<?php
require_once 'class/medoo.min.php';
require_once 'class/bdd.class.php';
require_once 'class/parent.class.php';
require_once 'class/products.class.php';
require_once 'class/users.class.php';
require_once 'class/session.class.php';
require_once 'class/cart.class.php';
$session = new session();
$cart = new cart($session);
?>