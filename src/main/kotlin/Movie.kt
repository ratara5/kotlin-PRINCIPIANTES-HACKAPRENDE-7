//34
class Movie(name: String, duration: Int, isAvailable: Boolean, trailer:Trailer?=null):Media(name, duration, isAvailable, trailer) {

    var wonOscar:Boolean=false //atributo de una película que notiene una serie

    override fun toString(): String {
        return "Nombre: $name -  Duración: $duration min"
    }

    override fun play() {
        super.play() //Ir donde el padre y ejecutar su método play(). Así que esto es redundate
    }
}