package fr.foo.bar.knight

import rules.{DividedRule, KnightRule, ContainsRule}

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

object FooBarRules {

  val foo = Pair(3, "Foo")
  val bar = Pair(5, "Bar")
  val qix = Pair(7, "Qix")

  val fooDividedRule: KnightRule = DividedRule(foo)
  val barDividedRule: KnightRule = DividedRule(bar)
  val qixDividedRule: KnightRule = DividedRule(qix)

  val fooBarQixContainsRule: KnightRule = ContainsRule(foo :: bar :: qix :: Nil)

  val rules: List[KnightRule] = (fooDividedRule
                                 :: barDividedRule
                                 :: qixDividedRule
                                    :: fooBarQixContainsRule :: Nil)

  def define = rules

}