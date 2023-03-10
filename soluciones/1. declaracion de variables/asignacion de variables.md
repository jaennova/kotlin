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

Una data class en Kotlin es una clase especial que se utiliza para contener datos. Estas clases tienen como principal funci??n almacenar y proporcionar acceso a los datos, y suelen tener pocas o ninguna l??gica de negocio.

La principal diferencia de las data class con las clases normales es que las primeras tienen un conjunto de funciones y operadores sobrecargados de manera autom??tica, como:

* `toString()`: devuelve una representaci??n en cadena de caracteres del objeto.
* `equals()`: determina si dos objetos son iguales.
* `hashCode()`: devuelve un valor hash para el objeto.
* `copy()`: Crea una copia del objeto con valores opcionales modificados
* `componentN()`: permite desestructurar el objeto en una serie de variables individuales.

Al declarar una data class se debe utilizar la palabra reservada data y se recomienda tener al menos una propiedad en el constructor.

```kotlin
data class Person(val name: String, val age: Int)
```

Al utilizar data class se puede reducir el c??digo necesario para implementar las funciones mencionadas anteriormente y se puede enfocar en la l??gica de negocio de la aplicaci??n.
</details>
<br>

## Enunciado 9

Asigna el valor de una expresi??n a una variable, luego imprime el valor de esa variable.

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


## Enunciado 11

Declara una variable con un valor inicial de true, luego asigna el valor false a esa variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    var interruptor = true
    interruptor = false
    print(interruptor)
}
```

Salida:

```kotlin
false
```
</details>
<br>


## Enunciado 12

Utiliza destructuring declarations para asignar valores a dos variables en una sola l??nea, luego imprime los valores de esas variables.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    val (dia, clima) = Pair("Lunes", "soleado")
    print("hoy es $dia y esta $clima")
}
```

Salida:

```koltin
hoy es Lunes y esta soleado
```

</details>
<br>

## Enunciado 13

Asigna el valor de una variable a otra variable, luego imprime el valor de esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
fun main() {
    val dolar = 19.45
    val euro = 23.43
    print("el valor del euro actualmente es $euro")
}
  ```

  Salida:

```kotlin
el valor del euro actualmente es de 23.43
```

</details>
<br>

## Enunciado 14

Declara una variable con un valor inicial de una lista vac??a, luego asigna el valor de una lista con elementos [1,2,3] a esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    var miLista: List<Int> = emptyList()
    miLista = listOf(1, 2, 3)
    for (elemento in miLista) {
        println(elemento)
    }

}
</details>
<br>

Salida:

```kotlin
1
2
3
```

</details>
<br>

## Enunciado 15

Declara una variable con un valor inicial de 100, luego multiplica el valor de esa variable por 2 y asigna el resultado a esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    var multiplicacion = 100
    multiplicacion *=2
    print("el resultado de la multiplicacion es $multiplicacion")
}
```

Salida:

```kotlin
el valor mutiplicado es 200
```
</details>
<br>

## Enunciado 16

Declara una variable con un valor inicial de "Hello World!", luego concatena el valor " Kotlin" a esa variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    var saludo = "Hello World "
    saludo += "Kotlin"
    print(saludo)
}
```

Salida:

```kotlin
Hello World Kotlin
```

</details>
<br>

## Enunciado 17

Declara una variable con un valor inicial de [1,2,3,4,5], luego utiliza el m??todo "sum()" para sumar los elementos de esa variable y asignar el resultado a otra variable.

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    val lista: List<Int> = listOf(1, 2, 3, 4)
    val resultado = lista.sum()
    print("la suma de los numeros de la lista es: $resultado")
}
```

Salida:

```kotlin
la suma de los numeros de la lista es 10
```

</details>
<br>


## Enunciado 18

Declara una variable con un valor inicial de "foo", luego utiliza el m??todo "replace()" para reemplazar el valor de esa variable con "bar"

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    var mensaje = "foo"
    mensaje= mensaje.replace("foo", "bar")
    print("el mensaje cambio a $mensaje")
}
```

Salida:

```kotlin
el mensaje cambio a bar
```

</details>
<br>

## Enunciado 19

Declara una variable con un valor inicial de 5, luego utiliza el operador "++" para incrementar el valor de esa variable en 1

<details>
  <summary>Solucion</summary>
  
  ```kotlin
  fun main() {
    var numero = 5
    numero ++
    print("el numero ha aumentado a $numero")
}
```

Salida:

```kotlin
el numero ha aumentado a 6
```

</details>
<br>

## Enunciado 20

Declara una variable con un valor inicial de [10,20,35,40], luego utiliza el m??todo "filter()" para seleccionar solo los n??meros pares y asignarlos a una nueva variable.

<details>
  <summary>Solucion</summary>
  
```kotlin
fun main() {
    val miLista: List<Int> = listOf(10, 20, 35, 40)
    val listaNueva: List <Int> = miLista.filter { numero -> numero % 2 == 0 }
    print(listaNueva)
}
```

Salida:

```kotlin
[10, 20, 40]
```
</details>
<br>
