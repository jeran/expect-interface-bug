package dev.jeran.expectinterfacebug

class Implementation : InterfaceWithGenerics<String> {

    override fun function() {
        println("hello")
    }
}
