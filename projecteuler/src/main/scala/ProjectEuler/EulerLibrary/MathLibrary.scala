package ProjectEuler.EulerLibrary

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

}