package fr.foo.bar.knight.rules

import java.lang.{StringBuffer, StringBuilder}
import javax.management.remote.rmi._RMIConnection_Stub
import xml.dtd.EMPTY

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

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