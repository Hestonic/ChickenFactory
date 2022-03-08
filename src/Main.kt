import countryHen.BelarusianHen
import countryHen.MoldovanHen
import countryHen.RussianHen
import countryHen.UkrainianChicken

fun main() {
    val russianHen = RussianHen()
    val ukrainianChicken = UkrainianChicken()
    val belarusianHen = BelarusianHen()
    val moldovanHen = MoldovanHen()

    val henFactory = HenFactory()
    println(henFactory.getHen(russianHen.country))
    println(henFactory.getHen(ukrainianChicken.country))
    println(henFactory.getHen(belarusianHen.country))
    println(henFactory.getHen(moldovanHen.country))
    println(henFactory.getHen("USA"))
}