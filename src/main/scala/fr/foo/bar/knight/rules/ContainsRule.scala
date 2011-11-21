package fr.foo.bar.knight.rules

import java.lang.{StringBuffer, StringBuilder}
import javax.management.remote.rmi._RMIConnection_Stub

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:10
 */

case class ContainsRule(containsPairs: List[Pair[Int, String]]) extends KnightRule {

  val containsMap: Map[String, String] = containsPairs.collect{case p => (p._1.toString, p._2)}.toMap

  def stroke(number: Int): String = applyRule(number)

  private def applyRule(number: Int): String = {
    number.toString.map {
      case x if containsMap.contains(x.toString) => containsMap.apply(x.toString)
      case y => ""
    }.mkString
  }
}