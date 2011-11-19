package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class ContainsRule(containCharacter: Char, achievementAward: String) extends KnightRule {

  def stroke(number: Int): String = applyRule(number) match {
    case n => achievementAward * n
  }

  private def applyRule(number: Int): Int = number.toString.count(_ == containCharacter)
}