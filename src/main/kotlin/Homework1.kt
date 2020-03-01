fun main() {

    println(calculateFee(200, 11_000))
    println(calculateFee(500, 25_000, true))
    println(calculateFee(15000, 150000))
    println(calculateFee(10, 0, true))

}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean = false): Float {

    var percent: Int = when (total) {

        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        else -> 15

    }

    if (exclusive) percent -= 5;

    return amount * percent / 100F

}