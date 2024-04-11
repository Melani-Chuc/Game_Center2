class PrestamoController  {
    private val listaPrestamos = mutableListOf<Prestamo>()

    fun agregarPrestamo(prestamo: Prestamo) {
        listaPrestamos.add(prestamo)
    }

    fun buscarPrestamoPorNumero(numeroPrestamo: Int): Prestamo? {
        return listaPrestamos.find { it.num_prestamo == numeroPrestamo }
    }

    fun eliminarPrestamo(numeroPrestamo: Int): Boolean {
        val prestamo = buscarPrestamoPorNumero(numeroPrestamo)
        return if (prestamo != null) {
            listaPrestamos.remove(prestamo)
            true
        } else {
            false
        }
    }

    fun listarPrestamos(): List<Prestamo> {
        return listaPrestamos.toList()
    }


}