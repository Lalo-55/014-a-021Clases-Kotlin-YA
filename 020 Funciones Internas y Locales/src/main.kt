fun main() {
    /*
    20 - Funciones: internas o locales
    Kotlin soporta funciones locales o internas,
    es decir, una función dentro de otra función.
     */
    //problema1()

    ejercicio1()
}

fun problema1() {
    /*
    Problema 1
    Confeccionar una función que permita ingresar 10 valores por teclado y
    contar cuantos son múltiplos de 2 y cuantos son múltiplos de 5.
     */
    multiplos2y5()

}

fun multiplos2y5() {
    var multiDos = 0
    var multiCinco = 0
    fun multiplo(numero: Int, divisor: Int): Boolean = numero % divisor == 0
    fun pedirDato() = readln()!!.toInt()
    fun bucle() {
        for (iterador in 1..10) {
            println("Ingrese el valor")
            val num = pedirDato()
            if (multiplo(num, 2)) {
                println("$num es multiplo de 2")
                multiDos++
            }
            if (multiplo(num, 5)) {
                println("$num es multiplo de 5")
                multiCinco++
            }

        }
    }
    bucle()
    println("Multiplos de 2: $multiDos")
    println("Multiplos de 5: $multiCinco")
}

fun ejercicio1() {
    /*
    Confeccionar una función que permita cargar dos enteros y
    nos muestre el mayor de ellos. Realizar esta actividad con 5 pares
    de valores.
    Implementar una función interna que retorne el mayor de dos enteros.
     */
    dosEnteros()
}

fun dosEnteros() {
    fun mayoMenor(numero1: Int, numero2: Int) = if (numero1 > numero2) numero1 else numero2
    for (iterador in 1 .. 5){
        println("Ingresa el primer valor")
        val numero1 = readLine()!!.toInt()
        println("Ingresa el segundo valor")
        val numero2 = readLine()!!.toInt()
        println("el mayor es ${mayoMenor(numero1,numero2)}")
    }
}
