# Soluciones a los enunciados de Operadores

## Operadores de signo

## Enunciado 1

Asigna el valor 10 a una variable y guarda en otra variable el negativo de ese valor

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 10
    val negativo = -num
    println(negativo)
}
```
  
</details>

## Enunciado 2

Asigna el valor -5 a una variable y guarda en otra variable el valor positivo de ese valor

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 5
    val positivo = +num
    print(positivo)
}
```
  
</details>

## Enunciado 3

Asigna el valor 8 a una variable y guarda en otra variable la suma entre ese valor y su negativo

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 8
    val suma = num + -num
    print(suma)
}
```
  
</details>

## Enunciado 4

Asigna el valor -3 a una variable y guarda en otra variable la resta entre ese valor y su valor positivo

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = -3
    val resta = num - +num
    print(resta)
}
```
  
</details>

## Enunciado 5

Asigna el valor 7 a una variable y guarda en otra variable el producto entre ese valor y su negativo

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 7
    val producto = num * -num
    print(producto)
}
```
  
</details>

## Operadores Aritmeticos

## Enunciado 1

Declara una variable llamada num1 con el valor 10 y otra variable llamada result con el resultado de sumar num1 con el valor 5.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num1 = 10
    val result = num1 + 5
}
```
  
</details>

## Enunciado 2

Declara una variable llamada num2 con el valor 15 y otra variable llamada result2 con el resultado de restar num2 con el valor 7.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num2 = 15
    val result2 = num2 - 7
}
```
  
</details>

## Enunciado 3

Declara una variable llamada num3 con el valor 3 y otra variable llamada result3 con el resultado de multiplicar num3 con el valor 8.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 3
    val result = num * 8
}
```
  
</details>

## Enunciado 4

Declara una variable llamada num4 con el valor 20 y otra variable llamada result4 con el resultado de dividir num4 entre el valor 4.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 20
    val result = num / 4
}
```
  
</details>

## Enunciado 5

Declara una variable llamada num5 con el valor 17 y otra variable llamada result5 con el resultado del módulo de dividir num5 entre el valor 3.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 17
    val result = num / 3
}
```
  
</details>

## Operadores de relacion compuesta

## Enunciado 1

Declara dos variables llamadas x y y con valores enteros cualesquiera, y crea una expresión que compruebe si x es mayor que 10 y y es menor que 20.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (x, y) = Pair(10, 32)
    print(x > 10 && x < 20)
}
```

Salida:

```kotlin
false
```
  
</details>

## Enunciado 2

Declara dos variables llamadas a y b con valores booleanos cualesquiera, y crea una expresión que compruebe si a es verdadero o b es falso.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (a, b) = Pair(true, true)
    println(a == true || b == false)
}
```

o

```kotlin
fun main(){
    val (a, b) = Pair(true, true)
    println(a || !b)
}
```

Salida:

```kotlin
true
```
  
</details>

## Enunciado 3

Declara tres variables llamadas m, n y o con valores enteros cualesquiera, y crea una expresión que compruebe si m es igual a 5 y n es mayor o igual que 3 y o es menor o igual que 10.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (m, n) = Pair(3, 12)
    val o = 1
    println((m == 5) && (n >= 3) && (o <= 10))
}
```
Salida

```kotlin
false
```
  
</details>

## Enunciado 4

Declara dos variables llamadas p y q con valores booleanos cualesquiera, y crea una expresión que compruebe si p es falso y q es falso.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (p, q) = Pair(false, false)
    println(!p && !q)
}
```

Salida:

```kotlin
true
```
  
</details>

## Enunciado 5

Declara dos variables llamadas r y s con valores booleanos cualesquiera, y crea una expresión que compruebe si r es verdadero o s es verdadero.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (r, s) = Pair(false, true)
    println(r || s)
}
```

Salida:

```kotlin
true
```
  
</details>

## Operadores de incremento y decremento

## Enunciado 1

Declara una variable llamada counter con el valor inicial de 10 y utiliza el operador de incremento para aumentar su valor en 1.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    var counter = 10
    counter ++
    println(counter)
}
```
  
</details>

## Enunciado 2

Declara una variable llamada score con el valor inicial de 20 y utiliza el operador de decremento para disminuir su valor en 2.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    var score = 20
    score --
    println(score)
}
```
  
</details>

## Enunciado 3

Utiliza el operador de incremento en una variable llamada x dentro de una expresión que compruebe si el valor de x es mayor que 10.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    var x = 12
    x ++
    println(x > 10)
}
```
  
</details>

## Enunciado 4

Utiliza el operador de decremento en una variable llamada y dentro de una expresión que compruebe si el valor de y es menor o igual a 15.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    var y = 12
    y --
    println(y <= 15)
}
```
  
</details>
  
</details>

## Operadores relacionales

## Enunciado 1

Escribe una expresión que evalúe si un número es mayor que 10 y menor que 20.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 5
    println( num > 10 && num < 20)
}
```
  
</details>

## Enunciado 2

Escribe una expresión que evalúe si una cadena de caracteres es igual a "Hola" o "Adiós".

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val saludo = "Hola"
    println(saludo == "Hola" || saludo == "Adios")
}
```
  
</details>

## Enunciado 3

Escribe una expresión que evalúe si un número es divisible por 3 y por 5 al mismo tiempo.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 15
    println(num % 3 == 0 && num % 5 == 0)
}
```
  
</details>

## Enunciado 4

Escribe una expresión que evalúe si una cadena de caracteres no es igual a "Hola" y no es igual a "Adiós".

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val saludo = "estadio"
    println(saludo != "Hola" && saludo != "Adios")
}
```
  
</details>

## Enunciado 5

Escribe una expresión que evalúe si un número es mayor o igual que 0 y menor o igual que 100.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num = 12
    println(num >= 0 && num <= 100)
}
```

o

```kotlin
fun main(){
    val num = 12
    println(num in 0..100)
}
```
  
</details>

## Operadores logicos

## Enunciado 1

Utiliza el operador de negación lógica para comprobar si una variable llamada x es diferente de 5.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val x =3
    println(x != 5)
}
```
  
</details>

## Enunciado 2

Utiliza el operador && para comprobar si dos variables llamadas a y b son ambas mayores que 10.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (a, b) = Pair(12, 4)
    println(a > 10 && b > 10)
}
```
  
</details>

## Enunciado 3

Utiliza el operador || para comprobar si al menos una de dos variables llamadas c y d es menor que 20.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val (c, d) = Pair(12, 4)
    println(c < 20 || d < 20)
}
```
  
</details>

## Enunciado 4

Utiliza el operador ternario para asignar el valor "verdadero" a una variable llamada result si una variable llamada e es mayor que 15, y "falso" en caso contrario.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val e = 16
    val result = if(e > 15) true else false
    println(result)
}
```
  
</details>

## Enunciado 5

Crea una expresión lógica que utilice varios operadores lógicos para comprobar si una variable llamada age es mayor o igual a 18 y menor o igual a 30, o si una variable llamada gender es igual a "female".

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val age = 19
    val gender = "female"
    println(age >= 18 && age <= 30 || gender == "female")
}
```
  
</details>

