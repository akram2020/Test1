<?php


$handle = fopen('C:/wamp/www/assignment1/out.bin', 'wb');
$txt = "\r\nName		:Muhammad Akram Bin Ahmad  \r\nMatrix No	:2014873252 \r\nGender		:Male \r\nAge		:24 \r\nE-mails		:akram_ahmad2020@yahoo.com \r\nMobile No	:017-5209042 \r\n";


echo "\r\n----- akram's file has been created in binary file type -----";

$str = $txt;
$l = strlen($str);
$result = '';
while ($l--) {
    $result = str_pad(decbin(ord($str[$l])), 8, "0", STR_PAD_LEFT) . ' ' . $result;
}
//print $result;exit;
fwrite($handle, $result); 

fclose($handle);


?>