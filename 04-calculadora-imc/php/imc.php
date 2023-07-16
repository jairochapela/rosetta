<?php

echo "Calculadora de IMC\n";
$peso = readline("Introduzca su peso en kg: ");
$altura = readline("Introduzca su altura en m: ");
$imc = $peso / ($altura * $altura);
echo "Su IMC es: $imc\n";