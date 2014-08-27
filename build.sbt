
scalaVersion := "2.11.2"

// Fails:
libraryDependencies += "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "1.46.0" % "test"

// Succeeds:
// libraryDependencies += "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "1.45" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"