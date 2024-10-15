import java.awt.Color

open class Car(
    private var color: Color,
    var gosNomer:Int,
    private var model:String
): IFly,ISwim,Comparable<Car> {
    companion object{
        var count:Int = 0

        fun countIncrease(){
            count++
        }
    }
    fun attack(shape: Shape){

    }

    fun openBaggage(){
        println("Прозвучал ржавый скрип")
        color = Color.RED
    }
    open fun poBibikati(){
        println("Громкий звук!")
        countIncrease()
    }

    override fun compareTo(other: Car): Int {
        if(gosNomer==other.gosNomer){
            return 0
        }else if(gosNomer>other.gosNomer){
            return 1
        }
        return -1
    }

    override fun toString(): String {
        return "Car( gosNomer=$gosNomer)"
    }


    override fun fly() {

    }

    override fun swim() {

    }



}