<?php
include_once 'includes/all.include.php';


$database = new medoo('projet_cpe');

$datas = $database->select("registered_user", "*");


$last_user_id = $database->insert("registered_user", [
	"user_name" => "foo",
	"email" => "foo@bar.com",
	"age" => 25,
	"lang" => ["en", "fr", "jp", "cn"]
]);

echo "<pre>";
print_r($datas);

