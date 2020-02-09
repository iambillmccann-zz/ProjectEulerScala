package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

trait IEulerSolution {
    def Compute : String
}

object GenericSolution extends IEulerSolution {
    /**
      * The default solution passes back a simple text message
      *
      * @return
      */
    def Compute: String = "The requested problem has not been solved"
}

object Multiple3or5 extends IEulerSolution {

  val RANGESTART: Long = 1
  val RANGESTOP: Long = 1000
  
  /**
  *  Determine the number of terms in an Arithmetic Progression
  * 
  * @param rangeStart First number in the range
  * @param rangeStop  Last number in the range
  * @param difference Difference between terms
  * @return The number of terms
  */
  def NumberOfTerms(rangeStart: Long, rangeStop: Long, difference: Long): Long = (rangeStop - rangeStart) / difference
  
  
  /**
  * Determine the last number in an Arithmetic Progression
  * @param numberOfTerms The number of terms
  * @param firstTerm     The first number
  * @param difference    The difference between terms
  * @return              The largest value of the sequence
  */
  def LastTerm(numberOfTerms: Long, firstTerm: Long, difference: Long): Long = firstTerm + difference * (numberOfTerms - 1)
  
   /**
   * Solve problem 1, Multiples of 3 and 5
   *
   * @return The solution to the problem
   */
    def Compute: String = {
      val numberOfTerms3: Long = NumberOfTerms(RANGESTART, RANGESTOP, 3)
      val numberOfTerms5: Long = NumberOfTerms(RANGESTART, RANGESTOP, 5)
      val numberOfTerms15: Long = NumberOfTerms(RANGESTART, RANGESTOP, 15)
      (
        MathLibrary.ArithmeticSeries(numberOfTerms3, 
                                     3, 
                                     LastTerm(numberOfTerms3, 3, 3)) +
        MathLibrary.ArithmeticSeries(numberOfTerms5, 
                                     5, 
                                     LastTerm(numberOfTerms5, 5, 5)) -
        MathLibrary.ArithmeticSeries(numberOfTerms15, 
                                     15, 
                                     LastTerm(numberOfTerms15, 15, 15))
      ).toString
    }

}
