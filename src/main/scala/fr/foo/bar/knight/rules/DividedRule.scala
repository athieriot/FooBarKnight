package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class DividedRule(divedPair: Pair[Int, String]) extends KnightRule {

  private val divedFactor = divedPair._1
  private val achievementAward = divedPair._2

  def stroke(number: Int): String = applyRule(number) match {
    case 0 => achievementAward
    case _ => ""
  }

  private def applyRule(number: Int): Int = number % divedFactor
}