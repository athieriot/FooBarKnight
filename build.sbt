name := "FooBarKnight"

organization <<= name
 
version := "0.1"
  
scalaVersion := "2.9.1"
   
libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

scalaSource in Test <<= baseDirectory(_ / "test")
