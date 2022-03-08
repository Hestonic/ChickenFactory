package abstractHen

abstract class Hen {
    abstract val country: String
    abstract val countEggsPerMonth: Int
    abstract fun getCountOfEggsPerMonth(): Int
    open fun getDescription(): String = "I am chicken"
}