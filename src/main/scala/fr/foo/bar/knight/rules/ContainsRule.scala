package fr.foo.bar.knight.rules

import java.lang.{StringBuffer, StringBuilder}

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class ContainsRule(containsPairs: List[Pair[Int, String]]) extends KnightRule {

  def stroke(number: Int): String = applyRule(number)

  private def applyRule(number: Int): String = {
    //TODO: I have to do better
    var stringNumber = number.toString

    containsPairs.foreach(cp => stringNumber = stringNumber.replaceAll(cp._1.toString, cp._2))
    stringNumber = stringNumber.replaceAll("[0-9]", "")

    return stringNumber
  }
}