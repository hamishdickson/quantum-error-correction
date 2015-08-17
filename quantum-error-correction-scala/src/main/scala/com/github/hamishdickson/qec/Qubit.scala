package com.github.hamishdickson.qec

case class Qubit(x: Double, y: Double) {
  def qec(): Qubit = this

  def normalize(): Qubit = {
    val newX = x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
    val newY = y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))

    Qubit(newX, newY)
  }
}
