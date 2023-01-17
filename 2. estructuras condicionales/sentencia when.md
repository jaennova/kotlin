# Sentencia when

La sentencia "when" en Kotlin es similar a la sentencia "switch" en otros lenguajes de programación. Se utiliza para evaluar una expresión y ejecutar un bloque de código correspondiente a uno de varios posibles valores. La sintaxis básica es la siguiente:

```kotlin
when (expresion) {
    valor1 -> {
        // codigo que se ejecuta si la expresion es igual al valor1
    }
    valor2 -> {
        // codigo que se ejecuta si la expresion es igual al valor2
    }
    // ...
    else -> {
        // codigo que se ejecuta si la expresion no coincide con ningun valor
    }
}
```

La expresión puede ser de cualquier tipo y los valores pueden ser constantes o variables. También puedes utilizar intervalos de valores, comparaciones y expresiones complejas para determinar qué bloque de código ejecutar.

Una de las ventajas de "when" es que no requiere que los valores sean constantes, es decir, te permite evaluar cualquier tipo de expresión, como una variable, un objeto, una función, etc.

Además, "when" también es muy expresivo y legible, ya que puedes poner una etiqueta (string) a cada bloque de código que ayuda a comprender mejor el código.

En resumen, la sentencia "when" es una herramienta muy versátil para controlar el flujo de ejecución de tu código en Kotlin, ya que te permite evaluar una expresión y ejecutar un bloque de código correspondiente a uno de varios posibles valores. Es más expresivo y legible que el uso de varios if-else y te permite evaluar cualquier tipo de expresión.