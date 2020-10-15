val refinedVersion        = "0.9.17"
val catsVersion           = "2.2.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.iban4j"         % "iban4j"              % "3.2.1",
  "eu.timepit"        %% "refined"             % refinedVersion
)

mdocIn := baseDirectory.value / "tut"
mdocOut := baseDirectory.value / "docs"

enablePlugins(MdocPlugin)
