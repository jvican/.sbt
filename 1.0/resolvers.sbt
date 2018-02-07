resolvers ++= (
  if (scalaVersion.value.contains("-bin"))
     List("scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/")
  else Nil
)
