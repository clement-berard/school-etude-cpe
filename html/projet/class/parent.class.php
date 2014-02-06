<?php

class parents {

    protected $db;
    private $useTable;

    function __construct($useTable) {
        $this->db = new medoo('projet_cpe');
        $this->useTable = $useTable;
    }

    /**
     * retourn toutes les entitées d'une table
     * @return type
     */
    public function getAll() {
        return $this->db->select($this->useTable, "*");
    }

    public function select($columns = '*', $where = null) {
        return $this->db->select($this->useTable, $columns, $where);
    }

    public function onlyItemsWithLimitOf($i = null) {
        $a = $this->db->select($this->useTable, 'title', ["LIMIT" => $i] );
        return $a;
    }

}

?>