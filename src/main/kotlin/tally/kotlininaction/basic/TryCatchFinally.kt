package tally.kotlininaction.basic

class TryCatchFinally {

    fun readNumber(reader: String): Int? {
        return try {
            Integer.parseInt(reader)
        } catch (e: NumberFormatException) {
            null
        } finally {
//            reader.close()
        }
    }
}