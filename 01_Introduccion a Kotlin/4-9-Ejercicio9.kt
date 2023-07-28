/*
Los teléfonos celulares modernos tienen una función integrada que registra el tiempo de uso 
(es decir, el tiempo que usas el teléfono cada día).

En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el 
teléfono hoy y ayer. La función acepta dos parámetros de números enteros y muestra un valor booleano.

El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos 
de uso de ayer. La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. 
De lo contrario, muestra un valor false.

Por ejemplo, si llamaste a la función con estos argumentos con nombre:

timeSpentToday = 300 y timeSpentYesterday = 250, la función muestra un valor true.
timeSpentToday = 300 y timeSpentYesterday = 300, la función muestra un valor false.
timeSpentToday = 200 y timeSpentYesterday = 220, la función muestra un valor false.
Pista: El operador de comparación > muestra un valor true si el valor anterior al operador es mayor que el que aparece después de este. 
De lo contrario, muestra un valor false.
*/

fun main (){

    println("Have I spent more time using my phone today: ${comparacion(300,250)}")
    println("Have I spent more time using my phone today: ${comparacion(300,300)}")
    println("Have I spent more time using my phone today: ${comparacion(200,220)}")
}

fun comparacion(timeSpentToday:Int,timeSpentYesterday:Int):Boolean {
    return timeSpentToday > timeSpentYesterday
}

