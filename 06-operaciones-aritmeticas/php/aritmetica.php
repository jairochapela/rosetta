<?php

$a = floatval(readline("Introduzca un número: "));
$b = floatval(readline("Introduzca otro número: "));
$operacion = readline("Introduzca la operación a realizar (+, -, *, /): ");

if ($operacion == "+") {
    echo "El resultado de la suma es: " . ($a + $b);
} elseif ($operacion == "-") {
    echo "El resultado de la resta es: " . ($a - $b);
} elseif ($operacion == "*") {
    echo "El resultado de la multiplicación es: " . ($a * $b);
} elseif ($operacion == "/") {
    echo "El resultado de la división es: " . ($a / $b);
} else {
    echo "Operación no válida";
}

