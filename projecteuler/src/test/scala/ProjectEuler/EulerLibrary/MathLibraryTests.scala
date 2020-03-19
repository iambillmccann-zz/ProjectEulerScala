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

}