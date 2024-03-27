# Estructuras de Datos en Kotlin

Kotlin proporciona una amplia variedad de estructuras de datos útiles para organizar y manipular datos en programas. Esta guía cubre algunas de las estructuras de datos más importantes en Kotlin.

## Arreglos (Arrays)

Los arreglos son colecciones mutables de elementos con acceso aleatorio por índice. Se declaran con `arrayOf()`:

```kotlin
val numbers = arrayOf(1, 2, 3) 
```

Se puede acceder a elementos específicos por su índice:

```kotlin
val first = numbers[0] // 1
```

## Listas (Lists)

Las listas son colecciones ordenadas de elementos. Se declaran con `listOf()` para listas inmutables o `mutableListOf()` para listas mutables:

```kotlin
val numbers = listOf(1, 2, 3)
val mutableNumbers = mutableListOf(1, 2, 3)
```

Permiten acceso por índice, iteración, etc.

## Sets

Los sets son colecciones desordenadas de valores únicos. Se declaran con `setOf()` o `mutableSetOf()`: 

```kotlin
val numbers = setOf(1, 1, 2, 3) // {1, 2, 3}
```

Son útiles para eliminar duplicados.

## Maps (Diccionarios)

Los maps asocian llaves (keys) con valores. Se declaran con `mapOf()`:

```kotlin 
val peopleAges = mapOf("John" to 20, "Mary" to 25)
```

Permiten búsqueda eficiente por llave.

## Ranges

Los rangos representan un intervalo de valores enteros. Se declaran con el operador `..`:

```kotlin
val oneToTen = 1..10 
```


## Árboles (Trees)

Los árboles son estructuras jerárquicas de nodos conectados. 

Se pueden construir árboles personalizados:

```kotlin
data class TreeNode(val value: Int, val children: List<TreeNode>)

val tree = TreeNode(1, listOf(TreeNode(2, emptyList()), TreeNode(3, emptyList()))) 
```

O usar clases provistas por librerías como RedBlackTree, AVLTree, etc.

## Grafos (Graphs) 

Los grafos consisten en nodos conectados mediante aristas. Se pueden representar con:

- Matriz de adyacencia 
- Lista de adyacencia
- Objetos Vertex y Edge

Y recorrer con algoritmos como BFS, DFS, Dijkstra, etc.

## Colas (Queues)

Las colas siguen el orden FIFO (primero en entrar, primero en salir). En Kotlin se pueden implementar con:

```kotlin
class Queue<T> {

  private val elements = mutableListOf<T>()
  
  fun enqueue(element: T) {
    elements.add(element) 
  }
  
  fun dequeue(): T {
    return elements.removeAt(0) 
  }

}
```

## Pilas (Stacks)

Las pilas siguen el orden LIFO (último en entrar, primero en salir). Se implementan de manera similar a las colas:

```kotlin
class Stack<T> {

  private val elements = mutableListOf<T>()  
  
  fun push(element: T) {
    elements.add(element)
  }
  
  fun pop(): T {
    return elements.removeAt(elements.size - 1)
  }

}
```

Kotlin facilita la implementación de estructuras de datos complejas cuando se necesitan.

Son útiles en bucles `for` y otras situaciones.

Kotlin simplifica y unifica el uso de estructuras de datos. La [documentación oficial](https://kotlinlang.org/docs/collections-overview.html) contiene más detalles.