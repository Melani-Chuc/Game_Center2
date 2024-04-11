import kotlin.concurrent.timer

class Temporizador {
    private var tiempoInicio: Long = 0
    private var tiempoTranscurrido: Long = 0
    private var temporizadorActivo: Boolean = false

    fun iniciarTemporizador() {
        if (!temporizadorActivo) {
            tiempoInicio = System.currentTimeMillis()
            temporizadorActivo = true
            println("Temporizador iniciado.")
            timer(period = 1000) {
                tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio
                println("Tiempo transcurrido: ${tiempoTranscurrido / 1000} segundos")
            }
        } else {
            println("El temporizador ya está en marcha.")
        }
    }

    fun detenerTemporizador() {
        if (temporizadorActivo) {
            temporizadorActivo = false
            println("Temporizador detenido.")
        } else {
            println("El temporizador no está en marcha.")
        }
    }

    fun agregarTiempo(tiempoMinutos: Int) {
        val tiempoMs = tiempoMinutos * 60 * 1000L
        if (temporizadorActivo) {
            tiempoInicio -= tiempoMs
            println("Se agregaron $tiempoMinutos minutos al temporizador.")
        } else {
            println("El temporizador no está en marcha.")
        }
    }

    fun calcularTiempoTotal(): Long {
        return tiempoTranscurrido
    }
}

fun main() {
    val temporizador = Temporizador()
    temporizador.iniciarTemporizador()
}