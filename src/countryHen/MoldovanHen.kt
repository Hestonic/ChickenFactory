package countryHen

import abstractHen.Hen

class MoldovanHen(override val countEggsPerMonth: Int = 16) : Hen() {
    override val country: String = "Moldova"

    override fun getCountOfEggsPerMonth(): Int = countEggsPerMonth
    override fun getDescription(): String = "I am chicken from $country. I am lay $countEggsPerMonth eggs per month"
}

/*
private val countEggsPerMonth: Int = 16

    private val country = "Moldova"
    override fun getCountOfEggsPerMonth(): Int = countEggsPerMonth
    override fun getDescription(): String = "I am chicken from $country. I am lay $countEggsPerMonth eggs per month"
    */