class Usuario  (
    val nombre:String,
    val apellidos:String,
    val nombre_usuario:String,
    val direccion:String,
    val num_telefono:String,
    val correo:String,
    val password:String
)
{
    fun getUsuarioData():String{
        return "Nombre: $nombre, Apellidos: $apellidos, Nombre de Usuario: $nombre_usuario, Direccion: $direccion, Numero de telefono:$num_telefono, Correo electronico: $correo"
    }

}