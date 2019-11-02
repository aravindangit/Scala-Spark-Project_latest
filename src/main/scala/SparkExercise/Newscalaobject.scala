package SparkExercise

import org.apache.spark.sql.SparkSession

object Newscalaobject {
  def main(args:Array[String]): Unit ={
      val sparkSession = SparkSession.builder
        .master("local")
        .appName("spark session example")
        .getOrCreate()

    println("*******aravind gonna rock!!!!!!!!!****************************")
  }
}
