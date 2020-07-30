package enum

enum class Operating(val sign: String, val operating: (Int, Int) -> Int) {
    ADD("+", { x, y -> x + y }),
    SUB("-", { x, y -> x - y }),
    MUL("*", { x, y -> x * y }),
    DIV("/", { x, y -> if (y < 1) throw Exception("1보다 작은 수 나누기 금지") else x / y });


    companion object {
        fun checkSign(sign: String): Operating {
            return values().firstOrNull { it.sign == sign } ?: throw IllegalArgumentException("사칙연산이 아닙니다.")
        }
    }
}

fun main() {
    println(Operating.checkSign("+").operating(1,2))
    println(Operating.checkSign("-").operating(1,2))
    println(Operating.checkSign("*").operating(1,2))
    println(Operating.checkSign("/").operating(4,2))
}