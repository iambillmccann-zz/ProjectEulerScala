package ProjectEuler.EulerLibrary

import ProjectEuler.EulerLibrary.MathLibrary
import org.scalatest._

class MathLibraryTests extends FunSuite {

    test("Reversing digits of numbers with even number of digits") {
        val expected: Long = 4321L
        assert(MathLibrary.ReverseDigits(1234L) == expected)
    }

    test("Reversing digits of numbers with odd number of digits") {
        val expected: Long = 987654321L
        assert(MathLibrary.ReverseDigits(123456789L) == expected)
    }

    test("Expressions that are multiples") {
        assert(MathLibrary.IsMultiple(4, 2) == true)
        assert(MathLibrary.IsMultiple(9, 3) == true)
        assert(MathLibrary.IsMultiple(12, 6) == true)
        assert(MathLibrary.IsMultiple(25, 5) == true)
        assert(MathLibrary.IsMultiple(4648, 332) == true)
        assert(MathLibrary.IsMultiple(2, 1) == true)
    }

    test("Expression that are not multiples") {
        assert(MathLibrary.IsMultiple(4, 3) == false)
        assert(MathLibrary.IsMultiple(1, 0) == false)
        assert(MathLibrary.IsMultiple(13, 3) == false)
        assert(MathLibrary.IsMultiple(19, 18) == false)
        assert(MathLibrary.IsMultiple(23, 2) == false)
        assert(MathLibrary.IsMultiple(37, 66) == false)
    }

    test("Computing the square of type Long") {
        assert(MathLibrary.Square(5) == 25)
        assert(MathLibrary.Square(0) == 0)
        assert(MathLibrary.Square(-1) == 1)
    }

    test("Computing the sum of natural numbers") {
        assert(MathLibrary.NaturalSum(10) == 55)
        assert(MathLibrary.NaturalSum(0) == 0)
        assert(MathLibrary.NaturalSum(-10) == 0)
    }

    test("Compute the sum of squares for natural numbers") {
        assert(MathLibrary.NaturalSumSquares(10) == 385)
        assert(MathLibrary.NaturalSumSquares(0) == 0)
        assert(MathLibrary.NaturalSumSquares(-10) == 0)
    }

    test("Retrieve a list of prime numbers") {
        val expected = 2 :: 3 :: 5 :: 7 :: 11 :: 13 :: 17 :: 19 :: Nil
        assert(MathLibrary.GetPrime(20) == expected)

        var actual = MathLibrary.GetPrime(23)
        assert(actual.length == 9)

        actual = MathLibrary.GetPrime(7920)
        assert(actual.length == 1000)
        assert(actual(actual.length - 1) == 7919)
    }

    test("Compute the product of a list") {
        var numbers = 2L :: 3L :: 4L :: 5L :: Nil
        assert(MathLibrary.SeriesProduct(numbers) == 120)

        numbers = 0L :: 999L :: 33L :: -1L :: 10L :: Nil
        assert(MathLibrary.SeriesProduct(numbers) == 0)

        numbers = 9L :: 9L :: 8L :: 9L :: Nil
        assert(MathLibrary.SeriesProduct(numbers) == 5832)
    }

    test("Compute the sume of a list") {
        val numbers = 2L :: 3L :: 5L :: 7L :: Nil
        assert(MathLibrary.SeriesSum == 17)
    }

}