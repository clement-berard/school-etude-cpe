<?php

class session {

    function __construct() {
        session_start();
    }

    public static function add($key, $value) {
        $_SESSION[$key] = $value;
    }

    public static function get($key) {
        if (isset($_SESSION[$key]))
            return $_SESSION[$key];
    }

}

?>