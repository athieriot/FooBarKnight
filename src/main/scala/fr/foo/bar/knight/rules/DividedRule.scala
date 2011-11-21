package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class DividedRule(divedFactor: Int, achievementAward: String) extends KnightRule {

  private val EMPTY_STRING = ""

  private val MODULO_NO_REST = 0

  def stroke(number: Int): String = applyRule(number) match {
    case MODULO_NO_REST => achievementAward
    case _ => EMPTY_STRING
  }

  private def applyRule(number: Int) = number % divedFactor
}