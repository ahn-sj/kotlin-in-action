package tally.kotlininaction.basic

class User(
    val id: Int,
    val name: String,
    val address: String = "무주택"
)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser(User(1, "Two"))
    saveUser(User(2, "Alice"))
    saveUser(User(3, "Bob", "Street"))
}