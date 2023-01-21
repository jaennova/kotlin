# Soluciones a los enunciados de conversion de tipos de datos

## Enunciado 1

Crea una variable de tipo String y asigna a ella un valor de "123.45". Luego, crea una variable de tipo Double y asigna a ella el valor de la variable de String convertida a Double utilizando la función toDouble().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val cadena:String = "123.54"
    val doble:Double = cadena.toDouble()
}
```
  
</details>

## Enunciado 2

Crea una variable de tipo Int y asigna a ella un valor de 123. Luego, crea una variable de tipo Long y asigna a ella el valor de la variable de Int convertida a Long.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num:Int = 123
    val numLong:Long = num.toLong()
}
```
  
</details>

## Enunciado 3

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Short y asigna a ella el valor de la variable de String convertida a Short utilizando la función toShort().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val numShort:Short = str.toShort()
}
```
  
</details>

## Enunciado 4

Crea una variable de tipo Float y asigna a ella un valor de 123.45. Luego, crea una variable de tipo String y asigna a ella el valor de la variable de Float convertida a String utilizando la función toString().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num:Float = 123.45F
    val str:String = num.toString()
}
```
  
</details>

## Enunciado 5

Crea una variable de tipo Byte y asigna a ella un valor de 123. Luego, crea una variable de tipo Long y asigna a ella el valor de la variable de Byte convertida a Long.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val numByte:Byte = 123
    val numLong:Long = numByte.toLong()
}
```
  
</details>

## Enunciado 6

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Float y asigna a ella el valor de la variable de String convertida a Float utilizando la función toFloat().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val texto:String = "123"
    val numFloat:Float = texto.toFloat()
}
```
  
</details>

## Enunciado 7

Crea una variable de tipo Long y asigna a ella un valor de 123. Luego, crea una variable de tipo Int y asigna a ella el valor de la variable de Long convertida a Int utilizando la función toInt().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val numLong:Long = 123
    val numInt:Int = numLong.toInt()
}
```
  
</details>

## Enunciado 8

Crea una variable de tipo Boolean y asigna a ella un valor de true. Luego, crea una variable de tipo String y asigna a ella el valor de la variable de Boolean convertida a String utilizando la función toString().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val dia:Boolean = true
    val str:String = dia.toString()
}
```
  
</details>

## Enunciado 9

Crea una variable de tipo Int y asigna a ella un valor de 123. Luego, crea una variable de tipo String y asigna a ella el valor de la variable de Int convertida a String utilizando la función toString().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num:Int = 123
    val str:String = num.toString()
}
```
  
</details>

## Enunciado 10

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Byte y asigna a ella el valor de la variable de String convertida a Byte utilizando la función toByte().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val numByte:Byte = str.toByte()
}
```
  
</details>

## Enunciado 11

Crea una variable de tipo Double y asigna a ella un valor de 123.45. Luego, crea una variable de tipo Int y asigna a ella el valor de la variable de Double convertida

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val numDouble:Double = 123.45
    val numInt:Int = numDouble.toInt()
}
```
  
</details>

## Enunciado 12

Crea una variable de tipo Long y asigna a ella un valor de 123. Luego, crea una variable de tipo Float y asigna a ella el valor de la variable de Long convertida a Float utilizando la función toFloat().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val numLong:Long = 123
    val numFloat:Float = numLong.toFloat()
}
```
  
</details>

## Enunciado 13

Crea una variable de tipo Char y asigna a ella un valor de 'A'. Luego, crea una variable de tipo Int y asigna a ella el valor de la variable de Char convertida a Int utilizando la función toInt().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val letra:Char = 'A'
    val num:Int = letra.toInt()
    println(num)
}
```

Salida:

```kotlin
65
```

La salida es 65 porque el método toInt() convierte un carácter a su representación numérica en la tabla ASCII. En este caso, el carácter 'A' tiene un valor numérico de 65 en la tabla ASCII. Al llamar a toInt() en el carácter 'A', se convierte su valor a 65 y se asigna a la variable 'num', y luego se imprime.
  
</details>

## Enunciado 14

Crea una variable de tipo Boolean y asigna a ella un valor de false. Luego, crea una variable de tipo String y asigna a ella el valor de la variable de Boolean convertida a String utilizando la función toString().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val bool:Boolean = false
    val str:String = bool.toString()
}
```
  
</details>

## Enunciado 15

Crea una variable de tipo Short y asigna a ella un valor de 123. Luego, crea una variable de tipo Int y asigna a ella el valor de la variable de Short convertida a Int.

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val numShort:Short = 123
    val numInt:Int = numShort.toInt()
}
```
  
</details>

## Enunciado 16

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Double y asigna a ella el valor de la variable de String convertida a Double utilizando la función toDouble().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val num:Double = str.toDouble()
}
```
  
</details>

## Enunciado 17

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Long y asigna a ella el valor de la variable de String convertida a Long utilizando la función toLong().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val num:Long = str.toLong()
}
```
  
</details>

## Enunciado 18

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Byte y asigna a ella el valor de la variable de String convertida a Byte utilizando la función toByte().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val num:Byte = str.toByte()
}
```
  
</details>

## Enunciado 19

Crea una variable de tipo Int y asigna a ella un valor de 123. Luego, crea una variable de tipo String y asigna a ella el valor de la variable de Int convertida a String utilizando la función toString().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val num:Int = 123
    val str:String = num.toString()
}
```
  
</details>

## Enunciado 20

Crea una variable de tipo String y asigna a ella un valor de "123". Luego, crea una variable de tipo Boolean y asigna a ella el valor de la variable de String convertida a Boolean utilizando la función toBoolean().

<details>
  <summary>Solucion</summary>

```kotlin
fun main(){
    val str:String = "123"
    val bool:Boolean = str.toBoolean()
    println(bool)
}
```

 Salida:

 ```kotlin 
 false
 ```

 La salida es "false" porque el método toBoolean() convierte una cadena a un valor booleano. En este caso, la cadena "123" no es un valor booleano válido, por lo que se interpreta como "falso" (false). El método toBoolean() considera las siguientes cadenas como verdaderas: "true", "True", "TRUE" y "1" y cualquier otra cadena es considerada como falsa.
 
</details>
