# Anidamiento de estructuras condicionales

El anidamiento de estructuras condicionales se refiere a la técnica de colocar una estructura condicional dentro de otra estructura condicional. Esto te permite crear lógicas de control de flujo más complejas en tu código.

Por ejemplo, puedes utilizar una sentencia "if" dentro de otra sentencia "if" para evaluar varias condiciones en un orden específico:

```kotlin
if (condicion1) {
    if (condicion2) {
        // si condicion1 y condicion2 son verdadero ...
    } else {
        // si  condicion 1 es verdaero ...
    }
} else {
    // si condicion1 es falso ...
}
```

También puedes utilizar una sentencia "when" dentro de una sentencia "if" o viceversa:

```kotlin
if (condicion) {
    when (expresion) {
        1 -> // si es igual a 1 ...
        2 -> // si es igual a 2 ...
    }
}
```

```kotlin
when (expresion) {
    1 -> if (condicion) {
            // si es igual a 1 y la condicion es true ...
        }
    2 -> if (condicion) {
            //si es igual a 2 y la condicion es true ...
        }
}
```

El anidamiento de estructuras condicionales se refiere a la técnica de colocar una estructura condicional dentro de otra estructura condicional. Esto te permite crear lógicas de control de flujo más complejas en tu código.

Por ejemplo, puedes utilizar una sentencia "if" dentro de otra sentencia "if" para evaluar varias condiciones en un orden específico:

if (condition1) {
    if (condition2) {
        // code to be executed if condition1 and condition2 are true
    } else {
        // code to be executed if condition1 is true and condition2 is false
    }
} else {
    // code to be executed if condition1 is false
}

También puedes utilizar una sentencia "when" dentro de una sentencia "if" o viceversa:

```kotlin
if (condition) {
    when (expression) {
        1 -> // si la condicion es true y el valor es igual a 1
        2 -> // si la condicion es true y el valor es igual a 2
    }
}

when (expression) {
    1 -> if (condition) {
            // si el valor es 1 y la condicion es true ...
        }
    2 -> if (condition) {
            // si el valor es 2 y la condicion es true ...
        }
}
```

Sin embargo, es importante tener cuidado al anidar varias estructuras condicionales, ya que puede hacer que tu código sea difícil de leer y mantener. Es recomendable utilizar el anidamiento de estructuras condicionales solo cuando sea necesario, y tratar de mantenerlo al mínimo.

En resumen, el anidamiento de estructuras condicionales es una técnica poderosa para crear lógicas de control de flujo complejas en tu código. Sin embargo, es importante usarlo con moderación y tratar de mantenerlo al mínimo para asegurar que el código sea fácil de leer y mantener.