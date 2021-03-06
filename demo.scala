package demo

object demo {

  def temperature(celcius:Int):Double= {
    var fahrenheit:Double = 0
    fahrenheit = celcius*1.8 + 32
    return fahrenheit
  }

  def volume(radius:Int):Double={
    var vol:Double = 0
    val pi:Double = (22).toDouble./(7):Double
    val r3 = scala.math.pow(radius, 3)
    vol = 4/3*pi*r3
    return vol
  }

  def cost(Books:Int):Double={
    var totalcost:Double =0
    totalcost=((60).toDouble./(100:Double)*24.95*Books)+3+(Books-50)*0.75
    return totalcost
  }

  def main(args: Array[String]): Unit = {

    println("Temperature is " + temperature(celcius = 35) + "F")
    println("Volume is " + volume(radius = 5))
    println("Total cost is Rs."+cost(60))
  }
}
