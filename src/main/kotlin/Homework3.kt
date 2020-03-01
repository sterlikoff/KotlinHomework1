fun main() {

    println(timeAgoString(30)) // 30 секунд
    println(timeAgoString(90)) // 90 секунд
    println(timeAgoString(6 * 60)) // 6 минут
    println(timeAgoString(3 * 60 * 60)) // 3 часа
    println(timeAgoString(15 * 60 * 60 * 24)) // 15 дней
    println(timeAgoString(365 * 60 * 60 * 24)) // 1 год
    println(timeAgoString(3 * 365 * 60 * 60 * 24)) // 3 год

}

fun numericalWordForm(value: Int, form1: String, form2: String, form3: String): String {

    if (value in 10..20) return form3

    return when (value % 10) {

        1 -> form1
        in 2..4 -> form2
        else -> form3
    }

}

fun timeAgoString(timeAgo: Int): String {

    if (timeAgo < 60) return "менее минуты назад"

    if (timeAgo < 60 * 60) {

        val m: Int = timeAgo / 60
        return "$m ${numericalWordForm(m, "минуту","минуты","минут")} назад"

    }

    if (timeAgo < 60 * 60 * 24) {

        val h: Int = timeAgo / (60 * 60)
        return "$h ${numericalWordForm(h, "час", "часа", "часов")} назад"

    }

    if (timeAgo <= 60 * 60 * 24 * 365) {

        val d: Int = timeAgo / (60 * 60 * 24)
        return "$d ${numericalWordForm(d, "день", "дня", "дней")} назад"

    }

    return "больше года назад"

}