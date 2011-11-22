package fr.foo.bar.knight

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 20/11/11
 * Time: 00:04
 */

object DeadlyStruggle extends App {

  val foo = KnightAward(3, "Foo")
  val bar = KnightAward(5, "Bar")
  val qix = KnightAward(7, "Qix")

  val fooBarKnight = Knight(FooBarRules(foo :: bar :: qix :: Nil).define)

  for (opponent <- 1 to 100) {
    println(fooBarKnight.fight(opponent))
  }
}