package fr.foo.bar.knight

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:21
 */

object FooBarKnight {

  def fight(number: Int): String = number match {
    case 1 => return "1"
    case 3 => return "FooFoo"
    case 6 => return "Foo"
  }
}