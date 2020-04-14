package ProjectEuler.EulerLibrary

import scala.annotation.tailrec

object MathLibrary {

  /**
  * Compute the arithmetic series, which is the sum of an arithmetic progression
  *
  * @param numberOfTerms The number of terms in the series
  * @param firstTerm     The first term of the series
  * @param lastTerm      The last term of the series
  * @return              The sum of the arithmetic progression via formula n(a + b)/2
  */
  def ArithmeticSeries(numberOfTerms: Long, firstTerm: Long, lastTerm: Long): Long = numberOfTerms * (firstTerm + lastTerm) / 2

  /**
    * Retrieve a list of all the prime factors for a given number. Two things to notes about this algorithm ...
    *     1. Prime Numbers are passed in because the factors will be member of that set
    *     2. When a factor is found, the algorithm calculates a new number by dividing the original number by  the
    *        factor and calling recursively.
    * 
    * This function is not tail recursive.
    *
    * @param number       The number to factor
    * @param primeNumbers A list of prime numbers
    * @param factors      A list for accumulating factors as they are found. This option parameter should not be passed on 
    *                     the original call
    * @return             A list of prime factors
    */
  def GetFactors(number: Long, primeNumbers: List[Long], factors: List[Long] = List()): List[Long] = {

      for (primeNumber <- primeNumbers) {
        if (primeNumber * primeNumber > number) return List(number)
        if (IsMultiple(number, primeNumber)) return GetFactors(number / primeNumber, primeNumbers, factors :+ primeNumber)
      }

      factors // this statement should never be executed, and is here only for the function's syntax.

  }

  /**
    * Return the set of prime numbers that are less than or equal to a specified value
    *
    * @param value  The highest possible prime
    * @return       The set (list) of prime numbers
    */
  def GetPrime(value: Long): List[Long] = {

      lazy val ps: LazyList[Long] = 2L #:: LazyList.from(3, 2)                 // concatenate 2 with a stream of odd numbers
        .map(_.toLong)                                                         // map these to type Long
        .filter(candidate => ps.takeWhile(prime => prime * prime <= candidate) // iterate over the stream while p squared is less then x
          .forall(!IsMultiple(candidate, _)))                                  // include items where all of them will not evenly divide

      ps.takeWhile(_ <= value).toList
  }

  /**
    * IsMultiple determines if one number is an even multiple of another. The numbers must be integers
    *
    * @param value    The number being checked
    * @param divisor  The number that may be a factor
    * @return         True if the numbers are even multiples, otherwise False
    */
  def IsMultiple(value: Long, divisor: Long): Boolean = {
  
    if (divisor == 0) false
    else (value % divisor == 0)

  }

  def ReverseDigits(number: Long): Long = {

    def ReverseDigitsAcc(number: Long, result: Long): Long = {
      if (number == 0) return result

      val remainder: Long = number % 10
      val accumulator: Long = (result * 10) + remainder

      ReverseDigitsAcc(number / 10, accumulator)
    }

    ReverseDigitsAcc(number, 0)
  }

  def Square(number: Long): Long = {
    return number * number
  }

  def NaturalSum(number: Long): Long = {

    if (number <= 0) return 0

    @tailrec
    def iterate(start: Long, stop: Long, accumulator: Long): Long = {
      if (start == stop) accumulator + start else iterate(start + 1, stop, accumulator + start)
    }
    
    return iterate(1L, number, 0L)
  }

  def NaturalSumSquares(number: Long): Long = {

    if (number <= 0) return 0
    
    @tailrec
    def iterate(start: Long, stop: Long, accumulator: Long): Long = {
      if (start == stop) accumulator + MathLibrary.Square(start) 
      else iterate(start + 1, stop, accumulator + MathLibrary.Square(start))
    }
    
    return iterate(1L, number, 0L)
  }

  def SeriesProduct(numbers: List[Long]): Long = {
      @tailrec
      def productAccumulator(numbers: List[Long], accumulator: Long): Long = {
          numbers match {
              case Nil => accumulator
              case x :: tail => productAccumulator(tail, accumulator * x)
          }
      }
      productAccumulator(numbers, 1)
  }

  def SeriesSum(numbers: List[Long]): Long = {
    numbers.sum
  }
}