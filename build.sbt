group("org.hammerlab.bdg-utils")
name := "cli"
r"0.3.0"
github.repo("bdg-utils")
dep(
  args4j,
  args4s % "1.3.0",
   paths % "1.2.0",
  parquet_avro
)
