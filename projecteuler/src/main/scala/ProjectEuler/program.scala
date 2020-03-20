package ProjectEuler

import ProjectEuler.EulerLibrary.Problems._
import ProjectEuler.EulerLibrary.Utilities

object Program extends App {

  val QUITSTRING: String = "Q"
  val LASTPROBLEM: Int = 5
  
  /**
   * getUserInput is a simple method for reading from the console.
   * 
   * @return    A string that represents the user's input.
   */
  def GetUserInput(): Int = {
    val userInput = scala.io.StdIn.readLine("What problem shall I run? Or type 'Q' to quit. ")
    CheckUserInput(userInput)
  }

  /**
   * checkUserInput will validate the user's input. This is a very redimentary
   *  validation method. It checks three things ...
   *  1. Checks for the letter "Q"
   *  2. Checks for an integer
   *  3. Checks that the integer is positive
   *  4. Checks that the integer is no greater than the last problem solved.
   *  These checks assume that problems are solved in order.
   *  Note: If the user enters "Q", a minus one is returned to the caller.
   * 
   * @param userInput The string entered by the user
   * @return          An integer representing the problem number or -1 to quit
   */
  def CheckUserInput(userInput: String): Int = {
    if (userInput.toUpperCase == QUITSTRING) return -1

    try {
      val problemNumber: Int = userInput.toInt
      if (problemNumber < 0) {
        println("\nBTW, problem numbers are positive integers.")
        GetUserInput()
      } else if (problemNumber > LASTPROBLEM) {
        println("\nI have only completed problems 1 through " + LASTPROBLEM)
        GetUserInput()
      } else problemNumber
    } catch {
      case e: Exception => {
        println("\nSorry but I did not understand that. Please type the problem number or Q to quit.")
        GetUserInput()
      }
    }
  }

  /**
   * RunProblem is the main program's loop
   *
   * @param  problemNumber The Euler problem to run
   * @return               Integer value that is ignored
   */
  def RunProblem(problemNumber: Int): Int = {
    if (problemNumber < 1) problemNumber
    else {

      val startTime: Long = System.nanoTime()
      val result: String = ProblemFactory.GetSolution(problemNumber).Compute
      val stopTime: Long = System.nanoTime()
      val totalTime: Long = stopTime - startTime

      println("\n-----------------------------------------------------------------------")
      println("Solution to problem " + problemNumber + " = " + result)
      println("Execution time was " + Utilities.FormatMilliseconds(totalTime))
      println("-----------------------------------------------------------------------")
      RunProblem(GetUserInput())

    }
  }

  /* Run the program */
  RunProblem(GetUserInput())
  scala.io.StdIn.readLine("Goodbye. Press Enter to continue.")

}
