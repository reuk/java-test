package com.diffblue.java_test

import spock.lang.Shared
import spock.lang.Specification

class CalcSpec extends Specification
{
  def uniqueCalc = new Calc()
  @Shared sharedCalc = new Calc()

  def "divide by one"()
  {
    def before = 2
    when: "Number is divided by one"
    def after = uniqueCalc.div(before, 1)
    then: "Should remain unchanged"
    after == before
  }

  def "divide by two"()
  {
    def before = 8
    when: "Number is divided by two"
    def after = sharedCalc.div(before, 2)
    then: "Result is the same as a right shift"
    after == (before >> 1)
  }
}
