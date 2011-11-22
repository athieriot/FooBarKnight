package fr.foo.bar.knight

import rules.{ContainsRule, DividedRule, KnightRule}

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

case class FooBarRules(awards: List[KnightAward]) {

  def define: List[KnightRule] = dividedRules ::: containsRules

  private def dividedRules = {
    awards.collect {
      case award => DividedRule(award.factor, award.achievement)
    }
  }

  private def containsRules = {
    List(ContainsRule(awards.collect {
      case award => award.factor.toString -> award.achievement
    }.toMap))
  }
}