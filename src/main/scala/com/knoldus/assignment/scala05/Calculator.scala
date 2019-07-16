package com.knoldus.assignment.scala05

class Calculator {
  def doAddition(number1:Int,number2:Int)={
    number1+number2
  }
  def doSubtraction(number1:Int,number2:Int)={
    number1+number2
  }
  def doMultiplication(number1:Int,number2:Int)={
    number1*number2
  }
  def doDivision(number1:Int,number2:Int)={
    require(number2!=0,"please do enter diviser as zero!")
    number1/number2
  }

}
object Calc extends App{
  val calculatorobj=new Calculator()
  print(calculatorobj.doDivision(3,0))

}
