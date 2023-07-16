<?php

$texto = readline("Introduzca un texto: ");
$caracter = readline("Introduzca un caracter: ");

$contador = 0;
for ($i = 0; $i < strlen($texto); $i++) {
    if ($texto[$i] == $caracter) {
        $contador++;
    }
}

echo "El caracter $caracter aparece $contador veces en el texto";