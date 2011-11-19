package fr.foo.bar.knight

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 20/11/11
 * Time: 00:04
 */

object DeadlyStruggle extends App {

  val fooBarKnight = Knight(FooBarRules.define)

  for (opponent <- 1 to 100) {
    println(fooBarKnight.fight(opponent))
  }
}