package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.Problems._

object ProblemFactory {

    /**
      * The ProblemFactory returns the object containing the compute
      * function for the chosen problem.
      *
      * @param problemNumber The Project Euler problem number to run
      * @return              The object that will run the solution
      */
    def GetSolution(problemNumber : Int) : IEulerSolution = {
        problemNumber match {
            case 1 => Multiple3or5
            case 2 => EvenFibonacci
            case 3 => LargestPrimeFactor
            case 4 => LargestPalindromeProduct
            case 5 => SmallestMultiple
            case 6 => SumSquareDifference
            case 7 => Prime10001
            case 8 => LargestProductSeries
            case 9 => PythagoreanTriplet
            case 10 => SummationPrimes
            case 11 => LargestProductGrid
            case _ => GenericSolution
        }
    }

}
