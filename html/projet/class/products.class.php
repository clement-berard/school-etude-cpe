<?php

class products extends parents {

    private $id;
    private $imagebase64;
    private $title;
    private $description;
    private $price;
    private $number;

    private $useTable = "productlist";

    function __construct() {
        parent::__construct($this->useTable);
    }

    public function getId() {
        return $this->id;
    }

    public function getImagebase64() {
        return $this->imagebase64;
    }

    public function getTitle() {
        return $this->title;
    }

    public function getDescription() {
        return $this->description;
    }

    public function getPrice() {
        return $this->price;
    }

    public function getNumber() {
        return $this->number;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function setImagebase64($imagebase64) {
        $this->imagebase64 = $imagebase64;
    }

    public function setTitle($title) {
        $this->title = $title;
    }

    public function setDescription($description) {
        $this->description = $description;
    }

    public function setPrice($price) {
        $this->price = $price;
    }

    public function setNumber($number) {
        $this->number = $number;
    }


}

?>