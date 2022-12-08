fun main() {
    contString2("meep")

    contNum(321)
}

fun contNum(num: Int) {
    var i = 0
    while (i < num) {
        print("$i ")
        i++

    }
    print("\n")
}

fun contString2(str: String) {
    var i = 0
    while (i < str.length) {
        print(str[i])
        i++
    }
    print("\n")
}