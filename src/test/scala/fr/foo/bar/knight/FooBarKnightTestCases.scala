package fr.foo.bar.knight

import org.scalatest.FunSuite

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:16
 */

class FooBarKnightTestCases extends FunSuite {

  test("1 is divide by neither 3, 5 or 7 and does not contains 3, 5 or 7 so it writes : 1") {
    assert(FooBarKnight.fight(1) == "1")
  }

  test("6 is divide by 3 so it writes : Foo") {
    assert(FooBarKnight.fight(6) == "Foo")
  }

  test("3 is divide by 3 and contains 3 so it writes : FooFoo") {
    assert(FooBarKnight.fight(3) == "FooFoo")
  }
}