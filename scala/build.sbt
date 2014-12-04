import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._


scalaVersion in ThisBuild := "2.11.2"

organization in ThisBuild := "no.mesan"

version in ThisBuild := "1.0-SNAPSHOT"

packageArchetype.java_application
