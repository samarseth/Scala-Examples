class ClassHello {
  def inClass() = println("IN CLASS!")
}

object HelloClass {
  def main(args: Array[String]): Unit = {
    println("IN OBJECT!")
    val hello = new ClassHello;
    hello.inClass();
    println("End of the Program")
  }


}