package week04


trait Expr
class Number(n: Int) extends Expr
class Sum(e1: Expr, e2: Expr) extends Expr


object patternMatching {
  def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
  }                                               //> show: (e: week04.Expr)String
}



/*

	Challenge: Sum(Prod(2, Var('x')), Var('y'))
	should print as '2 * x + y'. But
	Prod(Sum(2, Var('x')), Var('y'))
	should print as "(2 * x) + y".

*/


/*
trait Expr {
  def eval: Int = this match {
  	case Number(x) => x
  	case Sum(l, r) => l.eval + r.eval
  }
  
  def show: String = this match {
  	case Number(n) => n.toString
  	case Sum(e1, e2) => e1.show + " + " + e2.show
  }
}

class Number(n: Int) extends Expr {
}

class Sum(e1: Expr, e2: Expr) extends Expr {
}
*/