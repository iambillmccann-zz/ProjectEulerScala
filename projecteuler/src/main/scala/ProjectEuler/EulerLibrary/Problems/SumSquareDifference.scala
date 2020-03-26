package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object SumSquareDifference extends IEulerSolution {


    /**
     *  The sum of the squares of the first ten natural numbers is,
     *  12 + 22 + ... + 102 = 385
     *  The square of the sum of the first ten natural numbers is,
     *  (1 + 2 + ... + 10)2 = 552 = 3025
     *  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     *  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     * 
     * @return The difference between sum of the squares and the square of the sums for the natural numbers one to 100.
    */
    def Compute: String = {
        val number: Long = 100
        return (MathLibrary.Square(MathLibrary.NaturalSum(number)) - MathLibrary.NaturalSumSquares(number)).toString
    }

}