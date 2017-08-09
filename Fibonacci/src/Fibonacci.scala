object Fibonacci {
  def main(args: Array[String]): Unit = {
    val n = 50
    var (a,b, counter) = (0,1,1)
      while (counter <= n) {
        val oldA = a;
        a = b;
        b = oldA + b;
        print(b + " ");
        counter += 1;
      }
  }
}
