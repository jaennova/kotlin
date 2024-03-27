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

Dado una lista de números enteros, escribe un código que determine si hay algún número que sea divisible tanto por 2 como por 3 al mismo tiempo.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var divisiblePorDosYtres = false

    numeros.forEach {
        if (it % 2 == 0 && it % 3 == 0) {
            divisiblePorDosYtres = true
            return@forEach
        }
    }

    if (divisiblePorDosYtres) {
        println("Hay un número divisible por 2 y 3 al mismo tiempo.")
    } else {
        println("No hay números divisibles por 2 y 3 al mismo tiempo.")
    }
}

  ```
</details>

## Enunciado 8

Dado una lista de cadenas de texto, escribe un código que determine cuántas de las cadenas tienen más de 5 caracteres y son palíndromos (se leen igual de izquierda a derecha y de derecha a izquierda).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val cadenas = listOf("ana", "oso", "casa", "reconocer", "gato", "radar", "solos")
    var contador = 0

    cadenas.forEach { cadena ->
        if (cadena.length > 5 && esPalindromo(cadena)) {
            contador++
        }
    }

    println("Cantidad de cadenas con más de 5 caracteres y son palíndromos: $contador")
}

fun esPalindromo(cadena: String): Boolean {
    val cadenaReversa = cadena.reversed()
    return cadena == cadenaReversa
}

  ```
</details>

## Enunciado 9

Dado una matriz de enteros, escribe un código que determine cuántos elementos de la matriz son múltiplos de 3 y no de 5, y que además sean mayores a 10 y menores a 20.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    val matriz = arrayOf(
        intArrayOf(15, 9, 12),
        intArrayOf(18, 7, 16),
        intArrayOf(5, 14, 22),
        intArrayOf(11, 17, 19)
    )
    var contador = 0

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento % 3 == 0 && elemento % 5 != 0 && elemento > 10 && elemento < 20) {
                contador++
            }
        }
    }

    println("Cantidad de elementos que son múltiplos de 3, no de 5, y están entre 10 y 20: $contador")
}
 
  ```
</details>
