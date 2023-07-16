<?php

$n = intval(readline("Introduzca un número: "));
$suma = 0;
for ($i = 1; $i <= $n; $i++) {
    $suma += $i;
}
echo "La suma de los $n primeros números es: $suma\n";