package ProjectEuler.EulerLibrary

import ProjectEuler.EulerLibrary.Utilities
import org.scalatest._

class UtilitiesTests extends FunSuite {

    test("Milliseconds less than 10 do not have the proper leading zeros") {
        val theTime: Long = 6000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:00:00.006")
    }

    test("Milliseconds less than 100 do not have the proper leading zeros") {
        val theTime: Long = 76000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:00:00.076")
    }

    test("Seconds less than 10 do not have the proper leading zeros") {
        val theTime: Long = 5000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:00:05.000")
    }

    test("Minutes less than 10 do not have the proper leading zeros") {
        val theTime: Long = 180000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:03:00.000")
    }

    test("Hours less than 10 do not have the proper leading zeros") {
        val theTime: Long = 7200000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "02:00:00.000")
    }

    test("Milliseconds shall not exceed 999") {
        val theTime: Long = 1000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:00:01.000")
    }

    test("Seconds shall not exceed 59") {
        val theTime: Long = 60000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "00:01:00.000")
    }

    test("Hours greater than 99 show all significant digits") {
        val theTime: Long = 360000000000000L
        assert(Utilities.FormatMilliseconds(theTime) == "100:00:00.000")
    }

}