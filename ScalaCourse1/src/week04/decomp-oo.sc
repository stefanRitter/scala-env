package week04



object decompOO {
  println("object oriented decomposition")        //> object oriented decomposition
  println("limitation: non-local simplifications")//> limitation: non-local simplifications
  println("limitation: new function requires to touch all subclasses ex show")
                                                  //> limitation: new function requires to touch all subclasses ex show
}

// object oriented decomposition
trait ExprOO {
  def eval: Int
  def show: String
}

class NumberOO(n: Int) extends ExprOO {
  def eval: Int = n
  def show: String = ???
}

class SumOO(e1: ExprOO, e2: ExprOO) extends ExprOO {
  def eval: Int = e1.eval + e2.eval
  def show: String = ???
}

// limitation: a * b + a * c => a * (b + c)