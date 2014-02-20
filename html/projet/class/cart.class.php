<?php

/**
 *
 */
class cart {

    private $session;
    private $items;
    private $model_product;

    /**
     * constructeur
     * @param type $session
     */
    function __construct($session) {
        $this->session = $session;
        $this->model_product = new products();
        $this->add();
    }

    /**
     * ajout un élément dans le panier
     * @param type $item
     */
    public function add($item = null) {
        if (!$this->session->exist("cart")) {
            $this->session->add("cart", array());
        }
        if ($item != null) {
            $tps = $this->session->get('cart');
            array_push($tps, $item);
            $this->session->add("cart", $tps);
        }
    }

    /**
     *
     * @param type $id_item
     */
    public function removeItem($id_item = null) {
        if ($id_item != null && $this->model_product->exist($id_item) && $this->session->get('cart')) {
            $tps = $this->session->get('cart');
            foreach ($tps as $key => $value) {
                if ($value['id'] == $id_item)
                    unset($tps[$key]);
            }
            $this->session->add("cart", $tps);
        }
    }

    /**
     * vider tout le panier
     */
    public function clearAll() {
        $this->session->remove('cart');
        $this->add();
    }

}

?>