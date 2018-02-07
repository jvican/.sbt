import com.scalapenos.sbt.prompt._
import SbtPrompt.autoImport._
promptTheme := PromptTheme(List(
  text("sbt", fg(green)),
  text(" @ ", fg(white)),
  currentProject(fg(magenta)),
  text(" > ", fg(white))
))

resolvers ++= (
  if (scalaVersion.value.contains("-bin"))
     List("scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/")
  else Nil
)

resolvers ++= {
  val scalaV = scalaVersion.value
  if ((scalaV.contains("bin") && scalaV.endsWith("-SNAPSHOT")) || scalaV.contains("-nightly")) {
    List(
      "pr-scala snapshots" at "https://scala-ci.typesafe.com/artifactory/scala-pr-validation-snapshots/",
      Resolver.mavenLocal
    )
  } else Nil
}

// Ensime customisation
// import org.ensime.EnsimeKeys._
// ensimeJavaFlags ++= Seq("-Xmx4g")
// ensimeCachePrefix in ThisBuild := Some(file("/tmp"))

cancelable in Global := true
updateOptions in Global := (updateOptions in Global).value.withCachedResolution(true)
