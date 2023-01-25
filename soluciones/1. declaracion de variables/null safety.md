# Solucion a los enunciados de Null safety

## Enunciado 1

Declara una variable llamada "nombre" que no pueda ser nula y asígnale un valor.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val nombre: String = "John"
}
  ```
</details>

## Enunciado 2

Declara una variable llamada "apellido" que pueda ser nula y asígnale un valor nulo.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val apellido: String? = null
}
  ```
</details>


## Enunciado 3

Utiliza el operador "?:" para proporcionar un valor por defecto si una variable es nula.

<details>
  <summary>Solucion</summary>

En Kotlin se puede utilizar el operador "?:" para proporcionar un valor por defecto si una variable es nula. Este operador se conoce como el operador Elvis y se utiliza para proporcionar un valor alternativo si la variable a la izquierda del operador es nula. El operador "?:" se utiliza de la siguiente manera:
  
  ```kotlin
 val name: String? = null
val defaultName = "John Doe"
val finalName = name ?: defaultName
  ```

En este ejemplo, se declara una variable name con un valor nulo. Luego, se declara una variable defaultName con el valor "John Doe". Finalmente, se utiliza el operador "?:" para asignar el valor de name a finalName, si name no es nulo, en caso contrario se asigna el valor de defaultName a finalName.

Es importante notar que el operador "?:" solo se ejecutará si el valor a la izquierda es nulo, si no lo es, se asigna el valor que ya tiene.

</details>

## Enunciado 4

Utiliza el bloque "let" o "run" para ejecutar una acción solo si una variable no es nula.

<details>
  <summary>Solucion</summary>

En Kotlin se pueden utilizar los bloques "let" y "run" para ejecutar una acción solo si una variable no es nula. Ambos bloques son similares en su funcionamiento, pero tienen algunas diferencias en su sintaxis y uso.

El bloque "let" se utiliza para ejecutar una acción en un objeto solo si ese objeto no es nulo. El objeto se pasa como parámetro a una función lambda que se ejecuta solo si el objeto no es nulo. El objeto se puede acceder dentro de la función lambda mediante la variable "it".

```kotlin
val name: String? = "John"
name?.let {
    println("The name is $it")
} 
```
En este ejemplo, se declara una variable name con un valor no nulo "John". Luego, se utiliza el bloque "let" para ejecutar una acción (imprimir el valor de la variable) solo si name no es nulo. En este caso, la acción se ejecutará y se imprimirá "The name is John" en la consola.

Por otro lado, "run" es similar a "let", pero tiene algunas diferencias en su sintaxis y uso. La principal diferencia es que "run" puede devolver un valor y además, el objeto se puede acceder dentro de la función lambda utilizando el "this".

```kotlin
val name: String? = "John"
val length = name?.run {
    println("The name is $this")
    this.length
}
```

En este ejemplo se utiliza "run" para imprimir el valor de la variable y además, se calcula y se asigna el valor de la longitud de la cadena en la variable length, solo si name no es nulo.

</details>
