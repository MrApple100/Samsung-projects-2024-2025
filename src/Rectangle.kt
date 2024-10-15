class Rectangle(
    var width:Int,
    var height:Int
):Shape() {
    override fun area():Double {
        return (width*height).toDouble()
    }
}