# Operadores en Kotlin

## Operadores de signo

numérico. Los operadores de signo comunes en Kotlin son:

    + : Identidad, indica el valor es positivo o cero
    - : Negación, cambia el signo de un valor a negativo o cero

Ejemplos:

```kotlin
val a = 5
val b = -3

println(+a)  // imprime 5
println(-a)  // imprime -5
println(+b)  // imprime -3
println(-b)  // imprime 3
```

Además, también puedes utilizar estos operadores en conjunto con operaciones aritméticas como la suma, resta, multiplicación y división.

## Operadores aritmeticos

Los operadores aritméticos en Kotlin son utilizados para realizar operaciones matemáticas básicas como suma, resta, multiplicación, división y módulo. A continuación se presentan los operadores aritméticos más comunes en Kotlin:

    + : Suma
    - : Resta
    * : Multiplicación
    / : División
    % : Módulo (devuelve el resto de una división)

Ejemplos:

```kotlin
val a = 5
val b = 3

println(a + b)   // imprime 8
println(a - b)   // imprime 2
println(a * b)   // imprime 15
println(a / b)   // imprime 1 (división entera)
println(a % b)   // imprime 2 (resto de la división)
```

Además de los operadores mencionados anteriormente, también existen los operadores aritméticos de asignación, los cuales permiten realizar una operación matemática y asignar el resultado a una variable en una sola línea de código. Ejemplos de estos operadores son +=, -=, *=, /= y %=.

Ejemplos:

```kotlin
var x = 5
x += 3    // x es igual a 8
x -= 2    // x es igual a 6
x *= 4    // x es igual a 24
x /= 3    // x es igual a 8
x %= 2    // x es igual a 0
```

Además, Kotlin también tiene algunas funciones matemáticas básicas como abs, max, min, sqrt entre otras que se pueden utilizar para realizar operaciones matemáticas más complejas.

## Operadores de relacion compuesta

Los operadores de relación compuesta en Kotlin son utilizados para crear expresiones lógicas más complejas a partir de operadores de comparación. Los operadores de relación compuesta más comunes en Kotlin son:

    && : And (y)
    || : Or (o)

El operador && se utiliza para comprobar que dos expresiones sean verdaderas al mismo tiempo. Por ejemplo, en el enunciado a > b && b > c ambas expresiones deben ser verdaderas para que el enunciado completo sea verdadero.

Por otro lado, el operador || se utiliza para comprobar que al menos una de las dos expresiones sea verdadera. Por ejemplo, en el enunciado a > b || b > c si al menos una de las expresiones es verdadera el enunciado completo será verdadero.

Ejemplos:

```kotlin
val a = 5
val b = 3
val c = 1

println(a > b && b > c)  // imprime true, ya que a > b y b > c son ambas verdaderas
println(a < b || b > c)  // imprime true, ya que al menos una de las expresiones es verdadera (b > c)
```

> Es importante mencionar que los operadores && y || son evaluados de manera cortocircuitada, es decir, si el resultado de la expresión puede ser determinado a partir de evaluar solo una parte de la expresión, la evaluación de la otra parte no se lleva a cabo.

## Operadores de incremento y decremento

Los operadores de incremento y decremento en Kotlin son utilizados para aumentar o disminuir el valor de una variable en una unidad. Los operadores de incremento y decremento más comunes en Kotlin son:

    ++ : Incremento
    -- : Decremento

El operador ++ se utiliza para incrementar el valor de una variable en 1. Por ejemplo, en la expresión a++ el valor de la variable a se incrementa en 1.

Por otro lado, el operador -- se utiliza para disminuir el valor de una variable en 1. Por ejemplo, en la expresión b-- el valor de la variable b se disminuye en 1.

Ejemplos:

```kotlin
var x = 5
x++    // x es igual a 6
x--    // x es igual a 5
```

Los operadores de incremento y decremento también pueden ser utilizados en expresiones, como en:

```kotlin
var x = 5
var y = x++    // y es igual a 5 y x es igual a 6
var z = ++x    // z es igual a 7 y x es igual a 7
```

Es importante mencionar que los operadores de incremento y decremento pueden ser utilizados tanto como operadores prefijos (++x) o sufijos (x++). Cuando se utiliza como operador prefijo, primero se incrementa o decrementa el valor de la variable y luego se utiliza en la expresión; mientras que cuando se utiliza como operador sufijo, primero se utiliza el valor.

## Operadores relacionales

Los operadores de comparación en Kotlin se utilizan para comparar valores y determinar si son iguales o diferentes. Los operadores de comparación comunes en Kotlin son:

    == : Igual a
    != : Diferente de
    > : Mayor que
    < : Menor que
    >= : Mayor o igual que
    <= : Menor o igual que

Ejemplos:

```kotlin
val a = 5
val b = 3
val c = 5

println(a == b)  // imprime false
println(a != b)  // imprime true
println(a > b)   // imprime true
println(a < b)   // imprime false
println(a >= b)  // imprime true
println(a <= b)  // imprime false

println(a == c)  // imprime true
```
## Operadores logicos

Los operadores lógicos en Kotlin son utilizados para crear expresiones lógicas que pueden ser evaluadas como verdaderas o falsas. Los operadores lógicos más comunes en Kotlin son:

    ! : Negación lógica
    && : And (y)
    || : Or (o)

El operador ! se utiliza para negar una expresión lógica. Por ejemplo, en la expresión !(a > b) se está negando que "a" sea mayor que "b".

El operador && se utiliza para comprobar que dos expresiones sean verdaderas al mismo tiempo. Por ejemplo, en el enunciado a > b && b > c ambas expresiones deben ser verdaderas para que el enunciado completo sea verdadero.

Por otro lado, el operador || se utiliza para comprobar que al menos una de las dos expresiones sea verdadera. Por ejemplo, en el enunciado a > b || b > c si al menos una de las expresiones es verdadera el enunciado completo será verdadero.

Ejemplos:

```kotlin
val a = 5
val b = 3
val c = 1

println(!(a > b))  // imprime false, ya que a > b es verdadero
println(a > b && b > c)  // imprime true, ya que a > b y b > c son ambas verdaderas
println(a < b || b > c) // imprime true, ya que al menos una de las expresiones es verdadera (b > c)
```


Es importante mencionar que los operadores lógicos son evaluados de manera cortocircuitada, es decir, si el resultado de la expresión puede ser determinado a partir de evaluar solo una parte de la expresión, la evaluación de la otra parte no se lleva a cabo.

Además de estos operadores, Kotlin también tiene un operador ternario ` ?:` que puede ser utilizado para asignar un valor a una variable dependiendo de si una expresión es verdadera o falsa. El operador ternario tiene la siguiente estructura:

```kotlin
expresion ? valor_si_verdadero : valor_si_falso
```

Ejemplo:

```kotlin
val edad = 25
val mayorDeEdad = if (edad >= 18) true else false
val mayorDeEdad2 = edad >= 18
```

En este caso, el operador ternario está evaluando si la variable `edad` es mayor o igual a 18 y si es verdadero asigna true a la variable `mayorDeEdad` y sino asigna false.
