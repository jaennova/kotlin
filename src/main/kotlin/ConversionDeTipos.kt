package my.demo
class ConversionDeTipos {
    fun conversion(){
        val unDosTres: String = "123"
        val variable2: Int = unDosTres.toInt()
        println("El valor de la variable2 es $variable2 y es del tipo ${variable2::class.simpleName}")

        // Ejemplo de conversión de número en coma flotante a cadena
        val variable3: Double = 123.45
        val variable4: String = variable3.toString()
        println("El valor de la variable4 es $variable4 y es del tipo ${variable4::class.simpleName}")

        // Ejemplo de conversión de entero a número en coma flotante
        val variable5: Int = 123
        val variable6: Double = variable5.toDouble()
        println("El valor de la variable6 es $variable6 y es del tipo ${variable6::class.simpleName}")

        // Ejemplo de conversión de cadena a booleano
        val variable7: String = "true"
        val variable8: Boolean = variable7.toBoolean()
        println("El valor de la variable8 es $variable8 y es del tipo ${variable8::class.simpleName}")

        // Ejemplo de conversión de número entero largo a cadena
        val variable9: Long = 123456789
        val variable10: String = variable9.toString()
        println("El valor de la variable10 es $variable10 y es del tipo ${variable10::class.simpleName}")

        // Ejemplo de conversión de entero corto a entero
        val variable11: Byte = 123
        val variable12: Int = variable11.toInt()
        println("El valor de la variable12 es $variable12 y es del tipo ${variable12::class.simpleName}")
    }
}

/*
En Kotlin, puedes especificar el nivel de visibilidad de una variable
o una función utilizando modificadores de acceso como private, public, internal y protected.

private: significa que la variable o la función sólo está disponible
dentro de la clase o el archivo en el que se ha declarado.

public: significa que la variable o la función está disponible para
cualquier clase o archivo en el proyecto. Esta es la visibilidad predeterminada
si no se especifica un modificador de acceso.

internal: significa que la variable o la función está disponible para cualquier
clase o archivo en el módulo en el que se ha declarado. Un módulo es un conjunto
de archivos de código fuente y otros recursos que se compilan juntos.

protected: significa que la variable o la función sólo está disponible dentro
de la clase o subclases en las que se ha declarado.

También puedes usar el modificador final para indicar que una variable o una
función no puede ser sobreescrita o reasignada.
*/