# Null safety

El null safety es una característica de Kotlin que ayuda a prevenir errores debido a la asignación o uso de valores nulos (null) en una aplicación.

Por defecto, en Kotlin, todas las variables deben tener un valor asignado al ser declaradas y no se permite asignarles el valor null. Si se quiere permitir que una variable pueda tener un valor nulo, se debe declarar explícitamente utilizando el operador "?". Por ejemplo:

```kotlin
var nombre: String = "Juan" // no puede ser nulo
var apellido: String? = "Pérez" // puede ser nulo
```

Para acceder a un valor que puede ser nulo, se deben utilizar los operadores "?." o "?:"

* El operador "?." se utiliza para acceder a una propiedad o llamar un método en un objeto que puede ser nulo, retornando null si el objeto es null.

* El operador "?:" se utiliza para proporcionar un valor por defecto si el valor es null.


Además, Kotlin también proporciona una sintaxis especial para trabajar con valores nulos de forma segura utilizando el bloque "let" o "run"

En resumen, el null safety es una característica de Kotlin que ayuda a prevenir errores al trabajar con valores nulos y a facilitar la escritura de código seguro y legible.