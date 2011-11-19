package fr.foo.bar.knight

import rules.KnightRule

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 21:57
 */

case class Knight(rules: List[KnightRule]) {

  private val EMPTY_STRING = ""

  def fight(number: Int): String = resolveEngagement(number) match {
    case EMPTY_STRING => number.toString
    case x => x
  }

  def resolveEngagement(number: Int): String = {
    rules.collect {
      case f => f.stroke(number)
    }.mkString
  }
}