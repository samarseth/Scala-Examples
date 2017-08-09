import scala.collection.mutable.ListBuffer;

object EncodeClass {
  def encode(l: List[Char]) = {
      val emptyList = new ListBuffer[Int]()
      var counter  = 0
        while (counter < l.length) {
          val leadingChar = l(counter)
          var numberOfElements = 0;
          while(l(counter) == leadingChar) {
            numberOfElements += 1
            counter += 1
          }
          println("Applying")
          emptyList += numberOfElements;
          println(emptyList)
          println("Applied")
        }
      println("Final Print Called")
      println(emptyList)
  }

  def main(args: Array[String]): Unit = {
      encode(List('a', 'a', 'a', 'a', 'a', 'c', 'c', 'a',  'e', 'e', 'e'))
  }
}
