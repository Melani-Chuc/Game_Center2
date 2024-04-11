package src.main.kotlin

import Temporizador

class Computadora (
    val direeccionIP: String,
    val informacion: String,
    val disponible: Boolean=true
) {

    fun getEquipoData ():String {
        return "INFORMACION DEL EQUIPO: $informacion DIRRECION IP: $direeccionIP DISPONIBILIDAD: ${if (disponible)"SI" else "NO"}"
    }
    class TemporizadorController {
        private val temporizador = Temporizador()

        fun iniciarTemporizador() {
            temporizador.iniciarTemporizador()
        }

        fun detenerTemporizador() {
            temporizador.detenerTemporizador()
        }

        fun agregarTiempo(tiempoMinutos: Int) {
            temporizador.agregarTiempo(tiempoMinutos)
        }

        fun calcularTiempoTotal(): Long {
            return temporizador.calcularTiempoTotal()
        }
    }
}