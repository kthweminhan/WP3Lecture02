class ForExample {
    fun runExample() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }
}

fun main() {   // ✅ entry point
    val obj = ForExample()
    obj.runExample()
}