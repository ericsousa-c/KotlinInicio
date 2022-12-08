// Exercícios https://github.com/DevMasterTeam/Udemy-Andorid-Kotlin/blob/master/Secao%2006%20-%20Funcoes/Reforce%20seu%20aprendizado%20-%20Fun%C3%A7%C3%B5es.pdf

fun main() {
    converteAnos(2)

    val caracteres = numCaracteres("O rato")
    println(caracteres)

    val aoCubo = elevadoAoCubo(3)
    println(aoCubo)

    val distancia = milhaEmKm(10.0)
    println(distancia)

    trocaAPorX("O Eric e a BiancaA")
}

fun converteAnos(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos equivalem a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

fun numCaracteres(text: String) = text.length

fun elevadoAoCubo(num: Int) = num * num * num

fun milhaEmKm(dist: Double) = dist * 1.6

fun trocaAPorX (text: String) = println(text.replace("a","x",true).lowercase())



