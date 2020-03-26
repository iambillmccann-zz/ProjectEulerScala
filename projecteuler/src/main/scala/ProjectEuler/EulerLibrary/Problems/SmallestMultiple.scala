package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object SmallestMultiple extends IEulerSolution {


    /**
      * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
      * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
      *
      * NOTE: The algorithm will check multiples of max * (max - 1) ... or 20 * 19 which is 380 ... the solution must
      * be a multiple of 380.
      * 
      * @return The largest palindrome which is 906609
      */
    def Compute: String = {

        val MAX: Long = 20L
        var done: Boolean = false

        /**
          * Check each number to see if it is a multiple
          *
          * @param result   The number that is being checked
          * @param trial    The number that is a possible multiple
          * @return         True when all numbers are multiples, false when a non-multiple is found
          */
        def CheckEach(result: Long, trial: Long): Boolean = {
            if (trial == 1) return true
            if (!MathLibrary.IsMultiple(result, trial)) return false
            CheckEach(result, trial - 1)
        }

        /**
          * Check all numbers starting a MAX and counting down
          *
          * @param result    The number that is being checked
          * @return          The final solution
          */
        def CheckAll(result: Long): Long = {
            if (CheckEach(result, MAX -2)) return result   // when true, we have a winner
            return CheckAll(result + MAX * (MAX -1))       // make another attempt
        }

        return CheckAll(MAX * (MAX - 1)).toString
    }

}