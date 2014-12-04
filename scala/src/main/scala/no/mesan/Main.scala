package no.mesan

import scala.util.Properties

object Main extends App {
  println(Properties.envOrElse("MYSQL_PORT_3306_TCP_ADDR", "cannot find mysql host"))
  println(Properties.envOrElse("MYSQL_PORT_3306_TCP_PORT", "cannot find mysql port number"))
}
