import com.knoldus.assignment.scala05._
import org.scalatest.FunSuite
class CalculatorTest extends FunSuite {
val calculatorobj=new Calculator()
  test("Additon test"){
    assert(calculatorobj.doAddition(-2,5)==3)
  }
  test("Subtraction Test"){
    assert(calculatorobj.doSubtraction(-3,-8)==(-11))
  }
  test("Multipication Test"){
    assert(calculatorobj.doMultiplication(-3,-4)==12)
  }
  test("Divison test"){
    assert(calculatorobj.doDivision(4,3)==1)
  }
}
