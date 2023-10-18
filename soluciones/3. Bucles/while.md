# Solucion a los enunciados del bucle While

## Enunciado 1

Crea una función que reciba una lista de números enteros y un número entero n, y devuelva un mensaje indicando que n se encuentra en la lista en el índice correspondiente. Si n no aparece en la lista, se debe devolver un mensaje indicando que no se encontró.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val listaNumeros = listOf<Int>(1, 2, 3, 4, 5, 6)
    println("ingrese el numero")
    val numero = readln().toInt()


    var indice = 0
    var encontrado = false

    while (indice < listaNumeros.size) {
        if (listaNumeros[indice] == numero) {
            encontrado = true
            break
        }
        indice++
    }

    if (encontrado) {
        println("El número $numero se encuentra en la lista en el índice $indice.")
    } else {
        println("El número $numero no se encontró en la lista.")
    }
    println("la lista era: ${listaNumeros.joinToString()}")
}

  ```
</details>

## Enunciado 2

Crea una función que reciba una lista de números enteros y un número entero n, y devuelva un mensaje indicando que n se encuentra en la lista en el último índice correspondiente. Si n no aparece en la lista, se debe devolver un mensaje indicando que no se encontró.

<details>
  <summary>Solucion</summary>
  
  ```kotlin

  ```
</details>

## Enunciado 3

Crea una función que reciba una lista de números enteros y devuelva una nueva lista con todos los números impares de la lista original.

<details>
  <summary>Solucion</summary>
  
  ```kotlin

  ```
</details>

## Enunciado 4

Crea una función que reciba una lista de números enteros y un número entero n, y devuelva un mensaje indicando si hay al menos un par de números en la lista que sumen n. Si se cumple la condición, se debe devolver un mensaje indicando que se encontró un par de números. Si no se cumple la condición, se debe devolver un mensaje indicando que no se encontró ningún par de números.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 5

Crea una función que reciba una lista de números enteros y devuelva un mensaje indicando el número más grande de la lista.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 6

Crea una función que reciba una lista de palabras y una palabra, y devuelva un mensaje indicando si la palabra aparece al menos una vez en la lista. Si la palabra aparece, se debe devolver un mensaje indicando que se encontró. Si no aparece, se debe devolver un mensaje indicando que no se encontró.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 7

Crea una función que reciba una lista de palabras y devuelva una nueva lista con todas las palabras en mayúsculas.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>

## Enunciado 8

Crea una función que reciba una lista de palabras y devuelva una nueva lista con todas las palabras que comiencen con la misma letra que su final.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
  ```
</details>
