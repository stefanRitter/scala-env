package week04

object lists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val fruit = "oranges" :: ("apples" :: ("pears" :: Nil))
                                                  //> fruit  : List[String] = List(oranges, apples, pears)
  val fruit_expl = List("oranges", "apples", "pears")
                                                  //> fruit_expl  : List[String] = List(oranges, apples, pears)
  val fruit_def: List[String] = List("oranges", "apples", "pears")
                                                  //> fruit_def  : List[String] = List(oranges, apples, pears)
  val diag = List(List(1, 0), List(0, 0, 1), List(Nil))
                                                  //> diag  : List[List[Any]] = List(List(1, 0), List(0, 0, 1), List(List()))

  val empty = Nil                                 //> empty  : scala.collection.immutable.Nil.type = List()
  val list_of_empty_expl = List(Nil)              //> list_of_empty_expl  : List[scala.collection.immutable.Nil.type] = List(List(
                                                  //| ))
  val empty_def: List[Nothing] = List()           //> empty_def  : List[Nothing] = List()
  
  empty.isEmpty                                   //> res0: Boolean = true
  fruit.head                                      //> res1: String = oranges
  fruit.tail.head                                 //> res2: String = apples
  //empty.head
  
  
  // insertion sort
  
  
}