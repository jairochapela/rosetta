<?php

$texto = readline("Introduzca una frase: ");
$texto = str_replace(" ", "", $texto);
$texto = strtolower($texto);
$reves = strrev($texto);

if ($texto == $reves) {
    echo "Es palíndromo\n";
} else {
    echo "No es palíndromo\n";
}