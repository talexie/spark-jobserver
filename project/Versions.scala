object Versions {
  lazy val spark = sys.env.getOrElse("SPARK_VERSION", "2.4.7")

  lazy val akka = "2.5.32"
  lazy val akkaHttp = "10.1.14"
  lazy val akkaHttpCors = "0.4.2"
  lazy val commons = "1.4"
  lazy val derby = "10.12.1.1"
  lazy val flyway = "4.2.0"
  lazy val hadoop = "3.2.2"
  lazy val h2 = "1.3.176"
  lazy val java = sys.env.getOrElse("JAVA_VERSION", "11-jdk")
  lazy val jjwt = "0.9.1"
  lazy val jwksRsa = "0.15.0"
  lazy val logback = "1.2.3"
  lazy val metrics = "2.2.0"
  lazy val postgres = "42.2.19"
  lazy val mysql = "8.0.23"
  lazy val py4j = "0.10.9.2"
  lazy val scalaTest = "3.1.4"
  lazy val scalactic = "3.1.4"
  lazy val slf4j = "1.7.30"
  lazy val mockito = "2.28.2"
  lazy val shiro = "1.7.1"
  lazy val slick = "3.3.3"
  lazy val typeSafeConfig = "1.4.1"
  lazy val cassandraConnector = "2.5.1"
  lazy val curator = "4.2.0"
  lazy val curatorTest = "4.2.0"
  lazy val commonConfigurations = "1.10"
}
