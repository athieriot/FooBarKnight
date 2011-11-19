package fr.foo.bar.knight

import rules.{DividedRule, KnightRule, ContainsRule}

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

object FooBarRules {

  val fooDividedRule: KnightRule = DividedRule(3, "Foo")
  val fooContainsRule: KnightRule = ContainsRule('3', "Foo")

  val barDividedRule: KnightRule = DividedRule(5, "Bar")
  val barContainsRule: KnightRule = ContainsRule('5', "Bar")

  val rules: List[KnightRule] = (fooDividedRule :: barDividedRule :: fooContainsRule :: barContainsRule :: Nil)

  def define = rules

}