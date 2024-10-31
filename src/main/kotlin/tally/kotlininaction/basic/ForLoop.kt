package tally.kotlininaction.basic

class ForLoop {

    fun loop() {
        val list = arrayListOf("10", "11", "1001")
        for ((index, element) in list.withIndex()) {
            println("$index: $element")
        }
    }

    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..."
    }
}