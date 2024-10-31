package tally.kotlininaction.basic

import tally.kotlininaction.basic.InterfaceExpression.*

class IfWhenCast {

    fun eval(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.left) + eval(e.right)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

    fun evalV2(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalV2(e.left) + evalV2(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }
}