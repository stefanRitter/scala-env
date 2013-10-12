package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def loop(acc: Int, chars: List[Char]): Boolean =
      if (chars.isEmpty && acc == 0) true
      else if (chars.isEmpty || acc < 0) false
      else if (chars.head == '(') loop(acc + 1, chars.tail)
      else if (chars.head == ')') loop(acc - 1, chars.tail)
      else loop(acc, chars.tail)

    loop(0, chars)
  }

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
  }
}
