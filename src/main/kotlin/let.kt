fun main() {
    val string: String? = null

    string?.let {
        val strMin = it.lowercase()
        print(strMin)
    }
}