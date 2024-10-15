import java.awt.Color

class Gruzovik(color: Color,
               gosNomer:Int,
               model:String,
    var destination: Destination
):Car(color,gosNomer,model) {

    override fun poBibikati(){
        println("Very громкий звук")
    }
}