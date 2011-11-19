package fr.foo.bar.knight

import rules.{FooContainsRule, FooDividedRule}

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
    FooDividedRule.stroke(number) + FooContainsRule.stroke(number)
  }
}