# Funciones inlining

En Kotlin, las funciones pueden ser marcadas como "inline" para indicarle al compilador que debe insertar (o "inline") el cuerpo de la función directamente en el lugar donde se llama, en lugar de hacer una llamada a la función. Esto puede mejorar el rendimiento al evitar el overhead de hacer una llamada a una función, pero aumenta el tamaño del código generado.

Para marcar una función como inline, se utiliza la palabra clave "inline" antes del nombre de la función. Por ejemplo:

```kotlin
inline fun sumaInline(num1: Int, num2: Int): Int {
    return num1 + num2
}
```

Además de las funciones regulares, también se pueden marcar como inline las funciones lambda y las funciones anidadas, estas son particularmente útiles para mejorar el rendimiento en algunas situaciones.

Sin embargo, es importante tener en cuenta que el uso excesivo de funciones inlining puede aumentar significativamente el tamaño del código generado, lo que puede afectar negativamente el rendimiento en dispositivos con recursos limitados. Por lo tanto, es importante usar el inlining con moderación y evaluar cuidadosamente el impacto en el rendimiento antes de marcar una función como inline.

Además, es importante tener en cuenta que algunas funciones no deben ser marcadas como inline. Por ejemplo, funciones que contienen un bucle infinito, un bloque de código sincronizado o una llamada a "return" no deben ser marcadas como inline.

En general, el inlining es una herramienta útil para mejorar el rendimiento en algunas situaciones específicas, pero debe ser utilizado con precaución y después de evaluar cuidadosamente el impacto en el rendimiento.