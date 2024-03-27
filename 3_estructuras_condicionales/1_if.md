# Sentencia if

La sentencia "if" en Kotlin se utiliza para ejecutar un bloque de código si una determinada condición se evalúa como verdadera. La sintaxis básica es la siguiente:

```kotlin
if (condition) {
    // codigo que se ejecuta si la condicion es verdadera
}
```

La condición puede ser cualquier expresión que devuelva un valor booleano (verdadero o falso). Puedes utilizar operadores lógicos y de comparación para crear condiciones más complejas.

También puedes utilizar la sentencia "else" para ejecutar un bloque de código si la condición es falsa:

```kotlin
if (condition) {
    // codigo que se ejecuta si la condicion es verdadera
} else {
    // codigo que se ejecuta si la condicion no es verdadera
}
```

Kotlin también proporciona la sentencia "else if" para comprobar múltiples condiciones:

```kotlin
if (condicion1) {
    // codigo que se ejecuta si la condicion es verdadera
} else if (condicion2) {
    // codigo que se ejecuta si la condicion1 es falsa y la condicion2 es verdadera
} else {
    // codigo que se ejecuta si ambas condiciones son falsas
}
```

En resumen, la sentencia "if" es una herramienta esencial en cualquier lenguaje de programación, y Kotlin no es una excepción. Te permite controlar el flujo de ejecución de tu código de acuerdo a diferentes condiciones.