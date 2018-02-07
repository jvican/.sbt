libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.21"
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
resolvers += Resolver.bintrayIvyRepo("duhemm", "sbt-plugins")
addSbtPlugin("org.duhemm" % "sbt-errors-summary" % "0.6.0")
//addSbtPlugin("org.ensime" % "sbt-ensime" % "1.12.14")
addSbtPlugin("com.eed3si9n" % "sbt-slash" % "0.1.0")
addSbtPlugin("com.scalapenos" % "sbt-prompt" % "1.0.1")
//addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "b975d762")
//addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.1")
