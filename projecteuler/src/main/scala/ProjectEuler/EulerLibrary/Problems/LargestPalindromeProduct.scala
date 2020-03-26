package ProjectEuler.EulerLibrary.Problems

import ProjectEuler.EulerLibrary.MathLibrary

object LargestPalindromeProduct extends IEulerSolution {

    /**
      * Check to see if the product is the largest palindrome
      *
      * @param product     the number to check
      * @param maxResult   the largest palindrome (so far)
      * @return
      */
    def isMaxPalindrome(product: Long, maxResult: Long): Long = {
        if ( (MathLibrary.ReverseDigits(product) == product) && (product > maxResult) )
            product
        else
            maxResult
    }

    /**
      * Find the largest palindrome that is a product of the numbers
      * between 100 and 1,000.
      *
      * @return The largest palindrome which is 906609
      */
    def Compute: String = {

        var result: Long = 0L

        for {
            number1 <- 100 to 1000
            number2 <- 100 to 1000
        } result = isMaxPalindrome(number1.toLong * number2.toLong, result)

        return result.toString
    }

}