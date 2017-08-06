package org.bdgenomics.utils.cli

import org.hammerlab.test.Suite
import org.kohsuke.args4j.Option

class Args4jTest
  extends Suite {
  test("parsing") {
    Args4j[TestArgs](
      Array("-f", "abc")
    ) match {
      case Left(args) ⇒
        args.foo should be("abc")
        args.doPrintUsage should be(false)
      case Right(exitCode) ⇒
        fail(s"Arg-parsing exited with code $exitCode")
    }
  }

  test("missing required arg") {
    Args4j[TestArgs](
      Array()
    ) should be(Right(1))
  }

  test("help") {
    Args4j[TestArgs](
      Array("-h")
    ) should be(
      Right(0)
    )

    Args4j[TestArgs](
      Array("-f", "abc", "-h")
    ) should be(
      Right(0)
    )
  }
}

class TestArgs
  extends Args4jBase {
  @Option(
    name = "-f",
    aliases = Array("--foo"),
    required = true,
    usage = "Foo"
  )
  var foo: String = _
}
