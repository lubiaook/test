package mian.lesson2_6

/**
  * Created by Administrator on 2017/6/21.
  * for 循环的推导式
  * 关键字 yield
  */
object ForDeduction {

  def main(args: Array[String]): Unit = {
    //    deductionFuncNum
    deductionFunc
  }

  /**
    *
    * for 循环的循环体从yield开始执行 形成一个集合
    *
    * 打印结果：Vector(0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0)
    */
  def deductionFuncNum(): Unit = {
    print(for (i <- 0 to 10) yield (i % 2).toInt)
  }

  /**
    * 集合的数据类型会与第一个兼容
    * Vector(105, 102, 109, 109, 112)
    */
  def deductionFunc(): Unit = {
    print("\n")
    print(for (i <- 1 to 1; j <- "hello") yield (i + j).toInt)
  }

}
