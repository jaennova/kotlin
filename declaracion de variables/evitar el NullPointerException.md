# Uso de "?." y "!!" en Kotlin para evitar el NullPointerException

En Kotlin, el uso de los operadores "?." y "!!" es una forma de trabajar con valores nulos de forma segura y evitar el lanzamiento de una excepción "NullPointerException".

El operador "?." se utiliza para acceder a una propiedad o llamar un método en un objeto que puede ser nulo, retornando null si el objeto es null. Por ejemplo:

```kotlin
val nombre: String? = "Juan"
val longitud = nombre?.length // longitud = 4
```

En este caso, se está accediendo a la propiedad "length" del objeto "nombre" utilizando el operador "?.". Si "nombre" fuera nulo, la expresión "nombre?.length" retornaría null en lugar de lanzar una excepción.

Por otro lado, el operador "!!" se utiliza para indicar que una variable no debería ser nula. Si se intenta acceder a una propiedad o llamar un método en un objeto nulo utilizando el operador "!!", se lanzará una excepción "NullPointerException". Por ejemplo:

```kotlin
val nombre: String? = "Juan"
val longitud = nombre!!.length // longitud = 4
```

En este caso, se está accediendo a la propiedad "length" del objeto "nombre" utilizando el operador "!!". Si "nombre" fuera nulo, se lanzaría una excepción "NullPointerException"

En resumen, el uso de los operadores "?." y "!!" en Kotlin es una forma de trabajar con valores nulos de forma segura y evitar el lanzamiento de excepciones "NullPointerException". El operador "?." permite acceder a una propiedad o llamar un método en un objeto que puede ser nulo retornando null si el objeto es null, mientras que el operador "!!" indica que una variable no debería ser nula y se lanzará una excepción si es nula.

> Es importante mencionar que si deseas evitar el uso de !! y no quieres que tu aplicacion se detenga en caso de que una variable sea nula, es importante utilizar el operador "?." para trabajar de forma segura con variables nulas.