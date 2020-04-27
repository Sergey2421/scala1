import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite {
  test("IndexOf") {
    val array = Array(1,2,3,4,5,6,7,8,9,20,25,23,24,29,34,28,1,2,3,4,5,6,47,5)
    val result = array.indexOf(3)
    assert(result.equals(task1.indexOFRec(3, array)))
  }

}