package fr.foo.bar.knight.rules

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 19/11/11
 * Time: 20:11
 */

trait KnightRule {
  def stroke(number: Int): String
}