package helton

import org.apache.spark.sql.SparkSession

// define main method (Spark entry point)
object HelloWorld {
  def main(args: Array[String]) {

    // initialise spark context
    val spark = SparkSession
      .builder()
      .appName("IDR Extract Validation")
      .getOrCreate()
    import spark.implicits._

    val someDF = Seq(
      (8, "bat"),
      (64, "mouse"),
      (-27, "horse")
    ).toDF("number", "word")
    someDF.show
    someDF.write.option("multiline", true).json("/Users/jarrett.helton/Downloads/spark-hello-world-master/test")

  }
}
