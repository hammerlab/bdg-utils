organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.2.16-SNAPSHOT"

deps ++= Seq(
  args4j,
  args4s % "1.2.4-SNAPSHOT",
  bdg_utils_metrics,
  bdg_utils_misc,
  paths % "1.1.1-SNAPSHOT",
  parquet_avro
)

providedDeps ++= Seq(
  hadoop,
  spark
)
