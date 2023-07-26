fun main() {

    //Double
    val destino1 : Double = 3.20
    val destino2 : Double = 4.10
    val destino3 : Double = 1.72
    val totalViaje : Double = destino1 + destino2 + destino3
    println("Total del viaje de los 3 destino: $totalViaje")

    //String
    val fechaManana : String = "La fecha de mañana es "
    val fecha : String = "27/07/2023"
    val mensaje : String = fechaManana + fecha + " que lo disfrutes"
    //Uso de comillas \" \"
    val mensaje2 = "Duvan David \"Hola\""
    println(mensaje2)
    //Salto de linea \n
    val mensaje3 = "Hola"
    val mensaje4 = "Mundo"
    println("$mensaje3 \n$mensaje4")

    //Boleanos
    val notificacionEncendidad : Boolean = true
    println("La notificacion esta encendida: $notificacionEncendidad")
    //concatenando con +
    println("La notificacion esta encendida: "  + notificacionEncendidad)
}