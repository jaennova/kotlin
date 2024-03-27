# Tipos de datos en Kotlin

Cada uno de estos tipos de datos tiene características y limitaciones específicas, y su elección dependerá del contexto en el que se utilice.

## Byte

Es un tipo de dato numérico de 8 bits que puede almacenar valores entre -128 y 127. 

Se podría utilizar para almacenar el valor de una variable de tamaño reducido, como el número de unidades de un producto en un inventario.
Ejemplo:

```kotlin
val byteValue: Byte = 100.
```

## Short
Es un tipo de dato numérico de 16 bits que puede almacenar valores entre -32,768 y 32,767. 

Se podría utilizar para almacenar el valor de una variable de tamaño mediano, como el número de ventas de un producto en un mes.

Ejemplo: 

```kotlin
val shortValue: Short = 10000.
```
## Int

Es un tipo de dato numérico de 32 bits que puede almacenar valores entre -2,147,483,648 y 2,147,483,647. 

Se podría utilizar para almacenar el valor de una variable de tamaño grande, como el número total de clientes en una base de datos.
Ejemplo:

```kotlin
val numeroClientes: Int = 200000.
```
## Long

Es un tipo de dato numérico de 64 bits que puede almacenar valores entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807.

Se podría utilizar para almacenar el valor de una variable de tamaño muy grande, como el número total de visitas en un sitio web

 Ejemplo: 

```kotlin
val vistasTotales: Long = 100000000000.
```
## Float
Es un tipo de dato numérico de punto flotante de 32 bits.

Se podría utilizar para almacenar el valor de una variable que representa un número con decimales, como el precio de un producto.

 Ejemplo: 

```kotlin
val precioProducto: Float = 9.99.
```

## Double

Es un tipo de dato numérico de punto flotante de 64 bits.

Se podría utilizar para almacenar el valor de una variable que representa un número con decimales y requiere precisión, como el cálculo de una operación matemática compleja.

 Ejemplo: 

```kotlin
val pi: Double = 3.14159265358979323846.
```

## Boolean

Es un tipo de dato lógico que solo puede almacenar dos valores, verdadero o falso.

Se podría utilizar para almacenar el valor de una variable que representa un valor lógico, como el estado de un interruptor (encendido/apagado).

 Ejemplo: 

```kotlin
val estaEncendido = true
```

## Char

Es un tipo de dato que representa un caracter Unicode.

Se podría utilizar para almacenar el valor de una variable que representa un caracter, como el caracter inicial de un nombre.

 Ejemplo: 

```kotlin
val inicial = 'A'
```
## String

Es un tipo de dato que representa una secuencia de caracteres.

Se podría utilizar para almacenar el valor de una variable que representa una cadena de caracteres, como el nombre de una persona.

 Ejemplo: 

```kotlin
val nombre = "Juan"
```

## Array

Es un tipo de dato que representa una colección de elementos del mismo tipo.

Se podría utilizar para almacenar el valor de una variable que representa una colección de elementos, como una lista de números.

 Ejemplo: 

```kotlin
val numeros = arrayOf(1,2,3,4,5)
```
