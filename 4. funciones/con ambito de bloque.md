# Funciones con ambito de bloque

En Kotlin, las funciones pueden tener un ámbito de bloque, lo que significa que solo están disponibles dentro del bloque de código en el que se declararon. Un bloque de código es un conjunto de instrucciones rodeadas por llaves `{ }`.

Por ejemplo, aquí está una función llamada "ejemploAmbitoBloque" que contiene una función anidada llamada "saludar":

```kotlin
fun ejemploAmbitoBloque() {
    val saludo = "Hola, mundo!"
    fun saludar() {
        println(saludo)
    }
    saludar()
}
```

En este caso, la función "saludar" está disponible solo dentro del bloque de código de la función "ejemploAmbitoBloque", y no puede ser llamada desde fuera de esta función.

El ámbito de bloque es útil para evitar colisiones de nombres y para aislar funcionalidades específicas de una función. Sin embargo, es importante tener en cuenta que las funciones con ámbito de bloque solo son accesibles dentro del bloque de código en el que se declararon, lo que significa que no pueden ser reutilizadas en otras partes del código.