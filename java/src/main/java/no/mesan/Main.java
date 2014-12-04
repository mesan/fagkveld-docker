package no.mesan;


public class Main {

  public static String getEnvOrElse(String property, String def) {
    String s = System.getenv(property);
    if (s == null || "".equals(s)) {
      return def;
    } else {
      return s;
    }
  }

  public static void main(String[] ags) {
    System.out.println(getEnvOrElse("MYSQL_PORT_3306_TCP_ADDR", "cannot find mysql host"));
    System.out.println(getEnvOrElse("MYSQL_PORT_3306_TCP_PORT", "cannot find mysql port number"));
  }
}
