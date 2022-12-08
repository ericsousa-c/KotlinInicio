fun main() {
    compPatrimonio()
}

fun saldoInvestAna(): Float {
    val salario = 10000.00f
    return (salario * 0.05f) * 2
}

fun saldoInvestPaula(): Float {
    val salario = 10000.00f
    return salario * 0.05f
}

fun compPatrimonio() {
    var mes = 0
    var patrimonioAna = 0f
    var patrimonioPaula = 0f

    do {
        patrimonioAna += saldoInvestAna() + patrimonioAna * 0.002f
        patrimonioPaula += saldoInvestPaula() + patrimonioPaula * 0.008f
        mes++
    } while (patrimonioPaula < patrimonioAna)
    println("Foram necessarios $mes meses!")
    println("Ana com R$ $patrimonioAna\nPaula comR$ $patrimonioPaula")
}