package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object Prime10001 extends IEulerSolution {

    val MAXPRIME: Long = 110000
    val POSITION: Int = 10001

    /**
      * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
      * What is the 10,001st prime number?
      * 
      * @return 
      */
    def Compute: String = {
        val numbers: List[Long] = MathLibrary.GetPrime(MAXPRIME)
        return numbers(POSITION - 1).toString
    }

}