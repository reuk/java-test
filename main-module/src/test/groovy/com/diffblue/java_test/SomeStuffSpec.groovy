package com.diffblue.java_test

import spock.lang.Shared;
import spock.lang.Specification;

class SomeStuffSpec extends Specification
{
  def setupSpec()
  {
    println "Bringing up spec"
  }

  def setup()
  {
    println "Bringing up test"
  }

  def cleanup()
  {
    println "Tearing down test"
  }

  def cleanupSpec()
  {
    println "Tearing down spec"
  }

  def "has no B"()
  {
    when: "A is constructed"
    def a = new some_stuff.A()
    then: "It has no B"
    !a.hasB()
  }

  def "has a B"()
  {
    def a = new some_stuff.A()
    when: "setB is called on an A"
    a.setB(new some_stuff.B())
    then: "It has a B"
    a.hasB()
  }
}
