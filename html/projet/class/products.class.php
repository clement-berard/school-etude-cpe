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
        $e = $this->db->selectById($this->useTable, $this->allFields,$id);
        $this->id = $id;
        $this->number = $e['number'];
        return $e;
    }

    /**
     *
     * @param type $quantity
     */
    public function updateQuantity($quantity = null){
        if(!is_null($quantity)){
            $this->db->update($this->useTable,array('number' => $quantity),  $this->id);
            $this->number = $quantity;
        }
    }

    public function getNumber() {
        return $this->number;
    }



}

?>