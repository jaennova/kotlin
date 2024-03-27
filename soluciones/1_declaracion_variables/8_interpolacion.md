# Solucion a los enunciados de ...

## Enunciado 1

Escribe una expresión que interpole tres cadenas de caracteres y un número en una sola. La expresión debe usar el operador "${}" para interpolación.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val (x,y) = Pair("hola","tengo")
    val (a,b) = Pair(5,"pesos")
    println("${x + y + a + b}")
}
  ```
</details>

## Enunciado 2

Escribe una expresión que interpolé un número y tres cadenas de caracteres en una sola. La expresión debe usar el operador "$" para interpolación.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val (x,y) = Pair("hola","tengo")
    val (a,b) = Pair(5,"pesos")
    println("$x $y $a $b")
}
  ```
</details>

## Enunciado 3

Escribe una expresión que interpolé dos números y tres cadenas de caracteres en una sola. La expresión debe usar el operador "${}" para interpolación.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val (x,y) = Pair("hola","tengo")
    val (a,b) = Pair(5,"pesos")
    val num = 3
    println("${num + a} ${x + b + a}")
}
  ```
</details>
