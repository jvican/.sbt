import com.scalapenos.sbt.prompt._
import SbtPrompt.autoImport._
promptTheme := PromptTheme(List(
  text("sbt", fg(green)),
  text(" @ ", fg(white)),
  currentProject(fg(magenta)),
  text(" > ", fg(white))
))

// For God's sake, don't fucking publish docs
publishArtifact in (Compile, packageDoc) in ThisBuild :=
  !version.value.endsWith("-SNAPSHOT")

cancelable in Global := true
updateOptions in Global := (updateOptions in Global).value.withCachedResolution(true)
