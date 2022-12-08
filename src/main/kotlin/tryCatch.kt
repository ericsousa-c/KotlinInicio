fun main() {
    try {
        val str: String? = null
        println(str.length)
        val num = 10 / 0
    } catch (e: NullPointerException) {
        println("Variavel nula!")
    } catch (e: ArithmeticException) {
        println("Impossivel divisao por 0!")
    } catch (e: Exception) {
        println("Generica")
    } finally {
        println("Sempre executado")
    }
}