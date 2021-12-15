class Series(name: String, duration: Int, isAvailable: Boolean, trailer:Trailer?=null):Media(name, duration, isAvailable, trailer)   {

    var totalEpisodes=0 //Atributo de una serie que no tiene una película
    var totalSeasons=0
    var episodeDuration=0

    // inicia youtube 31
    init{ //Se ejecuta cada vez que se crea objeto de esta clase
        episodeDuration=duration
    }

    // y31
    private var v=false
    // y31
    override fun play() {
        //super.play()
        val realDuration=episodeDuration*totalEpisodes
        if(isAvailable){
            if(realDuration>0){
                for (i in 0 until realDuration step realDuration / 10) {
                    println("Playing series $name")
                }
                v=true
            }else {
                println("Playing series duration is zero or less than zero")

            }
        }else{
            println("Series $name is not available")
        }
    }
    //  y31
    override fun played(): Boolean {
        return if(v){
            println("${name} had played: true")
            this.pause()
            true
        }else{
            println("${name} had played: false")
            false
        }
    }
}