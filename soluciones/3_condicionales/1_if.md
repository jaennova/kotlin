# Solucion a los enunciados de sentencia if

## Enunciado 1

Escribe una sentencia if que tome un número entero como argumento y devuelva "es par" si es par, y "no es par" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val num = 133
    if (num % 2 == 0){
        println("es par")
    }else{
        println("no es par")
    }
}
  ```
</details>

## Enunciado 2

Escribe una sentencia if que tome un carácter como argumento y devuelva "es una vocal" si es una vocal, y "no es una vocal" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {.
    println("ingrese la letra")
    val vocal = readln().lowercase()
    val tamaño = vocal.length
    if (tamaño == 1){
        if (vocal == "a" || vocal == "e" || vocal == "i" || vocal == "o" || vocal == "u")
            println("la letra ingresada es una vocal")
        else
            println("la letra ingresada no es una vocal")
    }else{
        println("solo debe ingresar una letra")
    }
}
  ```
</details>

## Enunciado 3

Escribe una sentencia if que tome un número entero como argumento y devuelva "es negativo" si es negativo, y "no es negativo" en caso contrario.

<details>
  <summary>Solucion</summary>

```kotlin
fun main() {
    val entero = 2
    if (entero >= 0)
        println("no es negativo")
    else
        println("es negativo")
}
```
</details>

## Enunciado 4

Escribe una sentencia if que tome un número entero como argumento y devuelva "es múltiplo de 3" si es múltiplo de 3, y "no es múltiplo de 3" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero % 3 == 0) {
        println("es múltiplo de 3")
    } else {
        println("no es múltiplo de 3")
    }

}
  ```
</details>

## Enunciado 5

Escribe una sentencia if que tome un número entero como argumento y devuelva "está en el rango de 10 a 20" si el número está entre 10 y 20, y "no está en el rango de 10 a 20" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero in 10..20)
        println("el numero $entero esta en el rango del 10 al 20")
    else
        println("$entero no esta dentro del rango")
}
  ```
</details>

## Enunciado 6

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número de un solo dígito" si el número solo tiene un dígito, y "no es un número de un solo dígito" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero >=-9 && entero <= 9)
        println("$entero es un numero de un solo digito")
    else
        println("$entero no es un numero de un solo digito")
}
  ```
</details>

## Enunciado 7

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número de dos dígitos" si el número tiene dos dígitos, y "no es un número de dos dígitos" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero >=10 && entero <= 99)
        println("$entero es un numero de dos digitos")
    else
        println("$entero no es un numero de dos digitos")
}
  ```
</details>

## Enunciado 8

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número de tres dígitos" si el número tiene tres dígitos, y "no es un número de tres dígitos" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero in 100..999)
        println("el $entero es de 3 digitos")
    else
        println("$entero no es de 3 digitos")
}
  ```
</details>

## Enunciado 9

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número de cuatro dígitos" si el número tiene cuatro dígitos, y "no es un número de cuatro dígitos" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero in 9999 downTo 1000)
        println("el $entero es de 4 digitos")
    else
        println("$entero no es de 4 digitos")
}
  ```
</details>

## Enunciado 10

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número divisible por 5" si el número es divisible por 5, y "no es un número divisible por 5" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero % 5 == 0)
        println("$entero es un numero divisible entre 5")
    else
        println("$entero no es un numero divisible entre 5")
}
  ```
</details>

## Enunciado 11

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número divisible por 7" si el número es divisible por 7, y "no es un número divisible por 7" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero % 7 == 0)
        println("$entero es un numero divisible entre 7")
    else
        println("$entero no es un numero divisible entre 7")
}
  ```
</details>

## Enunciado 12

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número divisible por 11" si el número es divisible por 11, y "no es un número divisible por 11" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero % 11 == 0)
        println("$entero es un numero divisible entre 11")
    else
        println("$entero no es un numero divisible entre 11")
}
  ```
</details>

## Enunciado 13

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número divisible por 13" si el número es divisible por 13, y "no es un número divisible por 13" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero")
    val entero = readln().toInt()
    if (entero % 13 == 0)
        println("$entero es un numero divisible entre 13")
    else
        println("$entero no es un numero divisible entre 13")
}
  ```
</details>

## Enunciado 14

Escribe una sentencia if que tome un número entero como argumento y devuelva "es un número capicúa" si el número es igual a su número inverso, y "no es un número capicúa" en caso contrario.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main() {
    val num = readln()
    val numString = num.toString()
    val reverseNumString = numString.reversed()

    if (numString == reverseNumString) {
        println("es un número capicúa")
    } else {
        println("no es un número capicúa")
    }
}
  ```
</details>
