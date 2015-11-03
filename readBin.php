<?php

$myfile = fopen("C:/wamp/www/assignment1/out.bin", "r") or die("Unable to open file!");

$binstr = binStr($myfile);
echo fread($binstr,filesize("out.bin"));

fclose($binstr);

?>