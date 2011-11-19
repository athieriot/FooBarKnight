package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

object FooContainsRule extends KnightRule {

  private val CONTAIN_CHAR = '3'
  private val FOO = "Foo"

  def stroke(number: Int): String = applyRule(number) match {
    case n => FOO * n
  }

  private def applyRule(number: Int): Int = number.toString.count(_ == CONTAIN_CHAR)
}