<?php

class parents {

    protected $db;
    private $useTable;

    function __construct($useTable) {
        $this->db = new bdd();
        $this->useTable = $useTable;
    }

    /**
     * retourn toutes les entitées d'une table
     * @return type
     */
    public function getAll() {
        return $this->db->select($this->useTable, "*");
    }

    public function select($columns = '*', $where = null, $limit = null) {
        return $this->db->select($this->useTable, $columns, $where, $limit);
    }

    public function exist($where = null) {
        return $this->db->count($this->useTable, $where) != 0;
    }

    public function add($data) {
        return $this->db->insert($this->useTable, $data);
    }

 

}

?>