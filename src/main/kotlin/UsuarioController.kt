import src.main.kotlin.Computadora

class UsuarioController {
    val listaUsuario = mutableListOf<Usuario>()

    fun registodeUsuario() {
        println("INGRESE SU NOMBRE ")
        val nombrecompleto = readln().toString()
        println("INGRESE SUS APELLIDOS")
        val apellidos = readln().toString()
        println("CREE Y INSERTE UN NOMBRE DE USUARIO QUE DESEE TENER")
        val nombre_usuario = readln().toString()
        println("INGRESE SU DIRRECCION")
        val dirreccion = readln().toString()
        println("INGRESE SU NUMERO TELEFONICO")
        val telefono = readln().toString()
        println("INGRESE SU CORREO ELECTRONICO")
        val correo = readln().toString()
        println("CREE Y INSERTE UNA CONSTRASENA PARA SU USUARIO QUE DESEE TENER")
        val password = readln().toString()

        val addedUsuario = Usuario(nombrecompleto, apellidos, nombre_usuario, dirreccion, telefono, correo, password)

        listaUsuario.add(addedUsuario)
    }

    fun isValidUser(nombreUsuario: String, password: String): Boolean {
        val isUserInList = listaUsuario.find { it.nombre_usuario == nombreUsuario && it.password == password }
        return isUserInList != null
    }

    fun iniciodesecion() {
        println("INGRESE SU NOMBRE DE USUARIO")
        val nombre_usuario = readln()
        println("INGRESE SU PASSWORD")
        val password = readln()
    }

    fun showUsuario() {
        if (listaUsuario.isEmpty()) {
            println("usuario no regristrado")
        } else {
            var contador = 1
            for (contador in listaUsuario) {
                println("$contador")
            }
        }
    }
}
