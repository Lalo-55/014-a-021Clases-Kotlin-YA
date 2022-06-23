fun main() {
    /*17 - Funciones: con una única expresión
    Las funciones de una única expresión se pueden expresar en Kotlin sin el bloque
    de llaves y mediante una asignación indicar el valor que retorna.
    Recordemos que uno de los objetivos en Kotlin es permitirnos implementar
    los algoritmos en la forma más concisa posible.
    Resolveremos algunas de las funciones ya planteadas utilizando esta nueva sintaxis.
     */

    //problema3()

    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    ejercicio4()
}

fun problema3() {
/*
Confeccionar una función reciba un entero comprendido entre 1 y 5 y nos
retorne en castellano dicho número o un String con la cadena "error" si no
está comprendido entre 1 y 5.
 */
    for (iterators in 0..8) {
        println(convertirNumeroProblema3(iterators))
    }
}

fun convertirNumeroProblema3(iterators: Int) = when (iterators) {
    1 -> "uno"
    2 -> "Dos"
    3 -> "Tres"
    4 -> "Cuatro"
    5 -> "Cinco"
    6 -> "Seis"
    else -> "mayor que seis"
}

private fun ejercicio1() {
    /*
    Elaborar una función que reciba tres enteros y nos retorne
    el valor promedio de los mismos.
     */
    println("Ingrese el primer numero")
    val num1 = pedirDato()
    println("Ingrese el segundo numero")
    val num2 = pedirDato()
    println("Ingrese el tercer numero")
    val num3 = pedirDato()

    println("El promedio de esos numeros es: ${promedio(num1, num2, num3)}")
}

fun promedio(num1: Int, num2: Int, num3: Int) = (num1 + num2 + num3) / 3

fun pedirDato() = readLine()!!.toInt()

private fun ejercicio2() {
    /*
    Elaborar una función que nos retorne el perímetro de un cuadrado
    pasando como parámetros el valor del lado.
     */
    println("Ingrese el valor del lado del cuadrado")
    val lado = pedirDato()

    println("El perimetro del cuadrado es ${perimetro(lado)}")
}

fun perimetro(lado: Int) = lado * 4

private fun ejercicio3() {
    /*
    Confeccionar una función que calcule la superficie de un rectángulo y la retorne,
    la función recibe como parámetros los valores de dos de sus lados:
     */
    println("Ingrese el primer lado del retangulo")
    val lado1 = pedirDato()
    println("Ingrese el segundo lado del retangulo")
    val lado2 = pedirDato()

    println("El area del rectangulo es ${area(lado1, lado2)}")
}

fun area(lado1: Int, lado2: Int) = lado1 * lado2

private fun ejercicio4() {
    /*
    Confeccionar una función que le enviemos como parámetro un String y nos
    retorne la cantidad de caracteres que tiene. En la función main solicitar
    la carga de dos nombres por teclado y llamar a la función dos veces.
    Imprimir en la main cual de las dos palabras tiene más caracteres.
     */
    println("Ingrese el primer nombre")
    val nombre1 = readLine()
    println("Ingrese el segundo nombre")
    val nombre2 = readLine()

    if (tamanoCadena(nombre1) > tamanoCadena(nombre2)) {
        println(
            "$nombre1 tiene ${tamanoCadena(nombre1)} " +
                    "caracteres y $nombre2 tiene ${tamanoCadena(nombre2)}, por lo tanto es mayor " +
                    "$nombre1"
        )
    } else {
        println(
            "$nombre2 tiene ${tamanoCadena(nombre2)} " +
                    "caracteres y $nombre1 tiene ${tamanoCadena(nombre1)}, por lo tanto es mayor " +
                    "$nombre2"
        )
    }
}

fun tamanoCadena(nombre: String?): Int = nombre!!.length