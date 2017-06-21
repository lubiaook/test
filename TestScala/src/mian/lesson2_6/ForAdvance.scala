package mian.lesson2_6

/**
  * Created by Administrator on 2017/6/21.
  * 高级for循环
  * for 循环推倒式
  */
object ForAdvance {

  def main(args: Array[String]): Unit = {
        mutlBuildOrgan()
    //    mutilGuardBulid()
    mutilMoreDefinInForBuild()
    mutlBuildOrganExptiion()
  }


  /**
    *  异常测试
    */
  def mutlBuildOrganExptiion(): Unit = {
    for (i <- 1 to 1) {
      print("i:  " + i + "\n")
    }
  }
  /**
    * 多个生成器
    */
  def mutlBuildOrgan(): Unit = {
    for (i <- 2 to 2; j <- 2 to 6) {
      print("i:  " + i + "\n")
      print("j:  " + j + "\n")
      print("i*j:  " + i * j + "\n")
    }
  }

  /**
    * 每个生成器都可以带一个守卫 (以if为开头的Boolean表达式)
    * eg： for(i<-0 to 2 ;j<-2 to 6 if i==j)
    *
    * 注意 if 前门没有分号 ";"
    */
  def mutilGuardBulid(): Unit = {
    for (i <- 0 to 2; j <- 2 to 6 if i == j)
    //       print("i:  "+i+"\n")
    //       print("j:  "+j+"\n")
      print("i*j:  " + i * j + "\n")
  }

  def mutilGuardsBulid(): Unit = {
    for (i <- 1 to 2; k <- 1 to 2; j <- 2 to 6 if i == j)
      print("i*j:  " + i * j + "\n")
  }

  /**
    * 可使用任意多任何定义 引入可以再循环中使用的变量
    */
  def mutilMoreDefinInForBuild(): Unit = {
    for (i <- 1 to 2; form = i + 1; j <- 2 to form) {
      print("i:  " + i + "\n")
      print("j:  " + j + "\n")
      print("i*j:  " + i * j + "\n")
    }
  }
}
