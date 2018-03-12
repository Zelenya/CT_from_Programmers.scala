enablePlugins(TutPlugin)

scalaVersion := "2.12.3"

scalacOptions in Tut ~= (_.filterNot(Set("-Ywarn-unused-import", "-Ywarn-dead-code")))
scalacOptions in Tut += "-Ypartial-unification"
