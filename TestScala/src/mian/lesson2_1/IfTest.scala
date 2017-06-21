package mian.lesson2_1

/**
  * Created by Administrator on 2017/6/21.
  * 条件控制
  */
object IfTest {
  def main(args: Array[String]): Unit = {
    funIf(5)
    funIf2()
    funIf()
  }

  /**
    *
    * @param a
    */
  def funIf(a: Int): Unit = {
    var z = if (2 > a)
      1;
    else
      2
    print(z + "\n")
  }

  def funIf2(): Unit = {
    var K = if (2 > 1)
      "我是字符串";
    else
      3

    print(K)
  }

  def funIf(): Unit = {
    var x = 30
    if (x > 30) {
      print("x大于30")
    } else if (x == 30) {
      print("x等于30")
    } else {
      print("x等于小于")
    }
  }
}
