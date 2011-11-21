package fr.foo.bar.knight

import rules.{DividedRule, KnightRule, ContainsRule}

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

object FooBarRules {

  val foo = KnightAward(3, "Foo")
  val bar = KnightAward(5, "Bar")
  val qix = KnightAward(7, "Qix")

  def define: List[KnightRule] = (DividedRule(foo.factor, foo.achievement)
                               :: DividedRule(bar.factor, bar.achievement)
                               :: DividedRule(qix.factor, qix.achievement)
                               :: ContainsRule(Map(foo.factor.toString -> foo.achievement,
                                                   bar.factor.toString -> bar.achievement,
                                                   qix.factor.toString -> qix.achievement))
                               :: Nil)

}