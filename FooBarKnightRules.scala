package fr.foo.bar.knight.rules

import java.lang.{StringBuffer, StringBuilder}


sealed trait KnightRule {
  def stroke(number: Int): String
}

case class ContainsRule(containsMap: Map[String, String]) extends KnightRule {
  private val EMPTY_STRING = ""

  def stroke(number: Int): String = applyRule(number)

  private def applyRule(number: Int) = {
    number.toString.map {
      c => containsMap.get(c.toString) match {
        case Some(x) => x
        case None => EMPTY_STRING
      }
    }.mkString
  }
}


case class DividedRule(divedFactor: Int, achievementAward: String) extends KnightRule {

  private val EMPTY_STRING = ""

  private val MODULO_NO_REST = 0

  def stroke(number: Int): String = applyRule(number) match {
    case MODULO_NO_REST => achievementAward
    case _ => EMPTY_STRING
  }

  private def applyRule(number: Int) = number % divedFactor
}

