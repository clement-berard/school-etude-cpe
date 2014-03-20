<?php

class session {

    function __construct() {
        session_start();
    }

    public function add($key, $value) {
        $_SESSION[$key] = $value;
    }

    public function get($key) {
        if (isset($_SESSION[$key]))
            return $_SESSION[$key];
    }

    public function remove($key) {
        if (isset($_SESSION[$key]))
            unset($_SESSION[$key]);
    }

    public function exist($key) {
        return isset($_SESSION[$key]);
    }

}

?>