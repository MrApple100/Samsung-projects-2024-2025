class Triangle(
    val base:Int,
    val height:Int
):Shape() {
    override fun area():Double {
        return (base*height/2).toDouble()
    }
}