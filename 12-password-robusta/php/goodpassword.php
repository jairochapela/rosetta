<?php

function good_password($password) {
    $length = strlen($password);
    if ($length < 8) {
        return false;
    }
    $has_upper = false;
    $has_lower = false;
    $has_digit = false;
    for ($i = 0; $i < $length; $i++) {
        $char = $password[$i];
        if (ctype_upper($char)) {
            $has_upper = true;
        } elseif (ctype_lower($char)) {
            $has_lower = true;
        } elseif (ctype_digit($char)) {
            $has_digit = true;
        }
    }
    return $has_upper && $has_lower && $has_digit;
}

$password = readline("Introduzca una contraseña: ");
if (good_password($password)) {
    echo "Contraseña válida\n";
} else {
    echo "La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial\n";
}