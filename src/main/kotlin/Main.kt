fun main() {
    println(calcCommission(1000))
    println(calcCommission(10000))

}

fun calcCommission(amount: Int, rate: Float = 0.0075F, minCommission: Float = 35F): Float {
    val commission = amount * rate
    return if (commission < minCommission) minCommission else commission
}