# Declaración de variables sin tipo (Any, Any?, Unit)

## Any

En Kotlin, la palabra clave "Any" se utiliza para declarar una variable que puede contener cualquier tipo de valor. Por ejemplo:

```kotlin
var variable: Any = "Hola mundo"
variable = 10
```

En el ejemplo anterior, la variable "variable" se inicializa con una cadena, pero luego se asigna un valor numérico.

## Any?

La palabra clave "Any?" se utiliza para declarar una variable opcional que también puede contener cualquier tipo de valor. Por ejemplo:

```kotlin
var variable: Any? = null
```

En este ejemplo, "variable" puede contener cualquier tipo de valor, pero también puede ser nula.

## Unit

La palabra clave "Unit" se utiliza para declarar una función o una propiedad que no devuelve ningún valor. Por ejemplo:

```kotlin
fun imprimirMensaje() : Unit {
    println("Hola mundo")
}
```

En este ejemplo, la función "imprimirMensaje" no devuelve ningún valor, y se utiliza la palabra clave "Unit" para indicarlo.

En resumen, "Any" se utiliza para declarar una variable que puede contener cualquier tipo de valor, "Any?" se utiliza para declarar una variable opcional que también puede contener cualquier tipo de valor y "Unit" se utiliza para declarar una función o propiedad que no devuelve ningún valor.