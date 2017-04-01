organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.2.14-SNAPSHOT"

deps ++= Seq(
  libs.value('args4j),
  libs.value('args4s),
  libs.value('paths),
  "org.apache.parquet" % "parquet-avro" % "1.8.0",
  "org.bdgenomics.utils" %% "utils-misc" % "0.2.13",
  "org.bdgenomics.utils" %% "utils-metrics" % "0.2.13"
)

providedDeps ++= Seq(
  libs.value('hadoop),
  libs.value('spark)
)
