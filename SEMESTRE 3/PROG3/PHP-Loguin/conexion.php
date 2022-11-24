<?php

$host = "localhost";
$user = "root";
$password = "mysql";
$dbname = "loguin";

$con = new mysqli($host, $user, $password, $dbname);

if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}