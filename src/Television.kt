open class Television(
    private val brand: String,
    private val screenDiagonal: Double,
    private val soundPower: Double
) {
    open fun calculateQuality(): Double {
        return screenDiagonal + (0.05 * soundPower)
    }

    open fun displayInfo() {
        println("Фирма: $brand")
        println("Диагональ экрана: $screenDiagonal дюймов")
        println("Мощность звука: $soundPower дБ")
        println("Качество : ${calculateQuality()}")
    }
}

class AdvancedTelevision(
    brand: String,
    screenDiagonal: Double,
    soundPower: Double,
    private val country: String
) : Television(brand, screenDiagonal, soundPower) {

    override fun calculateQuality(): Double {
        val baseQuality = super.calculateQuality()
        return when (country) {
            "Япония" -> 2 * baseQuality
            "Сингапур", "Корея" -> 1.5 * baseQuality
            else -> baseQuality
        }
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Страна-производитель: $country")
        println("Качество: ${calculateQuality()}")
    }
}
