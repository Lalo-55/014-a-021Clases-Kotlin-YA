fun main() {

    //problema1()
    problema2()

}

fun problema1() {
    /*
    En la función main solicitar que se ingrese una clave dos veces por teclado.
    Desarrollar una función que reciba dos String como parametros y muestre un
     mensaje si las dos claves ingresadas son iguales o distintas.
     */
    println("Ingrese la contraseña")
    val clave = readln().toString()
    println("Ingrese la cofirmacion de la contraseña")
    val claveConfirmacion = readln().toString()

    chequeConfirmacion(clave, claveConfirmacion)

}

fun chequeConfirmacion(clave: String, claveConfirmacion: String) {
    if (clave.equals(claveConfirmacion)) {
        println("Ok. Puede ingresar")
    } else {
        println("Intente de nuevo")
        problema1()
    }
}

fun problema2() {
    /*
    Confeccionar una función que reciba tres enteros y los muestre ordenados
     de menor a mayor. En la función main solicitar la carga de 3 enteros por
      teclado y proceder a llamar a la primer función definida. 
     */
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()
    println("Ingrese el tercer numero")
    val num3 = readln().toInt()

    ordenar(num1, num2, num3)
}

fun ordenar(num1: Int, num2: Int, num3: Int) {
    if (num1 >= num2 && num1 >= num3) {
        if (num2 >= num3)
            println("$num3, $num2, $num1")
        else
            println("$num2, $num3, $num1")
    }else if (num2 >= num1 && num2 >= num3) {
        if (num1 >= num3)
            println("$num3, $num1, $num2")
        else
            println("$num1, $num3, $num2")
    }else{
        if (num1 >= num2)
            println("$num2, $num1, $num3")
        else
            println("$num1, $num2, $num3")

    }
}
