<?php
$conn = new mysqli("localhost","root","","myband_db");

if ($mysqli -> connect_errno) {
    echo "Failed to connect to MySQL Database: " . $mysqli ->
 connect_error;
   exit();
}

?>
