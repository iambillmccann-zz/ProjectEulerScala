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
