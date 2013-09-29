package week02

object rationals {
  val x = new Rational(1, 3)                      //> x  : week02.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  val y = new Rational(5,7)                       //> y  : week02.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week02.Rational = 3/2
  
  val sub = x.sub(y).sub(z)                       //> sub  : week02.Rational = -79/42
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  
  override def toString = numer + "/" + denom
  
  def neg =
  	new Rational(
  		-numer, denom)

	def sub(that: Rational) = add(that.neg)
}