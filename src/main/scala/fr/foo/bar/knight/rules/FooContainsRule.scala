package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

object FooContainsRule extends KnightRule {

  private val CONTAIN_NUMBER = "3"
  private val FOO = "Foo"

  def stroke(number: Int): String = (number.toString.contains(CONTAIN_NUMBER)) match {
    case true => FOO
    case false => ""
  }
}