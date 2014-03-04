<?php

class users extends parents {

    private $id;
    private $firstname;
    private $lastname;
    private $age;
    private $email;
    private $useTable = 'registered_user';

    function __construct() {
        parent::__construct($this->useTable);
    }

    public function getId() {
        return $this->id;
    }

    public function getFirstname() {
        return $this->firstname;
    }

    public function getLastname() {
        return $this->lastname;
    }

    public function getAge() {
        return $this->age;
    }

    public function getEmail() {
        return $this->email;
    }

    public function getUseTable() {
        return $this->useTable;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function setFirstname($firstname) {
        $this->firstname = $firstname;
    }

    public function setLastname($lastname) {
        $this->lastname = $lastname;
    }

    public function setAge($age) {
        $this->age = $age;
    }

    public function setEmail($email) {
        $this->email = $email;
    }

    public function setUseTable($useTable) {
        $this->useTable = $useTable;
    }





}

?>