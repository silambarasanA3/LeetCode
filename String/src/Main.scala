object Main {
  def main(args: Array[String]): Unit = {
     for(i <- 0 to 100 by 3)
      {
        println(s"numbers divisible by 3:$i")
       }
  }
}