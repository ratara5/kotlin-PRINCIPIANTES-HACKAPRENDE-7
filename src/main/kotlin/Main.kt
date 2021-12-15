//34
fun main(args: Array<String>) {

    val movie1=Movie("Titanic",90,false)

    movie1.playTrailer()
    movie1.play()
    movie1.played()

    val frames= Media.getTotalFrames(movie1.duration,true)
    println("Total frames of ${movie1.name} is: $frames")

    val series1=Series("Sponge Bob",30,true)
    series1.totalEpisodes=5
    series1.play()
    series1.played()

    //35
    //Media.FRAME_RATE_HD //No se puede llamar por ser scope  private
    //95% de los casos, usar solo private y public
    //separation of concerns

    playMedia(movie1)
    playMedia(series1)
}

fun playMedia(media: Media){
    media.play() //detecta que subclase es y ejecuta el método sobreescrito según el aso
}
