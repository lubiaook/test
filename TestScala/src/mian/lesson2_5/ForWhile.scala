package mian.lesson2_5

/**
  * Created by Administrator on 2017/6/21.
  */
object ForWhile {


  def main(args: Array[String]): Unit = {
//    funWhile(20)
//    funFor(20)
    funNoPoint()
  }


  def funWhile(s: Int): Unit = {
    var value = s
    while (value > 0) {
      print("value值为：" + value + "\n")
      value = value - 1;
    }
  }
  def funFor(s:Int): Unit = {
    for (i<-1 to s) {
      print("value值为：" + i + "\n")
    }
  }

  def funNoPoint(): Unit = {
    var length :Int=0
    for (cha<-"llheo") {
      length+=cha
      print("length：" + length + "\n")
    }
  }
}
