# Funciones con parámetros opcionales y valores por defecto

## Enunciados
1. Crea una función llamada `saludar` que tome un parámetro obligatorio `nombre` y un parámetro opcional `saludo`. Si el parámetro `saludo` no se proporciona, la función debería imprimir "Hola, {nombre}!". Si se proporciona, la función debería imprimir el saludo junto con el nombre.

2. Define una función llamada `calcular_area_rectangulo` que tome dos parámetros obligatorios `base` y `altura`, y un parámetro opcional `unidades` con un valor por defecto de "metros cuadrados". La función debe calcular el área del rectángulo utilizando los parámetros proporcionados y devolver una cadena que indique el área junto con las unidades.

3. Escribe una función llamada `crear_persona` que tome dos parámetros obligatorios `nombre` y `edad`, y dos parámetros opcionales `sexo` y `ocupacion` con valores por defecto de "No especificado" y "Desocupado" respectivamente. La función debe devolver un diccionario que represente a una persona con los datos proporcionados.

4. Desarrolla una función llamada `imprimir_tabla_multiplicar` que tome un parámetro obligatorio `numero` y un parámetro opcional `limite` con un valor por defecto de 10. La función debe imprimir la tabla de multiplicar del número proporcionado hasta el límite especificado.

5. Crea una función llamada `comprar_producto` que tome un parámetro obligatorio `producto`, un parámetro opcional `cantidad` con un valor por defecto de 1, y un parámetro opcional `precio_unitario` con un valor por defecto de 0. La función debe calcular el precio total multiplicando la cantidad por el precio unitario y devolver el resultado.

6. Define una función llamada `imprimir_frase` que tome un parámetro obligatorio `frase` y dos parámetros opcionales `repeticiones` y `puntuacion` con valores por defecto de 1 y "." respectivamente. La función debe imprimir la frase el número de veces especificado y añadir la puntuación al final de cada repetición.

7. Escribe una función llamada `calcular_edad` que tome un parámetro obligatorio `anio_nacimiento` y un parámetro opcional `anio_actual` con un valor por defecto de 2022. La función debe calcular la edad de una persona basada en los años proporcionados y devolver el resultado.

8. Desarrolla una función llamada `sumar_elementos` que tome una lista como parámetro obligatorio y un parámetro opcional `inicio` con un valor por defecto de 0. La función debe sumar todos los elementos de la lista comenzando desde el índice especificado por `inicio`.

9. Crea una función llamada `construir_casa` que tome un parámetro obligatorio `material` y dos parámetros opcionales `habitaciones` y `patio` con valores por defecto de 2 y True respectivamente. La función debe devolver una cadena que describa la construcción de una casa con los parámetros proporcionados.

10. Define una función llamada `calcular_interes` que tome un parámetro obligatorio `capital` y dos parámetros opcionales `tasa` y `tiempo` con valores por defecto de 0.05 y 1 respectivamente. La función debe calcular el interés simple utilizando la fórmula I = P * r * t y devolver el resultado.