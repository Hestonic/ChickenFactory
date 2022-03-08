import abstractHen.Hen

class HenFactory {
    fun getHen(henCountry: String): String {
        return when (henCountry) {
            "Russia" -> "Galan"
            "Ukraine" -> "Bovans"
            "Belarus" -> "Leghorn"
            "Moldova" -> "Australorp"
            else -> "Failed to recognize"
        }
    }
}
