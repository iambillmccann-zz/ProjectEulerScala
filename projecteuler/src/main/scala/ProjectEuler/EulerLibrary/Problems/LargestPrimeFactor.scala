package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object LargestPrimeFactor extends IEulerSolution {

    val VALUE: Long = 600851475143L
    val MAXPRIME: Long = 10000

    /**
      * Compute the solution to Project Euler problem number three
      *
      * @return The largest prime factor for 60,0851,475,143
      */
    def Compute: String = {
        val factors: List[Long] = MathLibrary.GetFactors(VALUE, MathLibrary.GetPrime(MAXPRIME))
        return factors.last.toString
    }

}