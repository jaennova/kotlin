# Solucion a los enunciados del bucle While

## Enunciado 1

Crea una función que reciba una lista de números enteros y un número entero n, y devuelva un mensaje indicando que n se encuentra en la lista en el índice correspondiente. Si n no aparece en la lista, se debe devolver un mensaje indicando que no se encontró.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val n = 34
    println(findIndex(list, n))
}

fun findIndex(list: List<Int>, n: Int): String {
    println(list)
    for ((index, value) in list.withIndex()) {
        if (value == n) {
            return "El valor $n se encuentra en la lista en el índice $index"
        }
    }
    return "El valor $n no se encuentra en la lista"
}
  ```
</details>

## Enunciado 2

  Crea una función que reciba una lista de números enteros y devuelva un mensaje indicando la suma de todos los números pares de la lista.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    val listaNumeros = listOf(1,1,1,1,1)
    println(sumarNumerosPares(listaNumeros))
}

fun sumarNumerosPares(listaNumeros: List<Int>): String {
    var suma = 0
    for (numero in listaNumeros) {
        if (numero % 2 == 0) {
            suma += numero
        }
    }
    return if (suma < 1) "No hay números pares" else "La suma de los números pares es: $suma"
}

  ```
</details>

## Enunciado 3

Crea una función que reciba una lista de números enteros y devuelva una nueva lista con todos los números impares de la lista original.

<details>
  <summary>Solucion</summary>
  
  ```kotlin

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(oddNumbers(list))
}

fun oddNumbers(list: List<Int>): List<Int> {
    val oddList = mutableListOf<Int>()
    for (number in list) {
        if (number % 2 != 0) {
            oddList.add(number)
        }
    }
    return oddList
}
  ```
</details>

## Enunciado 4

Crea una función que reciba una lista de números enteros y un número entero n, y devuelva un mensaje indicando si hay al menos un par de números en la lista que sumen n. Si se cumple la condición, se debe devolver un mensaje indicando que se encontró un par de números. Si no se cumple la condición, se debe devolver un mensaje indicando que no se encontró ningún par de números.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(hasPairWithSum(list, 11))
}

fun hasPairWithSum(list: List<Int>, targetSum: Int): Boolean {
    for (num in list) {
        if (list.contains(targetSum - num)) {
            return true
        }
    }
    return false
}

  ```
</details>

## Enunciado 5

Crea una función que reciba una lista de números enteros y devuelva un mensaje indicando el número más grande de la lista.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(biggestNumber(list))
}
fun biggestNumber(list: List<Int>): Int? {
    return list.maxOrNull()
}

  ```
</details>

## Enunciado 6

Crea una función que reciba una lista de palabras y una palabra, y devuelva un mensaje indicando si la palabra aparece al menos una vez en la lista. Si la palabra aparece, se debe devolver un mensaje indicando que se encontró. Si no aparece, se debe devolver un mensaje indicando que no se encontró.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val words = listOf("apple", "banana", "orange")
    val word = "apple"
    println(containsWord(words, word))
}

fun containsWord(words: List<String>, word: String): String {
    return if (words.contains(word)) "$word found()" else "$word not found()"
}
  ```
</details>

## Enunciado 7

Crea una función que reciba una lista de palabras y devuelva una nueva lista con todas las palabras en mayúsculas.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val words = listOf("apple", "banana", "orange")
    println(upperCaseWords(words))
}

fun upperCaseWords(words: List<String>): Any {
    return words.map { it.uppercase() }
}
  ```
</details>

## Enunciado 8

Crea una función que reciba una lista de palabras y devuelva una nueva lista con todas las palabras que comiencen con la misma letra que su final.


<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val words = listOf("apple", "banana", "kiwi", "orange", "grape")
    println(newList(words))
}

fun newList(words: List<String>): Any {
    return words.filter { it[0] == it.last() }
}
  ```
</details>
