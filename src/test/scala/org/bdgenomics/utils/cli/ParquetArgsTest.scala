package org.bdgenomics.utils.cli

import org.hammerlab.paths.Path
import org.hammerlab.test.Suite

class TestParquetArgs
  extends ParquetLoadSaveArgs

class ParquetArgsTest
  extends Suite {
  test("parse args") {
    val args =
      Args4j[TestParquetArgs](
        Array(
          "a/b/c",  // input path
          "d/e/f"   // output path
        )
      ) match {
        case Left(args) ⇒ args
        case Right(exitCode) ⇒ fail(s"Arg-parsing exited with code $exitCode")
      }

    args.inputPath should be(Path("a/b/c"))
    args.outputPath should be(Path("d/e/f"))
  }
}
