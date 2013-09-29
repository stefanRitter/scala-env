package week02

object currying {

  /**
   * Currying
   */
 
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)              //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x * x)(3, 4)                       //> res0: Int = 144

  def factorial(x: Int) = product(x => x)(1, x)   //> factorial: (x: Int)Int
  factorial(4)                                    //> res1: Int = 24

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

  def productSimple(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> productSimple: (f: Int => Int)(a: Int, b: Int)Int
  productSimple(x => x * x)(3, 4)                 //> res2: Int = 144
}