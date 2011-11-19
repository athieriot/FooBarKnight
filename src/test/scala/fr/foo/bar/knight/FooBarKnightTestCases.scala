package fr.foo.bar.knight

import org.scalatest.FunSuite

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:16
 */

class FooBarKnightTestCases extends FunSuite {

  val fooBarKnight: Knight = Knight(FooBarRules.define)

  test("1 is divide by neither 3, 5 or 7 and does not contains 3, 5 or 7 so it writes : 1") {
    assert(fooBarKnight.fight(1) == "1")
  }

  test("6 is divide by 3 so it writes : Foo") {
    assert(fooBarKnight.fight(6) == "Foo")
  }

  test("3 is divide by 3 and contains 3 so it writes : FooFoo") {
    assert(fooBarKnight.fight(3) == "FooFoo")
  }

  test("33 is divide by 3 and contains 3 twice so it writes : FooFooFoo") {
    assert(fooBarKnight.fight(33) == "FooFooFoo")
  }

  test("45 is divide by 3 and 5 and contains 5 so it writes : FooBarBar") {
    assert(fooBarKnight.fight(45) == "FooBarBar")
  }

  test("51 is divide by 3 and contains 5 so it writes : FooBar") {
    assert(fooBarKnight.fight(51) == "FooBar")
  }

  test("21 is divide by 3 and 7 so it writes : FooQix") {
    assert(fooBarKnight.fight(21) == "FooQix")
  }

  test("13 contains 3 so it writes : Foo") {
    assert(fooBarKnight.fight(13) == "Foo")
  }

  test("15 is divide by 3 and 5 and contains 5 so it writes : FooBarBar") {
    assert(fooBarKnight.fight(15) == "FooBarBar")
  }
}