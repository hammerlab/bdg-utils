organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.3.0"

deps ++= Seq(
  args4j,
  args4s % "1.2.4",
  paths % "1.2.0",
  parquet_avro
)
