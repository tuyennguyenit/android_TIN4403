<?php
/**
 * Created by PhpStorm.
 * User: TuyenNguyen
 * Date: 10/29/2018
 * Time: 9:14 AM
 */
$conn = mysqli_connect('localhost', 'root', '', 'db_android') or die ('Không thể kết nối tới database');
$sql = "INSERT INTO account(user_name, password, email) VALUES ('tutu1', 'tata','titi')";

if(mysqli_query($conn, $sql)){
    echo 'insert thành công';
}

mysqli_close($conn);