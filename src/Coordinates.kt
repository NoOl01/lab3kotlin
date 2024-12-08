// Классы 👍👍👍

open class CoordinateX {
    val x1 = 2.0
    val x2 = 2.0
    val x3 = 6.0
    val x4 = 6.0
}

open class CoordinateY {
    val y1 = 2.0
    val y2 = 5.0
    val y3 = 2.0
    val y4 = 5.0
}

class Coordinates(
    private val coordinateX: CoordinateX,
    private val coordinateY: CoordinateY,
    private val c: Double
) {

    fun processCoordinates(): List<Double> {
        val coords = listOf(
            (coordinateX.x1 + c) * (coordinateY.y1 + c),
            (coordinateX.x2 + c) * (coordinateY.y2 + c),
            (coordinateX.x3 + c) * (coordinateY.y3 + c),
            (coordinateX.x4 + c) * (coordinateY.y4 + c)
        )
        return coords
    }
}