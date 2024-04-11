package src.main.kotlin

import Prestamo
import Usuario

class Comprobante  (
    val num_comprobante: Int,
    val prestamo: Prestamo,
    val usuario:Usuario,
    val monto_total:Double,
    val descripcion:String,
)
{
    fun getComprobanteData():String{
        return "Numero de compronante: $num_comprobante, Prestamo: $prestamo, Usuario: $usuario, Monto total a pagar: $monto_total, Descripcion: $descripcion "
    }
}