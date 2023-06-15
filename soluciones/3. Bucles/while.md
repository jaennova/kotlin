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
 fun main() {
    val listaNumeros = listOf<Int>(1, 2, 3, 4, 5, 6)
    println("ingrese el numero")
    val numero = readln().toInt()
    var indice = -1

    for (i in listaNumeros.indices) {
        if (listaNumeros[i] == numero){
            indice = 1
        }
    }   
    if (indice != -1){
        println("$numero se encuentra en el ultimo indice $indice")
    }else{
        println("$numero no se encuentra en la lista")
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

