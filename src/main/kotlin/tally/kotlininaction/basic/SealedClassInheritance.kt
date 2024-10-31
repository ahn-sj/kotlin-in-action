package tally.kotlininaction.basic

class SealedClassInheritance {
}

sealed class sealedClass {
    class A : sealedClass()
    class B : sealedClass()
}

class parentClass : sealedClass() {
    class C : sealedClass()
}