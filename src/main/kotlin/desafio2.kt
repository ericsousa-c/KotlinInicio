fun main() {
    numCrescente()
    println()
    numDecrescente()
    println()
    numCrescenteExc5()
    println()
    soma1A500()
    println()
    escada(2)
    println()
    caixaDagua()
    println()
    fizzBuzz()
    println()
    textoContrario("Meu nome é Eric")
    println()
    contXO("xxoxo")
}

fun numCrescente() {
    for (i in 1..50)
        print("$i ")
}

fun numDecrescente() {
    for (i in 50 downTo 1)
        print("$i ")
}

fun numCrescenteExc5() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun soma1A500() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    print(soma)
}

fun escada(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun caixaDagua() {
    var caixa = 0
    var baloes = 0
    while (caixa <= 1993) {
        baloes++
        caixa += 7
    }
    println("São necessários $baloes!")
}

fun fizzBuzz() {
    var num = 1
    while (num <= 50) {
        if (num % 15 == 0) {
            print("FizzBuzz ")
            num++
        } else if (num % 5 == 0) {
            print("Fizz ")
            num++
        } else if (num % 3 == 0) {
            print("Buzz ")
            num++
        }
        print("$num ")
        num++
    }
}

fun textoContrario(str: String) {
    var cont = 1
    while (cont <= str.length) {
        print(str[str.length - cont])
        cont++
    }
}

fun contXO(str: String) :Boolean {
    val text = str.lowercase()
    var cont = 0
    var quantO = 0
    var quantX = 0
    while (cont < text.length) {
        if (str[cont] == 'x') {
            quantX ++
        } else if (str[cont] == 'o') {
            quantO ++
        }
        cont++
    }
    return quantO == quantX && contXO != 0
}