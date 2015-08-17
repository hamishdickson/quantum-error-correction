package com.github.hamishdickson.qec

import org.scalatest._

class StateTest extends FlatSpec with Matchers {
  "A qubit" should "remain unchanged if no error" in {
    val qubit:Qubit = Qubit(1, 1).normalize()

    qubit.qec() should be (qubit)
  }

  "A qubit" should "be normalized" in {
    val qubit: Qubit = Qubit(2, 2)

    qubit.normalize().x should be (2 / Math.sqrt(8))
  }
}
