package tally.kotlininaction.basic

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    val given: String = "Kotlin"

    val lastChar = given.lastChar()

    println(lastChar)

    println("===============================")

    val list = arrayListOf(50, 10, 11, 1001)
    val min = list.min()
    println(min)

    println("===============================")

    val last = list.last()
    println(last)
}