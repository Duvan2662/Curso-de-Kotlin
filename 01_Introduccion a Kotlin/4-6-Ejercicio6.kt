/*
En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.

Paso 1
La función main() contiene un error de compilación:
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}
¿Puedes corregir el error de modo que el programa imprima este resultado?


Paso 2
El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea 
menos flexible a la hora de volver a usarlo. En su lugar, puedes extraer la operación de suma en una función add() para que el código se 
pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. Observa que el código ahora presenta una nueva 
variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber.

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

Define add() function below this line

¿Puedes definir la función add() de modo que el programa imprima este resultado?

Paso 3
Ahora tienes una función reutilizable capaz de sumar dos números.

¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para 
usar la función subtract(), de modo que puedas verificar que funcione como se espera.

Pista: Piensa en la diferencia entre la suma, la resta y otras operaciones matemáticas. Comienza a trabajar en el código de solución a partir de allí.
*/




//Paso 1 
//println("${firstNumber + secondNumber}")

//Paso 2
/* 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$result")
    println("$anotherResult")
}

fun add(number1:Int, number2:Int) : Int {
    return number1+number2
}
*/

//Paso 3
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val result2 = subtract(firstNumber, secondNumber)
    val anotherResult2 = subtract(firstNumber, thirdNumber)

    val result3 = multiplication(firstNumber, secondNumber)
    val anotherResult3 = multiplication(firstNumber, thirdNumber)

    val result4 = division(firstNumber, secondNumber)
    val anotherResult4 = division(firstNumber, thirdNumber)

    println("$result")
    println("$anotherResult")
    println("$result2")
    println("$anotherResult2")
    println("$result3")
    println("$anotherResult3")
    println("$result4")
    println("$anotherResult4")
}

fun add(number1:Int, number2:Int) : Int {
    return number1 + number2
}

fun subtract(number1:Int, number2:Int) : Int {
    return number1 - number2
}

fun multiplication (number1:Int, number2:Int) : Int {
    return number1 * number2
}

fun division(number1:Int, number2:Int) : Double {
    return number1 / number2
}





