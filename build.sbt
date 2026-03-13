name := "SparkInsAndOuts"
version := "1.0"
scalaVersion := "2.12.17" // Use a version compatible with Spark

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.0",
  "org.apache.spark" %% "spark-sql" % "3.5.0"
  // Add other Spark modules (e.g., spark-mllib) here if needed
)
