package SparkExercise

import org.apache.spark.{SparkConf, SparkContext}

object rdd_sample {
  def main(args: Array[String]): Unit = {
    val sparkconf = new SparkConf()

    sparkconf.setAppName("First spark application")
      .setMaster("local")
    val sc = new SparkContext(sparkconf)
    val array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val arrayrdd = sc.parallelize(array, 2)
    println("number of elements in rdd", arrayrdd.count())
    arrayrdd.collect().foreach(println)
  }
}
