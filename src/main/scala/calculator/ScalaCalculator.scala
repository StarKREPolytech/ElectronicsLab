package calculator

import scala.collection.immutable.List

class ScalaCalculator {

  val fList: List[Double] = List.empty
  val inputUList: List[Double] = List.empty
  val outputUList: List[Double] = List.empty

  def countDbList(graphicMode: Boolean): Unit = {
    for (i <- this.fList.indices) {
      val coeff = countCoeff(this.inputUList(i), this.outputUList(i))
      val db = countDb(coeff)
      if (graphicMode) {
        System.out.print("(" + this.fList(i) + ";" + db + ")")
      } else {
        System.out.print(db)
      }
    }
  }

  def countCoeffList(): Unit = {
    for (i <- this.fList.indices){
      val  coeff = countCoeff(this.inputUList(i), this.outputUList(i))
        System.out.print(coeff)
    }
  }

  def countSimpleErr(theory: Double, experimental : Double): Double = (theory - experimental) / theory * 100

  def countBiErr(err1: Double, err2 : Double):Double = Math.sqrt(Math.pow(err1, 2) + Math.pow(err2, 2))

  def greeting(): Unit = System.out.println("Hello Electronics!!!")

  private def countCoeff(inputU: Double, outputU: Double): Double = outputU / inputU

  private def countDb(countCoeff: Double) = 20 * Math.log10(countCoeff)
}