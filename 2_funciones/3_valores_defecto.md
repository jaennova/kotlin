# Funciones con parámetros opcionales y valores por defecto

En Kotlin, las funciones pueden tener parámetros opcionales y valores por defecto. Los parámetros opcionales son aquellos que no son necesarios para que la función funcione correctamente, y los valores por defecto son los valores que se asignan a los parámetros opcionales si no se especifica un valor al momento de llamar a la función.

Para especificar un parámetro opcional, se coloca el signo "?" después del tipo de datos del parámetro. Por ejemplo, aquí está una función que imprime un saludo, con un parámetro opcional "nombre":

```kotlin
fun saludar(nombre: String? = "amigo") {
    println("Hola, $nombre!")
}
```

en este caso, "nombre" es un parámetro opcional y se le asigna un valor por defecto "amigo"

También se puede especificar un valor por defecto para un parámetro opcional utilizando el operador "=" seguido del valor por defecto.

En este caso, si no se especifica un valor para "nombre" al momento de llamar a la función, se imprimirá "Hola, amigo!". Sin embargo, si se especifica un valor para "nombre", se imprimirá "Hola, [nombre especificado]!"

Es importante tener en cuenta que los parámetros opcionales y los valores por defecto son una forma de hacer que las funciones sean más flexibles y fáciles de usar, pero también pueden hacer que el código sea menos legible si se abusa de ellos. Por lo tanto, es importante utilizarlos con moderación y siempre asegurarse de que el código siga siendo legible y fácil de entender.