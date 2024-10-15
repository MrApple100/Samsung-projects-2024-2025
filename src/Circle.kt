class Circle(
    val radius:Int,
):Shape() {
    override fun area():Double {
        return Math.PI*radius*radius
    }
}