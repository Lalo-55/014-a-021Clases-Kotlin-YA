fun main() {
    /*
        16 - Funciones: con retorno de datos
        Vimos que una función la definimos mediante un nombre y
         que puede recibir datos por medio de sus parámetros.
         Los parámetros son la forma para que una función reciba
         datos para ser procesados. Ahora veremos otra
         característica de las funciones que es la de devolver
         un dato a quien invocó la función (recordemos que una
          función la podemos llamar desde la función main o desde
           otra función que desarrollemos)

     */
    //problema1()
    //problema2()
    //problema3()

    //ejecicio1()
    //ejercicio2()
    //ejercicio3()
    ejercicio4()
}

fun problema1() {
    /*
    Problema 1
    Confeccionar una función que le enviemos como parámetro el
    valor del lado de un cuadrado y nos retorne su superficie.
     */
    println("Ingrese el lado del cuadrado")
    val ladoCuadrado = readLine()!!.toInt()

    println("El area del cuadrado es ${superficieProblem1(ladoCuadrado)}")


}

fun superficieProblem1(lado: Int): Int {
    return lado * lado
}

fun problema2() {
    /*
    Problema 2
    Confeccionar una función que le enviemos como parámetros dos enteros
    y nos retorne el mayor.
     */

    println("Ingrese el primer valor")
    val num1 = readLine()!!.toInt()
    println("Ingrese el segundo valor")
    val num2 = readLine()!!.toInt()

    println("El valor mayor es ${mayorProblema2(num1, num2)}")

}

fun mayorProblema2(num1: Int, num2: Int): Int {
    if (num1 >= num2)
        return num1
    else
        return num2
}

fun problema3() {
    /*
    Problema 3
    Confeccionar una función que le enviemos como parámetro un String
    y nos retorne la cantidad de caracteres que tiene. En la función
    main solicitar la carga de dos nombres por teclado y llamar a la
    función dos veces. Imprimir en la main cual de las dos palabras
    tiene más caracteres.
     */
    println("Ingrese le primer nombre ")
    val nombreUno = readLine().toString()
    println("Ingrese el segundo nombre ")
    val nombreDos = readLine().toString()

    println(
        "El nombre que tiene mas letras es ${
            contadorProblema3(nombreUno, nombreDos)
        }"
    )


}

fun contadorProblema3(nombre: String, nombreDos: String) =
    if (nombre.length >= nombreDos.length) nombre else nombreDos


fun ejecicio1() {
    /*
    * Elaborar una función que reciba tres enteros y nos
    *  retorne el valor promedio de los mismos.
    * */
    println("El promedio es ${promedioTresNumerosEje1(10, 8, 6)}")


}

fun promedioTresNumerosEje1(i: Int, i1: Int, i2: Int) = (i + i1 + i2) / 3

fun ejercicio2() {
/*
Elaborar una función que nos retorne el perímetro
de un cuadrado pasando como parámetros el valor del lado.
 */
    println("ingrese el lado del cuadrado")
    val lado = readLine()!!.toDouble()

    println("El perimetro del cuadrado es ${areaCuadradoEje2(lado)}")
}

fun areaCuadradoEje2(lado: Double) = lado * 4


fun ejercicio3() {
/*
Confeccionar una función que calcule la superficie de un rectángulo y la retorne,
la función recibe como parámetros los valores de dos de sus lados:
 */
    println("ingrese el lado del rectangulo")
    val lado1 = readLine()!!.toDouble()
    println("ingrese el lado del rectangulo")
    val lado2 = readLine()!!.toDouble()


    println("El area del rectangulo es  ${areaCuadradoEje2(lado1, lado2)}")
}

fun areaCuadradoEje2(lado: Double, lado2: Double) = lado2 * lado

fun ejercicio4() {
    /*
    En la función main del programa cargar los lados de dos rectángulos
    y luego mostrar cual de los dos tiene una superficie mayor.
     */
    val rectangulo1 = cargarDatosRectanguloEje3()
    val rectangulo2 = cargarDatosRectanguloEje3()

    if (rectangulo1 > rectangulo2)
        println("El rectangulo 1 tiene la mayor area")
    else
        println("El rectangulo 2 tiene la mayor area")

}

fun cargarDatosRectanguloEje3(): Double {
    println("ingrese el lado del rectangulo")
    val lado1 = readLine()!!.toDouble()
    println("ingrese el otro lado del rectangulo")
    val lado2 = readLine()!!.toDouble()
    return lado1 * lado2
}


