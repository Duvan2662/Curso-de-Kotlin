/*
Gmail tiene una función que envía notificaciones al usuario cada vez que se intenta acceder a una cuenta en 
un dispositivo nuevo.

En este ejercicio, escribirás un programa que muestra un mensaje a los usuarios con esta plantilla de mensaje:
There's a new sign-in request on operatingSystem for your Google Account emailId

Deberás implementar una función que acepte un parámetro operatingSystem y un parámetro emailId, cree un mensaje en el formato dado y lo muestre.
Por ejemplo, si se llamó a la función con "Chrome OS" para el operatingSystem y "sample@gmail.com" para el emailId, se debería mostrar esta cadena:
There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

Paso 1
¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
 Define your displayAlertMessage() below this line.
2¿El programa imprime este resultado?
There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.


Paso 2
Bien hecho. Mostraste el mensaje. Sin embargo, en algunos escenarios, notas que no puedes determinar el sistema operativo del usuario. 
En esos casos, deberás especificar el nombre del sistema operativo como Unknown OS. Puedes optimizar aún más el código para que no 
necesites pasar el argumento Unknown OS cada vez que se llame a la función.
¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima este resultado?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.
There's a new sign-in request on Windows for your Google Account user_two@gmail.com.
There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.

2Para imprimir el mensaje anterior, reemplaza la implementación de la función main() por la siguiente:
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

     //The following line of code assumes that you named your parameter as emailId.
     //If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
*/


//Paso 1
/* 
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(parameter1 : String, parameter2 : String) : String {
    var message = "There's a new sign-in request on $parameter1 for your Google Account $parameter2"
    return message
}

*/

//Paso 2

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

     //The following line of code assumes that you named your parameter as emailId.
     //If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}


fun displayAlertMessage(parameter1 : String = "Unknown OS", emailId : String) : String {
    var message = "There's a new sign-in request on $parameter1 for your Google Account $emailId"
    return message
}



