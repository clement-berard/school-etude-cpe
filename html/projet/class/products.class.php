<?php

/**
 *
 */
class products extends parents {

    private $id;
    private $imagebase64;
    private $title;
    private $description;
    private $price;
    private $number;
    private $useTable = "productlist";
    protected $allFields = 'id,imgbase64,title,description,price,number';

    /**
     *
     */
    function __construct() {
        parent::__construct($this->useTable);
    }

    /**
     *
     * @param type $id
     */
    public function selectById($id = null) {
        return $this->db->selectById($this->useTable, $this->allFields,$id);
    }

    /**
     *
     * @return type
     */
    public function getId() {
        return $this->id;
    }

    /**
     *
     * @return type
     */
    public function getImagebase64() {
        return $this->imagebase64;
    }

    /**
     *
     * @return type
     */
    public function getTitle() {
        return $this->title;
    }

    /**
     *
     * @return type
     */
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

    /**
     *
     * @param type $number
     */
    public function setNumber($number) {
        $this->number = $number;
    }

}

?>