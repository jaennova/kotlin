//En Kotlin, la asignación de valores a variables se realiza mediante el operador "=". 
//Por ejemplo, si desea asignar el valor 5 a una variable llamada "num", puede escribir:
var num = 5

//También se puede asignar un valor a una variable existente utilizando el operador "=". Por ejemplo:
var num2 = 5
num2 = 7 // asigna el valor 7 a la variable num2


//Kotlin también admite el uso de "destructuring declarations" para asignar varios valores a varias variables en una sola línea. 
// Por ejemplo:
val (x, y) = Pair(1, 2) // asigna el valor 1 a x y el valor 2 a y


// Además, también se puede asignar el valor de una variable a otra variable. 
// Por ejemplo:
var a = 5
var b = a // asigna el valor de 'a' a 'b'

// Por último es importante mencionar que en kotlin es posible especificar el tipo de variable y su valor al mismo tiempo
// como en el siguiente ejemplo:
val name: String = "John"
