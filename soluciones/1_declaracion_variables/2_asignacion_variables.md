# Soluciones a los enunciados de declaracion de variables

## Enunciado 1

Declara una variable con un valor inicial de 5, luego asigna el valor 7 a esa variable.

<details>
  <summary>Solucion</summary>

```kotlin
fun main() {
    var numero = 5
    numero = 7
    print(numero)
}
```

Salida: 
```kotlin
12
```
</details>
<br>

## Enunciado 2

Declara una variable con un valor inicial de "Hello", luego asigna el valor "Bye" a esa variable.

<details>
  <summary>Solucion</summary>

  ```kotlin
fun main() {
    var saludo = "Hello"
    saludo = "Bye"
    print(saludo)
}
```

Salida:

```kotlin
Bye
```
</details>
<br>

## Enunciado 3

Utiliza destructuring declarations para asignar el valor 1 a una variable y el valor 2 a otra variable.

<details>
  <summary>Solucion</summary>

```kotlin
fun main() {
    val (num1, num2) = Pair(1, 2)
    print("""
        primer numero: $num1
        segundo numero: $num2
    """.trimIndent())
}
```

Salida:

```kotlin
primer numero: 1
segundo numero: 2
```
</details>
<br>

## Enunciado 4

Asigna el valor de una variable a otra variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    val variablePrincipal = "valor"
    val variableSecundaria = variablePrincipal
    print("el valor de la variable principal: $variablePrincipal\n" +
          "es igual al valor de la variable secundaria: $variableSecundaria")
}
```

Salida:

```kotlin
el valor de la variable principal: valor
es igual al valor de la variable secundaria: valor
```
</details>
<br>

## Enunciado 5

Declara una variable con un valor inicial de "John", luego asigna el valor "Jane" a esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    var nombre = "John"
    nombre = "Jane"
    print("el nombre ha cambiado a $nombre")
}
```

Salida:

```kotlin
el nombre ha cambiado a Jane
```
</details>
<br>

## Enunciado 6

Declara una variable con un valor inicial de 25, luego asigna el valor 30 a esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    var numero = 25
    numero = 30
    print("el numero ha aumentado su valor a $numero")
}
```

Salida:

```kotlin
el numero ha aumentado su valor a 30
```
</details>
<br>

## Enunciado 7

Declara una variable con un valor inicial de 'M', luego asigna el valor 'F' a esa variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    var inicial: Char = 'M'
    inicial = 'F'
    print("ahora la inicial es $inicial")
}
```

Salida:

```kotlin
ahora la inicial es F
```

</details>
<br>

## Enunciado 8

Utiliza destructuring declarations para asignar valores a tres variables, luego imprime los valores de esas variables.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    //la funcion Pair solo acepta 2 variables
    val (nombre, edad) = Pair("John", 3) // esto esta bien
    // asignarle 3 causaria error
    val (nombre, apellido, edad) = Pair("John","Smith", 3)
}
```

Salida:

```kotlin
Kotlin: Destructuring declaration initializer of type Pair<String, String> must have a 'component3()' function
```

Aqui hay dos posibles soluciones

Solucion 1.

```kotlin
fun main() {
    val lista = listOf(1, 2, 3)
    val (uno, dos, tres) = lista
    print("lista de numero: $uno, $dos, $tres")
}
```

Salida:

```kotlin
lista de numeros: 1, 2, 3
```

Solucion 2.

```kotlin
fun main() {
    data class Persona(val nombre: String, val apellido: String, val edad: Int)
    val myPerson = Persona("John", "Doe", 25)
    val (nombre, apellido, edad) = myPerson
    print("Datos: $nombre $apellido, $edad")

}
```

Saluda

```kotlin
Datos: Jonh Doe, 25
```

Una data class en Kotlin es una clase especial que se utiliza para contener datos. Estas clases tienen como principal función almacenar y proporcionar acceso a los datos, y suelen tener pocas o ninguna lógica de negocio.

La principal diferencia de las data class con las clases normales es que las primeras tienen un conjunto de funciones y operadores sobrecargados de manera automática, como:

* `toString()`: devuelve una representación en cadena de caracteres del objeto.
* `equals()`: determina si dos objetos son iguales.
* `hashCode()`: devuelve un valor hash para el objeto.
* `copy()`: Crea una copia del objeto con valores opcionales modificados
* `componentN()`: permite desestructurar el objeto en una serie de variables individuales.

Al declarar una data class se debe utilizar la palabra reservada data y se recomienda tener al menos una propiedad en el constructor.

```kotlin
data class Person(val name: String, val age: Int)
```

Al utilizar data class se puede reducir el código necesario para implementar las funciones mencionadas anteriormente y se puede enfocar en la lógica de negocio de la aplicación.
</details>
<br>

## Enunciado 9

Asigna el valor de una expresión a una variable, luego imprime el valor de esa variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    val expresion = 10 + 12
    print("el valor de la expresion es $expresion")
}
```

Salida:

```kotlin
el valor de la expresion es 22
```
</details>
<br>


## Enunciado 10

Declara una variable con un valor inicial de 0.0, luego asigna el valor 45.6 a esa variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    var valorDouble = 0.0
    valorDouble = 45.6
    print("el valor double es $valorDouble")
}
```

Salida

```kotlin
el valor double es 45.6
```
</details>
<br>