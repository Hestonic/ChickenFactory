package countryHen

import abstractHen.Hen

class BelarusianHen(override val countEggsPerMonth: Int = 100) : Hen() {
    override val country: String = "Belarus"

    override fun getCountOfEggsPerMonth(): Int = countEggsPerMonth
    override fun getDescription(): String = "I am chicken from $country. I am lay $countEggsPerMonth eggs per month"
}