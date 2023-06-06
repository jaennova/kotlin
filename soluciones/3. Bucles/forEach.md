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

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 4

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 5

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 6

.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
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

