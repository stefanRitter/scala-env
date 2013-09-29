package week01

object squareRoot {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
	def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(130); 

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(97); 
  
  def isGoodEnough(guess: Double, x: Double): Boolean =
  	abs(guess * guess - x) / x < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(81); 
  	
  def improve(guess: Double, x: Double): Double =
  	(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(53); 
  	
  def sqrt(x: Double): Double = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1))}
}
