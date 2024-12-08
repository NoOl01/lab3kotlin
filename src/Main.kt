import kotlin.math.pow
import kotlin.math.sqrt


fun main() {
    val X = CoordinateX()
    val Y = CoordinateY()
    val side1 = distance(X.x1, Y.y1, X.x2, Y.y2)
    val side2 = distance(X.x2, Y.y2, X.x4, Y.y4)
    val side3 = distance(X.x4, Y.y4, X.x3, Y.y3)
    val side4 = distance(X.x3, Y.y3, X.x1, Y.y1)
    val p = (side1 + side2 + side3 + side4)
    println("Периметр прямоугольника: $p")
    print("Введите C: ")
    val c = readLine()!!.toDouble()

    val coordinates = Coordinates(X, Y, c).processCoordinates()

    println(coordinates)
    println()

    television()
}

fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
}

fun television() {
    val basicTv = Television("Samsung", 55.0, 20.0)
    basicTv.displayInfo()

    println()

    val advancedTvJapan = AdvancedTelevision("Sony", 65.0, 25.0, "Япония")
    advancedTvJapan.displayInfo()

    println()

    val advancedTvKorea = AdvancedTelevision("LG", 50.0, 15.0, "Корея")
    advancedTvKorea.displayInfo()

    println()

    val advancedTvOther = AdvancedTelevision("Philips", 42.0, 10.0, "Германия")
    advancedTvOther.displayInfo()
}