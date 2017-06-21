package mian.lesson2_7

/**
  * Created by Administrator on 2017/6/21.
  * 函数
  */
object Defunction {

  def main(args: Array[String]): Unit = {
    getMaxValue(5, 6)
//
    //    print("8与9比较大小：" + getMaxValue(8, 9) + "\n")
    //    var min = minValue(9, 9)
    //    print(min + "\n")
    //    print(spaceInsteadRetrun)

    print(decorare("hello","ww","kk"))
  }

  //含参数的函数

  def getMaxValue(a: Int, b: Int): Int = {
    var maxValue: Int = 0
    if (a > b)
      maxValue = a;
    else
      maxValue = b
    return maxValue;
  }

  def minValue(x: Int, y: Int): Int = if (x > y) y else x


  /**
    * 用代码块做返回而不用Retrun
    */
  def spaceInsteadRetrun() = {
    val a = 12
    val b = 77
    var vaza: Int = 0
    vaza = a + b
    vaza
  }

  def decorare(str: String,left :String ="[",right: String="]")=left+str+right

}
