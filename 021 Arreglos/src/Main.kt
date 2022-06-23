fun main() {
/*
    21 - Arreglos: conceptos
    Hemos empleado variables de distinto tipo para el almacenamiento de datos
    (variables Int, Float, Double, Byte, Short, Long, Char, Boolean)
     En esta sección veremos otros tipos de variables que permiten almacenar
     un conjunto de datos en una única variable.
     Un arreglo es una estructura de datos que permite almacenar un
     CONJUNTO de datos del MISMO tipo.
     Con un único nombre se define un arreglo y por medio de un subíndice
     hacemos referencia a cada elemento del mismo (componente)

 */

    //problema1()
    //problema2()
    //problema3()

    //ejercicio1()
    ejercicio2()
}

fun problema1() {
    /*
    Problema 1
    Se desea guardar los sueldos de 5 operarios.
    Según lo conocido deberíamos definir 5 variables si queremos
    tener en un cierto momento los 5 sueldos almacenados en memoria.
    Empleando un arreglo solo se requiere definir un único nombre y
    accedemos a cada elemento por medio del subíndice.
     */
    val sueldo: IntArray
    sueldo = IntArray(5)

    for (it in 0..4) {
        println("Ingrese el sueldo")
        sueldo[it] = readln()!!.toInt()
    }

    for (it in 0..4) {
        println("El sueldo $it es $ ${sueldo[it]}")
    }
}

fun problema2() {
    /*
    Problema 2
    Definir un arreglo de 5 componentes de tipo Float que representen
    las alturas de 5 personas.
    Obtener el promedio de las mismas. Contar cuántas personas
    son más altas que el promedio y cuántas más bajas.
     */
    val altura = FloatArray(5)
    var promedio = 0.0f
    var mayorDelPromedio = 0
    var menorDelPromedio = 0
    var igualDelPromedio = 0
    for (i in 0..4) {
        println("Ingrese su altura")
        altura[i] = readln()!!.toFloat()
        promedio += altura[i]
    }
    promedio /= altura.size
    println("El promedio es $promedio")
    for (i in 0..4) {
        if (altura[i] > promedio)
            mayorDelPromedio++
        else if (altura[i] < promedio)
            menorDelPromedio++
        else
            igualDelPromedio++
    }
    println("Cantidad de personas altas : $mayorDelPromedio")
    println("Cantidad de personas bajas : $menorDelPromedio")
    println("Cantidad de personas igual al promedio : $igualDelPromedio")


}

fun problema3() {
    /*
    Problema 3
    Cargar un arreglo de 10 elementos de tipo entero y verificar posteriormente
    si el mismo está ordenado de menor a mayor.
     */
    var arreglo = IntArray(5)
    for (i in 0..arreglo.size - 1) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    var ordenado = true
    arreglo = arreglo.sortedArray()

    for (i in 0..4) {
        println(arreglo[i])
    }
    for (elemento in arreglo) {
        println(elemento)
    }

    for (i in 0..arreglo.size - 2)
        if (arreglo[i + 1] < arreglo[i])
            ordenado = false
    if (ordenado)
        print("Los elementos están ordenados de menor a mayor")
    else
        print("Los elementos no están ordenados de menor a mayor")

}

fun ejercicio1() {
    /*
    Ejercicio 1
    Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros,
    e informe:
    El valor acumulado de todos los elementos.
    El valor acumulado de los elementos que sean mayores a 36.
    Cantidad de valores mayores a 50.
    (Definir dos for, en el primero realizar la carga y en el segundo
    proceder a analizar cada elemento)
     */
    var valorAcumulado: Int = 0
    var valorAcumuladoTreinta: Int = 0
    var valorAcumuladoCincuenta: Int = 0

    val arreglo: IntArray = IntArray(8)

    for (i in arreglo.indices) {
        println("Ingresa el primer elemento")
        val numero = readLine()!!.toInt()
        arreglo[i] = numero
    }

    for (i in arreglo.indices) {
        valorAcumulado += arreglo[i]
        val mayorTreintaSeis = arreglo[i] > 36 && arreglo[i] <= 50
        val mayorCincuenta = arreglo[i] > 50

        if (mayorTreintaSeis) {
            valorAcumuladoTreinta += arreglo[i]
        }
        if (mayorCincuenta) {
            valorAcumuladoCincuenta += arreglo[i]
        }

    }
    println("El valor acumulado es $valorAcumulado")
    println("El valor acumalado mayores a 36 es $valorAcumuladoTreinta")
    println("El valor acumalado mayores a 50 es $valorAcumuladoCincuenta")



}

fun ejercicio2()
{
    /*
    Ejercicio 2
    Realizar un programa que pida la carga de dos arreglos numéricos
    enteros de 4 elementos. Obtener la suma de los dos arreglos elemento a
    elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.
     */
    val arreglo1: IntArray = IntArray(4)
    val arreglo2: IntArray = IntArray(4)
    val arregloSuma: IntArray = IntArray(4)


    for (i in arreglo1.indices){
        print("Numero del primer arreglo: ")
        arreglo1[i] = readln().toInt()
    }
    for (i in arreglo2.indices){
        print("Numero del segundo arreglo: ")
        arreglo2[i] = readln().toInt()
    }

    for (i in arregloSuma.indices){
        arregloSuma[i] = arreglo1[i] + arreglo2[i]
        println("Arreglo Suma: ${arregloSuma[i]}")
    }

}


