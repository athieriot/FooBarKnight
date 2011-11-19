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

  def define: List[KnightRule] = (DividedRule(foo)
                               :: DividedRule(bar)
                               :: DividedRule(qix)
                               :: ContainsRule(foo :: bar :: qix :: Nil)
                               :: Nil)

}