package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object EvenFibonacci extends IEulerSolution {

  /**
    * Compute a fibonnaci sequence where the sequence stops when the term of the sequence exceeds
    * a certain value (4,000,000).
    *
    * @param limit The limit of the sequence
    * @return      The result of adding the terms of the sequence that are even.
    */  
  def FibonnaciToSum(limit: Long): Long = {

    /**
      * Compute the fibonacci sequence and accumulate the sums of the even terms.
      *
      * @param previous n - 1
      * @param current  n
      * @param result   An accumulator for the sum of the even terms
      * @return         The sum of the even terms
      */
    def FibonnaciAccumulator(previous: Long, current: Long, result: Long): Long = {

      if (current >= limit) result
      else {
          val newResult: Long = if (current % 2 == 0) result + current else result
          FibonnaciAccumulator(current, previous + current, newResult)
        }

    }

    FibonnaciAccumulator(1, 2, 0)
  }

  /**
    * Compute the sum of terms that are even numbers in a fibonacci sequence.
    *
    * @return
    */
  def Compute: String = FibonnaciToSum(4000000).toString

}