package com.diffblue.java_test

import spock.lang.Shared
import spock.lang.Specification

class SearchSpec extends Specification
{
  def search = new Search()

  def "Search method"()
  {
    int[] empty = []
    int[] x = [1, 2, 3]
    when: "Array has no elements"
    then: "Return false"
    !search.search(empty, 5)
    when: "Array contains the element"
    then: "Return true"
    search.search(x, 1)
    when: "Array does not contain the element"
    then: "Return false"
    !search.search(x, 4)
  }
}
