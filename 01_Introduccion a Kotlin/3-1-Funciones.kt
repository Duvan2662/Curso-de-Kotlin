fun main() {
    saludoDeCumpleanos()
    println(saludoCumpleanos2())
    println(saludoCumpleanos3("Julio"))
    println(saludoCumpleanos4("Sofia",18))

    println(saludoCumpleanos4(edad=23,nombre="trifon"))//argumentos con nombre se le pasan los argumentos a la varibles de la funcion
    println(saludoCumpleanos5(edad = 66))

}


/*DECLARACION DE FUNCIONES
fun nombreDeLaFuncion(parametros) : TipoDeDatoQueRetorna{

    return
}
*/

//Unit es vacio es como void = Unit en algunos lenguajes 
//Osea que la siguiente funcion no retorna nada es de tipo void 
fun saludoDeCumpleanos() : Unit {
    println("Feliz cumpleaños Duvan!!")
    println("Ya tienes 23")
}

//Funcion que retorna un String
fun saludoCumpleanos2() : String {
    val nombre : String = "Feliz cumpleaños Daniel!!"
    val edad : String = "Ya tienes 21"
    val mensaje = "$nombre\n$edad"
    return mensaje 
}


//Funcion que retorna un nombre y recibe un parametro
fun saludoCumpleanos3(nombre : String) : String {
    val name : String = "Feliz cumpleaños $nombre!!"
    val edad : String = "Ya tienes 21"
    val mensaje = "$name\n$edad"
    return mensaje
}

//funcion que retorna y recibe mas de un parametro
//Revise tambien la linea 7 argumentos con nombre de los parametros de la funcion

fun saludoCumpleanos4(nombre : String, edad : Int) : String {
    val name : String = "Feliz cumpleaños $nombre!!"
    val age : String = "Ya tienes $edad"
    val mensaje = "$name\n$age"
    return mensaje
}


//Funcion que retorna y recibe mas de un parametro con parametros predeterminados
fun saludoCumpleanos5(nombre : String = "Predeterminado", edad : Int) : String {
    val name : String = "Feliz cumpleaños $nombre!!"
    val age : String = "Ya tienes $edad"
    val mensaje = "$name\n$age"
    return mensaje
}

