package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

object FooDividedRule extends KnightRule {

  private val DIVED_NUMBER = 3
  private val FOO = "Foo"

  def stroke(number: Int): String = applyRule(number) match {
    case 0 => FOO
    case _ => ""
  }

  private def applyRule(number: Int): Int = number % DIVED_NUMBER
}