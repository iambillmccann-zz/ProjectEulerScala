package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary
import scala.collection.mutable.ListBuffer
import scala.annotation.tailrec
import _root_.ProjectEuler.EulerLibrary.MathLibrary

object PythagoreanTriplet extends IEulerSolution {

    @tailrec
    def computeIt(a: Long, b: Long): Long = {
        val c: Long = 1000 - (a + b)
        if (b >= c) return 0
        if ((a*a) + (b*b) == (c*c)) return a * b * c
        computeIt(a, b + 1)
    }
    
    @tailrec
    def findTriplet(a: Long): Long = {
        if (a > 333) return 0
        val result = computeIt(a, a + 1)
        if (result > 0) return result
        findTriplet(a + 1)
    }

    /**
      * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
      * a^2 + b^2 = c^2
      * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
      * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
      * Find the product abc.
      * @return
      */    
    def Compute: String = {

        return (findTriplet(1)).toString

    }
}