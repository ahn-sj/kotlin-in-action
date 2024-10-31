package tally.kotlininaction.basic

fun main() {
    KotlinInterfaceMain().helloClick()
}

class KotlinInterfaceMain: KotlinInterface {

    fun helloClick() {
        click()
        click()
        click()
        click()
        click()
    }
}

interface KotlinInterface {
    fun click() = println("click!!!")
}