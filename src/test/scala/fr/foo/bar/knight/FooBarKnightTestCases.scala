package fr.foo.bar.knight

import org.scalatest.FunSuite

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 19:16
 */

class FooBarKnightTestCases extends FunSuite {

  val foo = KnightAward(3, "Foo")
  val bar = KnightAward(5, "Bar")
  val qix = KnightAward(7, "Qix")

  val fooBarKnight: Knight = Knight(FooBarRules(foo :: bar :: qix :: Nil).define)

  test("1 divides by neither 3, 5 or 7 and does not contain 3, 5 or 7 so it writes : 1") {
    assert(fooBarKnight.fight(1) == "1")
  }

  test("6 divides by 3 so it writes : Foo") {
    assert(fooBarKnight.fight(6) == "Foo")
  }

  test("3 divides by 3 and contains 3 so it writes : FooFoo") {
    assert(fooBarKnight.fight(3) == "FooFoo")
  }

  test("33 divides by 3 and contains 3 twice so it writes : FooFooFoo") {
    assert(fooBarKnight.fight(33) == "FooFooFoo")
  }

  test("45 divides by 3 and 5 and contains 5 so it writes : FooBarBar") {
    assert(fooBarKnight.fight(45) == "FooBarBar")
  }

  test("51 divides by 3 and contains 5 so it writes : FooBar") {
    assert(fooBarKnight.fight(51) == "FooBar")
  }

  test("21 divides by 3 and 7 so it writes : FooQix") {
    assert(fooBarKnight.fight(21) == "FooQix")
  }

  test("13 contains 3 so it writes : Foo") {
    assert(fooBarKnight.fight(13) == "Foo")
  }

  test("15 divides by 3 and 5 and contains 5 so it writes : FooBarBar") {
    assert(fooBarKnight.fight(15) == "FooBarBar")
  }

  test("53 contains 5 and 3 so it writes : BarFoo") {
    assert(fooBarKnight.fight(53) == "BarFoo")
  }
}