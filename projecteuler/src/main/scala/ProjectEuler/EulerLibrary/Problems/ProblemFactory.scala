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
            case _ => GenericSolution
        }
    }

}
