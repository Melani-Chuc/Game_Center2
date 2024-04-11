import src.main.kotlin.Computadora

class Prestamo (
    val num_prestamo:Int,
    val compu:Computadora,
    val usuario:Usuario,
    val fecha:String,
    val hora_inicio:String,
)
{
    fun getPrestamoData():String{
        return "Numero de prestamo: $num_prestamo, Computadora: $compu, Usuario: $usuario, Fecha: $fecha, Hora de inicio: $hora_inicio"
    }
}