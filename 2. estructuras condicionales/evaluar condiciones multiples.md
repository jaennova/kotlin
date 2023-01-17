# Uso de paréntesis para evaluar condiciones múltiples

En Kotlin, puedes utilizar paréntesis para evaluar múltiples condiciones en una sola sentencia "if" o "when". Esto te permite escribir código más limpio y legible.

Por ejemplo, en una sentencia "if", puedes evaluar varias condiciones utilizando el operador lógico "&&" (AND lógico) o "||" (OR lógico):

```kotlin
if (condicion1 && conditcon2) {
    // c odigo que se ejecuta si las dos expresiones son verdaderas
}
```

```kotlin
if (condicion1 || condicion2) {
    // codigo que se ejecuta si alguna de las condiciones son verdaderas
}
```

En una sentencia "when", puedes evaluar varias condiciones utilizando el símbolo ",":

```kotlin
when (expression) {
    1, 2, 3 -> // codigo que se ejecuta si el valor es 1, 2, o 4
    4 -> // codigo que se ejecuta si el valor es 4
    else -> // codigo que se ejecuta si no es ninguna de las anteriores
}
```

En resumen, el uso de paréntesis para evaluar múltiples condiciones en una sola sentencia "if" o "when" es una buena práctica de programación que te permite escribir código más limpio y legible. Te ayuda a mantener una mejor organización y lectura del código.
