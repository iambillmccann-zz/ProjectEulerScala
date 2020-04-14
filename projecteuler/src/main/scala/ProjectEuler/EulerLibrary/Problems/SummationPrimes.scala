package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object SummationPrimes extends IEulerSolution {

    /**
      * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
      * Find the sum of all the primes below two million.
      * 
      * @return 
      */
    def Compute: String = {
        val numbers: List[Long] = MathLibrary.GetPrime(2000000L)
        return MathLibrary.SeriesSum(numbers).toString
    }

}