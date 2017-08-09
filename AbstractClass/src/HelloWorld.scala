//object HelloWorld {
//  def main(args: Array[String]) {
//    println("Hello, world!");
//  }
//}


object HelloWorld {
  abstract class Person {
    def name: String;
    def age: Int;
    def getName(): String = name;
  }

case class Employer(val name: String, val age: Int, val taxCharge: Int) extends Person
case class Employee(val name: String, val age: Int, val salary: Int) extends Person
case class RandomPerson(val name: String, val age: Int, val salary: Int) extends Person

def main(args: Array[String]): Unit = {
  println("This is an implementation of an abstract base class")
  val p = RandomPerson("Samar", 19, 100000);
  println("The name of the instance is " + p.getName())
  println( p.name + "'s salary is " + p.salary);

}

}