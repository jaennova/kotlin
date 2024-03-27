# Solucion a los enunciados de sentencia when

## Enunciado 1

Determina el mayor de dos números y devuelve su valor.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese el primer numero")
    val num1 = readln().toInt()
    println("ingrese el segundo numero")
    val num2 = readln().toInt()

    val numeroMayor = when{
        num1 > num2 -> num1
        else -> num2
    }
    println("el numero mas grande es $numeroMayor")
}
  ```
</details>

## Enunciado 2

Determina a que cuartil pertenece un número en un conjunto de datos y devuelve "primer cuartil", "segundo cuartil", "tercer cuartil" o "fuera de los cuartiles".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero:")
    val numero = readln().toInt()
    println("ingrese los datos separados por una coma:")
    val datos = readln().split(", ").map { it.toInt() }.sorted()

    val primerCuartil = datos[datos.size / 4]
    val segundoCuartil = datos[datos.size / 2]
    val tercerCuartil = datos[datos.size * 3 / 4]

    val resultado = when{
        numero < primerCuartil -> "Fuera de los cuartiles"
        numero <= segundoCuartil -> "Primer cuartil"
        numero <= tercerCuartil -> "Segundo cuartil"
        numero <= datos.last() -> "Tercer cuartil"
        else -> "Fuera de los cuartiles"
    }
    println("El número pertenece al $resultado")
}
  ```
</details>

## Enunciado 3

Determina el signo de un número y devuelve "positivo", "negativo" o "cero".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero:")
    val numero = readln().toInt()
    val resultado = when{
        numero == 0 -> "cero"
        numero <0 -> "negativo"
        else -> "positivo"
    }
    println(resultado)
}
  ```
</details>

## Enunciado 4

Convierte una calificación numérica en una letra y devuelve "A", "B", "C", "D" o "F".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese una calificación:")
    val calificacion = readln().toInt()
    val conversion = when (calificacion) {
        10 -> "A"
        9 -> "B"
        8 -> "C"
        7 -> "D"
        6 -> "E"
        else -> "F"
    }
    if (calificacion > 10)
        println("calificacion fuera del rango")
    else
        println("$calificacion convertida a letra es: $conversion")
}
  ```
</details>

## Enunciado 5

Determina si un carácter es una vocal y devuelve "vocal" o "no vocal".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese la letra")
    val letra = readln().lowercase()
    val esVolcal = when (letra) {
        "a", "e", "i", "o", "u" -> "es una vocal"
        else -> "no es una vocal"
    }
    println("$letra $esVolcal")
}
  ```
</details>

## Enunciado 6

Determina si un año es bisiesto y devuelve "bisiesto" o "no bisiesto".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese el año:")
    val year = readln().toInt()
    val bisiesto = when {
        year % 4 == 0 && year % 100 != 0 -> "$year es un año bisiesto"
        else -> "$year no es un año bisiesto"
    }
    println(bisiesto)
}
  ```
</details>

## Enunciado 7

Determina si un número es par o impar y devuelve "par" o "impar".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un numero:")
    val numero = readln().toInt()
    val parOImpar = when {
        numero % 2 == 0 -> "par"
        else -> "impar"
    }
    println(parOImpar)
}
  ```
</details>

## Enunciado 8

Determina si un número es divisible por otro número y devuelve "divisible" o "no divisible".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese los 2 numeros:")
    val (num1, num2) = Pair(readln().toInt(), readln().toInt())
    println(when {num1 % num2 == 0 -> "$num1 es divisible con $num2 y el resultado es ${num1/num2}" else -> "no divisible"})
}
  ```
</details>

## Enunciado 9

Determina el nombre del día de la semana dado un número del 1 al 7.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese el numero del dia")
    val dia =  when (readln().toInt()){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "numero invalido"
    }
    println(dia)
}
  ```
</details>

## Enunciado 10

Determina el nombre del mes dado un número del 1 al 12.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese el numero del mes")
    val mes =  when (readln().toInt()){
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "mes invalido"
    }
    println(mes)
}
  ```
</details>

## Enunciado 11

Determina el resultado de una operación matemática simple dada la operación y los operandos, por ejemplo, "suma", "resta", "multiplicación" o "división".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese 2 valores:")
    val (num1, num2) = Pair(readln().toInt(), readln().toInt())
    println("""
        que operacion desea realizar?
        1. suma
        2. resta
        3. division
        4. multiplicacion
    """.trimIndent())
    val result = when (readln().toInt()){
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 / num2
        4 -> num1 * num2
        else -> "operacion no valida"
    }
    println(result)
}
  ```
</details>

## Enunciado 12

Determina el nombre del planeta dado un número del 1 al 8.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese el numero del planeta")
    val planeta = when (readln().toInt()){
        1 -> "Mercurio"
        2 -> "Venus"
        3 -> "Tierra"
        4 -> "Marte"
        5 -> "Jupiter"
        6 -> "Saturno"
        7 -> "Urano"
        8 -> "Neptuno"
        else -> "numero invalido"
    }
    println(planeta)
}
  ```
</details>


## Enunciado 13

Determina si una cadena de caracteres es un número y devuelve "número" o "no número".

<details>
  <summary>Solucion</summary>
  
  ```kotlin
 fun main (){
    println("ingrese un valor")
        when (readln().toIntOrNull()){
        null -> println("no es un numero")
            else -> println("es un numero")
    }
}
  ```
</details>

