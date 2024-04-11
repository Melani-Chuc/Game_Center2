package src.main.kotlin

class ComprobanteController {
    private val listaComprobantes = mutableListOf<Comprobante>()

    fun agregarComprobante(comprobante: Comprobante) {
        listaComprobantes.add(comprobante)
    }

    fun buscarComprobantePorNumero(numeroComprobante: Int): Comprobante? {
        return listaComprobantes.find { it.num_comprobante == numeroComprobante }
    }

    fun eliminarComprobante(numeroComprobante: Int): Boolean {
        val comprobante = buscarComprobantePorNumero(numeroComprobante)
        return if (comprobante != null) {
            listaComprobantes.remove(comprobante)
            true
        } else {
            false
        }
    }

    fun listarComprobantes(): List<Comprobante> {
        return listaComprobantes.toList()
    }
}