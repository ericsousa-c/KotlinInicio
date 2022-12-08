//Exercícios https://github.com/DevMasterTeam/Udemy-Andorid-Kotlin/blob/master/Secao%2007%20-%20Controle%20de%20fluxo/Reforce%20seu%20aprendizado%20-%20If%20else.pdf

fun main() {

    eQuadrado()

    eTrianguloEquilatero()

    portariaEvento()
}

fun eQuadrado() {
    println("Insira o lado 1:")
    val lado1 = readlnOrNull()
    println("Insira o lado 2:")
    val lado2 = readlnOrNull()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) println("É um quadrado") else println("Não é um quadrado")
    }
}

fun eTrianguloEquilatero() {
    println("Insira o lado 1:")
    val lado1 = readlnOrNull()
    println("Insira o lado 2:")
    val lado2 = readlnOrNull()
    println("Insira o lado 3:")
    val lado3 = readlnOrNull()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val a = lado1.toInt()
        val b = lado2.toInt()
        val c = lado1.toInt()

        if (a == b && b == c) println("É um Triângulo Equilátero!") else println("Não é um Triângulo Equilátero!")
    }
}

fun portariaEvento() {
    println("Digite sua idade:")
    val id = readlnOrNull()
    println("Insira o tipo do seu convite:")
    val convite = readlnOrNull()?.lowercase()
    println("Insira o código do seu convite:")
    val codConvite = readlnOrNull()?.lowercase()

    if (id != null && id != "") {
        val idade = id.toInt()

        if (idade < 18) println("Negado. Menores de idade não são permitidos")
        else {
            if (convite == "premium" || convite == "luxo") if (codConvite != "XL") println("Negado. Convite inválido") else println(
                "Welcome!"
            )
            else if (convite == "comum") if (codConvite != "XT") println("Negado. Convite inválido") else println("Welcome!")
            else println("Negado. Convite inválido")
        }
    }
}
