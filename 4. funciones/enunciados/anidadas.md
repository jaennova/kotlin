# Funciones anidadas

En Kotlin, las funciones pueden ser anidadas, lo que significa que una función puede ser definida dentro de otra función. Una función anidada tiene acceso a las variables y parámetros de la función padre, y puede ser llamada desde dentro de la función padre.

Por ejemplo, aquí está una función llamada "imprimirSaludo" que contiene una función anidada llamada "saludar":

```kotlin
fun imprimirSaludo() {
    val saludo = "Hola, mundo!"
    fun saludar() {
        println(saludo)
    }
    saludar()
}
```

En este caso, la función "saludar" está anidada dentro de la función "imprimirSaludo" y tiene acceso a la variable "saludo" de la función padre. La función "saludar" se llama dentro de la función "imprimirSaludo" y se imprime "Hola, mundo!".

Las funciones anidadas son útiles para organizar el código y para aislar funcionalidades específicas de una función. Además, las funciones anidadas tienen acceso a las variables y parámetros de la función padre, lo que las hace útiles para crear funciones auxiliares que utilizan información de la función padre. Sin embargo, es importante tener en cuenta que el uso excesivo de funciones anidadas puede hacer que el código sea menos legible y más difícil de entender.