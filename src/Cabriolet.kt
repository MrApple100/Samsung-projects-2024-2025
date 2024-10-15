import java.awt.Color

class Cabriolet(color:Color,
                gosNomer:Int,
                model:String,
            private var stateRoof:Boolean
): Car(color,gosNomer,model) {
    fun changeStateRoof(){
        stateRoof = !stateRoof
        if (stateRoof)
            println("Вкусный запах выхлопных паров")
        else
            println("В машине стакло душно")
    }

    override fun poBibikati(){
        println("Тихий звук кабриолета")
    }

}