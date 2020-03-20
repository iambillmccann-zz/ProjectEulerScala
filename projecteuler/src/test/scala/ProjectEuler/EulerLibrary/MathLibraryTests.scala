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

}