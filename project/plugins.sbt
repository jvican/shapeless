scalacOptions += "-deprecation"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"

addSbtPlugin("org.scala-native"                                  % "sbt-scala-native"      % "0.3.6")
addSbtPlugin("org.portable-scala"                  % "sbt-scalajs-crossproject" % "0.3.1")
