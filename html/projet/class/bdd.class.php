<?php

require_once '/config/private/database.php';

/**
 *
 */
class bdd {

    /**
     *
     * @var type
     */
    private $bdd;

    /**
     *
     */
    public function __construct() {
        $configBDD = new databaseConfig();
        try {
            $this->bdd = new PDO('mysql:host=' . $configBDD->host . ';dbname=' . $configBDD->database . '', '' . $configBDD->user . '', '' . $configBDD->mdp . '');
        } catch (Exception $e) {
            die('Erreur : ' . $e->getMessage());
        }
    }

    /**
     *
     * @param type $req
     * @return type
     */
    private function query($req) {
        $q = $this->bdd->query($req)->fetchAll(PDO::FETCH_ASSOC);
        return $q;
    }

    /**
     *
     * @param type $req
     * @return type
     */
    private function exec($req) {
        $q = $this->bdd->exec($req);
        return $q;
    }

    /**
     *
     * @param type $table
     * @param type $fields
     * @param type $where
     * @return type
     */
    public function select($table = null, $fields = null, $where = null, $limit = null) {
        $req = 'SELECT ';
        $req .= $fields;
        $req .= ' FROM ';
        $req .= $table;
        if ($where != null) {
            $req .= ' WHERE ';
            $req .= $where;
        }
        if ($limit != null) {
            $req .= ' LIMIT ';
            $req .= $limit;
        }
        return $this->query($req);
    }

    /**
     *
     * @param type $table
     * @param type $where
     * @return type
     */
    public function count($table = null, $where = null) {
        $req = 'SELECT COUNT(*) as total FROM ';
        $req .= $table;
        if ($where != null) {
            $req .= ' WHERE ' . $where . ';';
        }
        return current($this->query($req))['total'];
    }

    /**
     *
     * @param type $table
     * @param type $fields
     * @param type $id
     * @return type
     */
    public function selectById($table = null, $fields, $id = null) {
        return current($this->select($table, $fields, 'id = ' . $id));
    }

    /**
     *
     * @param type $table
     * @param type $fields
     * @param type $id
     */
    public function update($table = null, $fields = array(), $id = null) {
        $req = "";
        $req .= "UPDATE " . $table . " ";
        $req .= "SET ";
        foreach ($fields as $key => $value) {
            $req .= $key . " = " . $value . ",";
        }
        $req = substr($req, 0, -1);
        $req .= " WHERE id=" . $id . ";";
        $this->exec($req);
    }

    /**
     *
     * @param type $table
     * @param type $fields
     * @param type $id
     */
    public function insert($table = null, $fields = array()) {
        $req = "";
        $req .= "INSERT INTO " . $table;
        $req .= "(";
        foreach ($fields as $key => $value) {
            $req .= $key . ",";
        }
        $req = substr($req, 0, -1);
        $req .= ") VALUES (";
        foreach ($fields as $key => $value) {
            if(gettype($value) == "string")
                $req .= "'".$value . "',";
            else
                $req .= $value . ",";
        }
        $req = substr($req, 0, -1);
        $req .= ");";
        return $this->exec($req);
    }

}
