import java.awt.Color
import java.util.Arrays

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    var car1 = Car(gosNomer = 123, color = Color.BLUE, model = "Lada sedan")//конструктор
//    var car2 = Car(gosNomer = 123, color = Color.BLUE, model = "Lada sedan")//конструктор
//    var car3 = Car(gosNomer = 123, color = Color.BLUE, model = "Lada sedan")//конструктор
//    var car4 = Car(gosNomer = 123, color = Color.BLUE, model = "Lada sedan")//конструктор
//    var cabriolet = Cabriolet(Color.RED,777,"BMW",false)//конструктор
//    var gruzovik = Gruzovik(gosNomer = 111, color = Color.BLUE, model = "GAZ", destination = Destination.West)
//


//    cabriolet.changeStateRoof()
//    cabriolet.poBibikati()
//    gruzovik.poBibikati()
//    println(car1)
//
//
//    var dest = gruzovik.destination
//
//    when(dest){
//        Destination.East ->{
//
//        }
//        Destination.South -> {
//
//        }
//        Destination.North ->{
//
//        }
//        Destination.West -> {
//
//        }
//    }
//
//    Car.countIncrease()
//
//
//
//

    val triangle = Triangle(10,10)
    val rectangle = Rectangle(10,10)
    val circle = Circle(10)

    println(triangle.area())
    println(rectangle.area())
    println(circle.area())

    val arrayCar = arrayOf(Car(gosNomer = 111, color = Color.BLUE, model = "Lada sedan"),
        Car(gosNomer = 756, color = Color.BLUE, model = "Lada sedan"),
        Car(gosNomer = 100, color = Color.BLUE, model = "Lada sedan"),
        Car(gosNomer = 123, color = Color.BLUE, model = "Lada sedan"),
        Car(gosNomer = 560, color = Color.BLUE, model = "Lada sedan"))
    println("//////////////////////////////////////")
    println(arrayCar.contentToString())
    Arrays.sort(arrayCar)
    println(arrayCar.contentToString())


    arrayCar[0].attack(triangle)
    arrayCar[0].attack(rectangle)
    arrayCar[0].attack(circle)

    val customComparator = CustomComparator()

    Arrays.sort(arrayCar,customComparator)
    println(arrayCar.contentToString())



}