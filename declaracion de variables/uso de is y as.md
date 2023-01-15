# Uso de `is` y `as`

En Kotlin, `is` se utiliza para comprobar si una variable es de un determinado tipo, mientras que `as` se utiliza para convertir una variable a un determinado tipo.

## Operador is

El operador `is` se utiliza para comprobar el tipo de una variable. Por ejemplo, si queremos comprobar si una variable "x" es un número entero, podemos usar la siguiente sintaxis:

```kotlin
if (x is Int) {
    // código a ejecutar si x es un número entero
}
```

## Operador as

Por otro lado, el operador "as" se utiliza para convertir una variable a un determinado tipo. Por ejemplo, si queremos convertir una variable "y" a un número de punto flotante, podemos usar la siguiente sintaxis:

```kotlin
val yFloat = y as Float
```

Sin embargo, en caso de que el tipo convertido no sea el correcto, se generaría una `exception ClassCastException`. Para evitar esto, Kotlin proporciona dos formas de hacer estas conversiones de manera segura:

* `as?` : si la conversión no es posible devuelve null
* `as!` : si la conversión no es posible provocar una excepción

Ejemplo:

```kotlin
val variable: Any = "hello"
val str = variable as? String  // str = "hello"
val str2 = variable as! String // str2 = "hello"
val str3 = variable as? Int    // str3 = null
val str4 = variable as! Int    // ClassCastException
```

En resumen, "is" se utiliza para comprobar el tipo de una variable y "as" se utiliza para convertir una variable a un determinado tipo. Es importante tener cuidado al usar "as" ya que puede provocar una excepción de tipo ClassCastException si la conversión no es válida. En cambio "as?" y "as!" son seguros para usar ya que devuelve null o provocar excepciones respectivamente.
