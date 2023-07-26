
fun main () {

    val numero : Int = 5 //Declara una variable con un tipo de dato
    val numero2 = 10 //Kotlin sabe que tipo de dato es la variable


    println("Esta es la variable declarada $numero")
    println("Esta es la segunda variable declarada $numero2")

    //Se utiliza val cuando la variable no va a cambiar durante el programa
    //Se utiliza var cuando queremos que la variable cambie durante el programa

    var numero3 : Int = 15
    println("Esta es una variable que puede cambiar de valor $numero3")

    numero3 = 26
    println("Aqui ya cambio de valor $numero3")
}