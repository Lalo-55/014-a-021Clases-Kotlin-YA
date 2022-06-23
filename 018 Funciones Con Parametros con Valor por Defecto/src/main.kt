fun main() {
    /*
    18 - Funciones: con parámetros con valor por defecto

    En Kotlin se pueden definir parámetros y asignarles un dato en la misma
    cabecera de la función. Luego cuando llamamos a la función podemos o no
    enviarle un valor al parámetro.
    Los parámetros por defecto nos permiten crear funciones más flexibles
    y que se pueden emplear en distintas circunstancias.
     */
    //problema1()

    ejercicio1()


}

fun problema1() {
    /*
    Confeccionar una función que reciba un String como parámetro y en forma
    opcional un segundo String con un caracter. La función debe mostrar
    el String subrayado con el caracter que indica el segundo parámetro.
     */
    tituloSubrayado("Sistema de Administración")
    tituloSubrayado("Ventas", "_")
}

fun tituloSubrayado(title: String, caracter: String = "*") {
    println(title)
    for (i in 1 .. title.length)
        print(caracter)
    println()

}

fun ejercicio1() {
    /*
    * Confeccionar una función que reciba entre 2 y 5 enteros.
    * La misma nos debe retornar la suma de dichos valores.
    * Debe tener tres parámetros por defecto.
    * */

    println("La suma de todos los valores es ${suma(10,20,20,20,10)}")
    println("La suma de todos los valores es ${suma(5,5)}")


}

fun suma(i: Int, i1: Int, i2: Int = 5, i3: Int = 5, i4: Int = 5): Int = i + i1 + i2 + i3 + i4