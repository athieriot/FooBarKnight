package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class DividedRule(divedFactor: Int, achievementAward: String) extends KnightRule {

  def stroke(number: Int): String = applyRule(number) match {
    case 0 => achievementAward
    case _ => ""
  }

  private def applyRule(number: Int): Int = number % divedFactor
}