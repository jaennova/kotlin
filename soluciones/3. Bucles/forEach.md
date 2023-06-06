# Solucion a los enunciados de For Each

## Enunciado 1

Dado una lista de números enteros, escribe un código que determine si todos los elementos de la lista son pares.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val numeros = listOf(2, 4, 6, 8, 10)

    var todosSonPares = true
    numeros.forEach { numero ->
        if (numero % 2 != 0) {
            todosSonPares = false
            return@forEach
        }
    }

    if (todosSonPares) {
        println("Todos los elementos son pares")
    } else {
        println("No todos los elementos son pares")
    }
}

  ```
</details>

## Enunciado 2

Dado una lista de cadenas de texto, escribe un código que determine si alguna de las cadenas es un palíndromo (se lee igual de izquierda a derecha y de derecha a izquierda).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaCadenas = listOf("radar", "hola", "reconocer", "casa", "ana")

    var hayPalindromo = false

    listaCadenas.forEach { cadena ->
        if (cadena == cadena.reversed()) {
            hayPalindromo = true
            return@forEach  // Se encuentra un palíndromo, se sale del bucle
        }
    }

    if (hayPalindromo) {
        println("Se encontró al menos un palíndromo en la lista.")
    } else {
        println("No se encontraron palíndromos en la lista.")
    }
}

  ```
</details>

## Enunciado 3

Dado una lista de números enteros, escribe un código que calcule la media aritmética de los elementos de la lista.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaNumeros = listOf(5, 10, 15, 20, 25)

    var suma = 0
    var contador = 0

    listaNumeros.forEach { numero ->
        suma += numero
        contador++
    }

    val media = if (contador != 0) suma.toDouble() / contador else 0.0

    println("La media aritmética de los elementos de la lista es: $media")
}

  ```
</details>

## Enunciado 4

Dado una lista de cadenas de texto, escribe un código que determine cuántas de las cadenas tienen más de 5 caracteres.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaCadenas = listOf("Hola", "Programación", "Kotlin", "Lenguaje", "Cadena")

    var contador = 0

    listaCadenas.forEach { cadena ->
        if (cadena.length > 5) {
            contador++
        }
    }

    println("Cantidad de cadenas con más de 5 caracteres: $contador")
}

  ```
</details>

## Enunciado 5

Dado una lista de números enteros, escribe un código que determine si hay algún número impar en la lista.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaNumeros = listOf(2, 4, 7, 10, 12)

    var hayImpar = false

    listaNumeros.forEach { numero ->
        if (numero % 2 != 0) {
            hayImpar = true
            return@forEach  // Se encuentra un número impar, se sale del bucle
        }
    }

    if (hayImpar) {
        println("Hay al menos un número impar en la lista.")
    } else {
        println("No hay números impares en la lista.")
    }
}

  ```
</details>

## Enunciado 6

Dado una lista de cadenas de texto, escribe un código que determine si todas las cadenas tienen más de 5 caracteres.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaCadenas = listOf("Programación", "Kotlin", "Lenguaje", "Cadena")

    var todasMasDe5Caracteres = true

    listaCadenas.forEach { cadena ->
        if (cadena.length <= 5) {
            todasMasDe5Caracteres = false
            return@forEach  // Se encontró una cadena con 5 o menos caracteres, se sale del bucle
        }
    }

    if (todasMasDe5Caracteres) {
        println("Todas las cadenas tienen más de 5 caracteres.")
    } else {
        println("No todas las cadenas tienen más de 5 caracteres.")
    }
}

  ```
</details>

## Enunciado 7

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 8

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 9

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 10

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 11

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 12

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 13

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 14

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 15

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 16

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 17

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 18

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 19

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 20

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

