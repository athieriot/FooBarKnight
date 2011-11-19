package fr.foo.bar.knight

import rules.{KnightRule, FooContainsRule, FooDividedRule}
import collection.parallel.immutable.ParSeq

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

object FooBarKnight {

  def fight(number: Int): String = resolveEngagement(number) match {
    case "" => number.toString
    case x => x
  }

  def resolveEngagement(number: Int): String = {
    val rules: List[KnightRule] = (FooDividedRule :: FooContainsRule :: Nil)

    rules.collect{ case f => f.stroke(number) }.mkString
  }
}