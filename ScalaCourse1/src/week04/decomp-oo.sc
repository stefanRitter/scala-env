package week04

object decomp {
  println("object oriented decomposition")        //> object oriented decomposition
  println("limitation: non-local simplifications")//> limitation: non-local simplifications
  println("limitation: new function requires to touch all subclasses ex show")
                                                  //> limitation: new function requires to touch all subclasses ex show
}

// object oriented decomposition
trait Expr {
  def eval: Int
  def show: String
}

class Number(n: Int) extends Expr {
  def eval: Int = n
  def show: String = ???
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval + e2.eval
  def show: String = ???
}

// limitation: a * b + a * c => a * (b + c)