package week01

object recursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(995); 
  /**
   * Exercise 2
   */
  /*
  def balance(chars: List[Char]): Boolean = {

    def loop(acc: Int, chars: List[Char]): Boolean =
      if (chars.isEmpty && acc == 0) true
      else if (chars.isEmpty || acc < 0) false
      else if (chars.head == '(') loop(acc + 1, chars.tail)
      else if (chars.head == ')') loop(acc - 1, chars.tail)
      else loop(acc, chars.tail)

    loop(0, chars)
  }

  balance("(if (zero? x) max (/ 1 x))".toList)
  balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)
  !balance(":-)".toList)
  !balance("())(".toList)
	*/

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def loop(currMoney: Int, currCoins: List[Int]): Int =
    	if (currMoney == 0) 1
    	else if (currMoney < 0) 0
      else if (currCoins.isEmpty && currMoney > 0) 0
      else loop(currMoney, currCoins.tail) + loop(currMoney - currCoins.head, currCoins)

    loop(money, coins)
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(30); val res$0 = 

  countChange(4, List(2, 1));System.out.println("""res0: Int = """ + $show(res$0));$skip(48); val res$1 = 
  countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res1: Int = """ + $show(res$1));$skip(48); val res$2 = 
  countChange(301,List(5,10,20,50,100,200,500));System.out.println("""res2: Int = """ + $show(res$2));$skip(48); val res$3 = 
  countChange(300,List(500,5,50,100,20,200,10));System.out.println("""res3: Int = """ + $show(res$3))}

  /*
  	4 1,2
  	false
  	3 false
  	4 2,nil              + 3 1,2,nil
  	false                  false
  	2 false                2 false
  	4 nill + 2 1,2,nill
  	0
  	
  	
  */
  /*
  println("Pascal's Triangle")
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }
  
  def pascal(c: Int, r: Int): Int =
  	if (c == 0) 1
  	else if (c == r) 1
  	else pascal(c-1, r-1) + pascal(c, r-1)
  */
}
