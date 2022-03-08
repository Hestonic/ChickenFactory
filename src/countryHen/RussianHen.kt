package countryHen

import abstractHen.Hen

class RussianHen(override val countEggsPerMonth: Int = 31) : Hen() {
    override val country: String = "Russia"

    override fun getCountOfEggsPerMonth(): Int = countEggsPerMonth
    override fun getDescription(): String = "I am chicken from $country. I am lay $countEggsPerMonth eggs per month"
}