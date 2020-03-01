fun main() {

    println(verdict(bodyMassIndex(202F, 96F)))
    println(verdict(bodyMassIndex(172F, 54F)))
    println(verdict(bodyMassIndex(199F, 53F)))
    println(verdict(bodyMassIndex(175F, 105F)))

}

fun verdict(index: Float): String {

    return when (index) {

        in 0F..16F -> "Выраженный дефицит массы тела"
        in 16F..18.5F -> "Недостаточная (дефицит) масса тела"
        in 18.5F..24.99F -> "Норма"
        in 25F..30F -> "Избыточная масса тела (предожирение)"
        in 30F..35F -> "Ожирение"
        in 35F..40F -> "Ожирение резкое"
        else -> "Очень резкое ожирение"

    }

}

fun bodyMassIndex(h: Float, m: Float): Float {

    val hm = h / 100F
    return m / (hm * hm);

}