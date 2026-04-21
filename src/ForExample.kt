class ForExample {
    fun runExample() {
        val items = listOf("orange", "banana", "kiwifruit","Grape fruit")
        for (item in items) {
            println(item)
        }
    }
}

fun main() {   // ✅ entry point
    val obj = ForExample()
    obj.runExample()
}