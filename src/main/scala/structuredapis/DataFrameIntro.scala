package structuredapis
import org.apache.spark.sql.SparkSession

object DataFrameIntro {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Simple Spark App")
      .master("local[*]") // Run locally using all cores
      .getOrCreate()

    import spark.implicits._
    //Spark logic goes here
    val data = Seq("hello", "world").toDF("value")
    data.show()

    spark.stop()
  }
}
