package ProjectEuler.EulerLibrary.Problems

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
    /**
      * Solve problem 1, Multiples of 3 and 5
      *
      * @return
      */
    def Compute: String = "3.1415926"
}
