fun main() {
    val str = "Hello, World!"

    println("Tamanho da string: ${str.length}")
    println("Posição 0 da string: ${str[0]}")
    println(str.startsWith("Hel"))
    println(str.endsWith("bca"))

    println(str.substring(0..4))
    println(str.replace("World","Eric"))
    println(str.uppercase())
    println(str.lowercase())
    println("       Eu te amo            ".trim())
}