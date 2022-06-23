fun main() {
    /*
   19 - Funciones: llamada a la función con argumentos nombrados

   Esta característica de Kotlin nos permite llamar a la función
   indicando en cualquier orden los parámetros de la misma, pero
   debemos especificar en la llamada el nombre del parámetro y el
   valor a enviarle.

     */
    //problema1()

    ejercicio1()

}

fun problema1() {
    /*
    Problema 1
    Confeccionar una función que reciba el nombre de un operario,
    el pago por hora y la cantidad de horas trabajadas. Debe mostrar
    su sueldo y el nombre. Hacer la llamada de la función mediante
    argumentos nombrados.
     */

    calcularSueldoProblema1("Pepe", 10.5, 40)
    calcularSueldoProblema1("Juan",)
    calcularSueldoProblema1(costoHora = 22.0, HorasTrabajadas = 55, name = "Lalo")
    calcularSueldoProblema1( HorasTrabajadas = 60, name = "Eduardo", costoHora = 23.5)
}

fun calcularSueldoProblema1(
    name: String,
    costoHora: Double = 21.7,
    HorasTrabajadas: Int = 48
) {

    val sueldoSemana = costoHora * HorasTrabajadas

    println("El sueldo del operario $name es de $sueldoSemana pesos en esta semana," +
            " ya que trabajo $HorasTrabajadas horas")
}

fun ejercicio1() {
    /*
    Elaborar una función que muestre la tabla de multiplicar del valor
    que le enviemos como parámetro. Definir un segundo parámetro llamado
    termino que por defecto almacene el valor 10. Se deben mostrar tantos términos
    de la tabla de multiplicar como lo indica el segundo parámetro.
    Llamar a la función desde la main con argumentos nombrados.
     */
    tablaMultiEjercicio1(1, 30)
    tablaMultiEjercicio1(limite = 20, numMul = 5)
    tablaMultiEjercicio1(numMul = 10)
    tablaMultiEjercicio1(numMul = 10,30.2.toInt())


}



fun tablaMultiEjercicio1(numMul: Int, limite: Int = 10) {

    for (iterado in 1 .. limite){
        println("$numMul x $iterado = ${numMul * iterado}")
    }
}
