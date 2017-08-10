// In the below example the Sieve of Eratosthenes is used to find the prime pairs for an even number
// that is verified by Goldbach;s conjecture

import java.util.function.ToDoubleFunction

import scala.math._

object GoldbachConjecture {

  def sieveOfEratosthenes(num: Int, isPrime: Array[Boolean]): Unit = {
    val numRoot = sqrt(num).toInt + 1
    isPrime(0) = false
    isPrime(1) = false
    for (x <- 2 to num) {
      isPrime(x) = true
    }
    for (x <- 2 to numRoot) {
      if(isPrime(x)) {
        var doubleX = 2*x
        while(doubleX < num + 1) {
          isPrime(doubleX) = false
          doubleX += x
        }
      }
    }
  }

  def findPrimePair(n: Int): Unit = {
    val isPrime: Array[Boolean] = new Array(n+1)
    sieveOfEratosthenes(n, isPrime)
    for (x <- 0 to n) {
      // println(x + " " + (n-x) + " " + isPrime(x) + " " +isPrime(n-x) )
      if (isPrime(x) && isPrime(n-x)) {
        println("First number is: " + x + " ; Second number is: " + (n-x))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 7236;
    findPrimePair(n);
  }

}
