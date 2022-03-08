package countryHen

import abstractHen.Hen

class UkrainianChicken(override val countEggsPerMonth: Int = 25) : Hen() {
    override val country: String = "Ukraine"

    override fun getCountOfEggsPerMonth(): Int = countEggsPerMonth
    override fun getDescription(): String = "I am chicken from $country. I am lay $countEggsPerMonth eggs per month"
}