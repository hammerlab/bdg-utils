organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.3.0"
addScala212
deps ++= Seq(
  args4j,
  args4s % "1.3.0",
  paths % "1.2.0",
  parquet_avro
)
