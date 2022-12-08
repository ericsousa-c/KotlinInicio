fun main() {

    var i = 0
    while (i < 1000) {

        if (i < 301) {
            i++
            continue
        }

        if (i == 900) {
            print("Fim!")
            break
        }

        print("$i ")
        i++
    }
}