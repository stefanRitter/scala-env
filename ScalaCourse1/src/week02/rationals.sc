package week02

object rationals {
  val x = new Rational(1, 3)                      //> x  : week02.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  val y = new Rational(5,7)                       //> y  : week02.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week02.Rational = 3/2
  
  val sub = x.sub(y).sub(z)                       //> sub  : week02.Rational = -79/42
  x.add(y)                                        //> res1: week02.Rational = 22/21
  y.add(y)                                        //> res2: week02.Rational = 10/7
  x.less(y)                                       //> res3: Boolean = true
  x.max(y)                                        //> res4: week02.Rational = 5/7
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")
	
	// second constructor
	def this(x: Int) = this(x, 1)


	private def gcd(a: Int, b: Int): Int = if (b == 0) a  else gcd(b, a % b)
	private val g = gcd(x, y)
	
  def numer = x / g
  def denom = y / g

	def less(that: Rational) = that.numer * denom > numer * that.denom
	
	def max(that: Rational) = if (this.less(that)) that else this

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