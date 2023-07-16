<?php

$fecha_nacimiento = readline("Introduzca su fecha de nacimiento (dd/mm/aaaa): ");
$f_nac = date_create_from_format("d/m/Y", $fecha_nacimiento);
$fecha_actual = new DateTime();
$edad = $fecha_actual->diff($f_nac);
if ($edad->y >= 18) {
    echo "Eres mayor de edad\n";
} else {
    echo "Eres menor de edad\n";
}