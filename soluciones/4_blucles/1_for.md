# Solucion a los enunciados de bucle for

## Enunciado 1

Imprimir los números del 1 al 10.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    for (i in 1..10){
        println(i)
    }
}
  ```
</details>

## Enunciado 2

Imprimir los números pares del 2 al 20.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    for (i in 2..20){
        if (i % 2 == 0)
            println(i)
    }
}
  ```
</details>

## Enunciado 3

Imprimir la suma de los números del 1 al 100.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    var suma = 0
    for (i in 1 .. 100) suma +=i
    println("la suma de los numeros del 1 al 100 es $suma")
}
  ```
</details>

## Enunciado 4

Imprimir los números del 10 al 1 en orden decreciente.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    for (i in 10 downTo 1) println(i)
}
  ```
</details>

## Enunciado 5

Imprimir la tabla de multiplicar del número dado (por ejemplo, si se da el número 7, imprimir 7x1=7, 7x2=14, ..., 7x10=70).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero:")
    val numTabla = readln().toIntOrNull()
    for (i in 1 .. 10)
        println("$numTabla x $i = ${i * numTabla!!}")
}
  ```
</details>

## Enunciado 6

Imprimir los números impares del 1 al 99.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    for (i in 1 .. 99){
        if (i % 2 == 1 ){
            println(i)
        }
    }
}
  ```
</details>

## Enunciado 7

Imprimir la suma de los números pares del 2 al 100.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    var suma = 0
    for (i in 2 .. 100){
        if (i % 2 == 0){
            suma+=i
        }
    }
    println("la suma de los numeros pares es: $suma")
}
  ```
</details>

## Enunciado 8

Imprimir los números múltiplos de 5 del 5 al 50.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    for (i in 5 .. 50)
        if (i % 5 == 0 )
            println(i)
}
  ```
</details>

## Enunciado 9

Imprimir los números fibonacci hasta el n-ésimo término (donde n es un número dado).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    val n = readln().toInt()
    var (numAnterior, numSiguiente) = Pair (0,1)
    println("primeros $n terminos en la serie de fibonacci:")
    for (i in 1.. n) {
        if (i == n){
            print(numAnterior)
        } else{
            print("$numAnterior + ")
        }
        val nuevoTermino = numAnterior + numSiguiente
        numAnterior = numSiguiente
        numSiguiente = nuevoTermino
    }
}
  ```
</details>

## Enunciado 10

Imprimir los números triangulares hasta el n-ésimo término (donde n es un número dado).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero:")
    val n = readln().toInt()
    var numeroTriangular = 0
    for (i in 1 .. n){
        numeroTriangular += i
        println(numeroTriangular)
    }
}
  ```
</details>


## Enunciado 11

Imprimir los números primos hasta el n-ésimo término (donde n es un número dado).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    println("ingrese la cantidad de numeros primos que desea imprimir")
    val n = readln().toInt()
    var contador = 0
    // Iteración a través de los números naturales a partir de 2
    for (numero in 2..Int.MAX_VALUE) {
        var esPrimo = true
        // Verificación de si el número actual es primo
        for (i in 2 until numero) {
            // Si el número actual es divisible por i, no es primo
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }
        // Si el número actual es primo, se incrementa el contador y se imprime
        if (esPrimo) {
            contador++
            println("El número primo numero $contador es $numero")
        }
        // Si se han encontrado n números primos, se detiene el bucle
        if (contador == n) {
            break
        }
    }
}
  ```
</details>

## Enunciado 12

Imprimir los factoriales de los números del 1 al n (donde n es un número dado).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    println("ingrese un numero")
    val numero = readln().toInt()
    var factorial = 1
    for (i in 1..numero) {
        factorial *= i
        println("El factorial de $i es $factorial")
    }
}
  ```
</details>

## Enunciado 13

Imprimir la suma de los cuadrados de los números del 1 al n (donde n es un número dado).

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    println("ingrese un numero")
    val numero = readln().toInt()
    for (i in 1..numero) println(i*i)
}
  ```
</details>

## Enunciado 14

Imprimir los números perfectos hasta el n-ésimo término (donde n es un número dado).1

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val n = readln().toInt()
    var count = 0

    for (num in 2..Int.MAX_VALUE) {
        var sum = 0
        for (i in 1 until num) {
            if (num % i == 0) {
                sum += i
            }
        }
        if (sum == num) {
            println(num)
            count++
        }
        if (count == n) {
            break
        }
    }
}
  ```
</details>

## Enunciado 15

Imprimir la suma de los dígitos de un número dado.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    println("ingrese un numero")
    val numero = readln().toIntOrNull()
    var suma = 0
    if (numero != null ){
        val numStr = "$numero" // o val numStr = numero.toString() 
        for (i in numStr.indices) // o  for (i in 0 until numStr.length)
        {
            suma += numStr[i].toString().toInt()
        }

        println("La suma de los digitos del numero $numero es $suma")
    } else{
        println("ese no es un numero")
    }
}
  ```
</details>
