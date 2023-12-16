import java.util.Scanner

// Ulises Castell y Carlos Capó

fun main () {
    val scanner:Scanner = Scanner(System.`in`)
    println("Calcule el precio de su coche usado.")

    val purchasePrice:Float = getFloat("Escriba el precio de mercado del vehículo: ", scanner)
    val km:Float = getFloat("Escriba los kilómetros que tiene su coche: ", scanner)
    val finalPrice:Float = calculatePrice(purchasePrice, km)

    println("\nEl precio actual de su coche es de $finalPrice€")
}

fun calculatePrice (purchasePrice:Float, km:Float):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    return purchasePrice - wearPrice
}

fun getFloat(msg:String, scanner:Scanner):Float {
    print(msg)

    var inputFloat:Boolean
    var float:Float = 0f
    do {
        inputFloat = scanner.hasNextFloat()

        if (inputFloat) {
            float = scanner.nextFloat()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputFloat)

    return float
}
