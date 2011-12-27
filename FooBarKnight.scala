package fr.foo.bar.knight

import rules.{DividedRule, ContainsRule, KnightRule}

object DeadlyStruggle extends App {

  val foo = KnightAward(3, "Foo")
  val bar = KnightAward(5, "Bar")
  val qix = KnightAward(7, "Qix")

  val fooBarKnight = Knight(FooBarRules(foo :: bar :: qix :: Nil).define)

  for (opponent <- 1 to 100) {
    println(fooBarKnight.fight(opponent))
  }
}


case class Knight(rules: List[KnightRule]) {

  private val EMPTY_STRING = ""

  def fight(number: Int): String = resolveEngagement(number) match {
    case EMPTY_STRING => number.toString
    case x => x
  }

  def resolveEngagement(number: Int): String = {
    rules.collect {
      case f => f.stroke(number)
    }.mkString
  }
}

case class KnightAward(factor: Int, achievement: String)


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

