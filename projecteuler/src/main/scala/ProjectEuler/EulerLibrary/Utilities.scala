package ProjectEuler.EulerLibrary

object Utilities {

    /**
      * Format the system time given in nanoseconds in HH:MM:SS.mmm
      *
      * @param totalTime  The time in nanoseconds
      * @return           A formatted string of HH:MM:SS.mmm
      */
    def FormatMilliseconds(totalTime: Long) : String = {

        val totalMilliseconds: Long = totalTime / 1000000
        val milliseconds: Long = totalMilliseconds % 1000
        val totalseconds: Long = totalMilliseconds / 1000
        val seconds: Long = totalseconds % 60
        val totalminutes: Long = totalseconds / 60
        val minutes: Long = totalminutes % 60
        val hours: Long = totalminutes / 60

        val formatMilliseconds: String = if (milliseconds < 1) "000"
            else if (milliseconds < 10) "00" + milliseconds.toString
            else if (milliseconds < 100) "0" + milliseconds.toString
            else milliseconds.toString

        val formatSeconds: String = if (seconds < 10) "0" + seconds.toString else seconds.toString
        val formatMinutes: String = if (minutes < 10) "0" + minutes.toString else minutes.toString
        val formatHours: String = if (hours < 10) "0" + hours.toString else hours.toString

        formatHours + ":" + formatMinutes + ":" + formatSeconds + "." + formatMilliseconds
    }
}