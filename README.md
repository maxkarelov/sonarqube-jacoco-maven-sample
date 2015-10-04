Example of usage unit and integration test coverage reports in SonarQube
================================

For publishing jacoco reports to sonarqube setup new profile with your credentials in local ~/.m2/settings.xml file:

    <profile>
      <id>sonar</id>
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
      <properties>
        <sonar.jdbc.url>
          jdbc:mysql://localhost:3306/sonar?useUnicode=true&amp;characterEncoding=utf8
        </sonar.jdbc.url>
        <sonar.jdbc.username>sonar</sonar.jdbc.username>
        <sonar.jdbc.password>sonar</sonar.jdbc.password>
        <sonar.host.url>http://localhost:9000</sonar.host.url>
      </properties>
    </profile>

Run `mvn -Prun-its clean install && mvn sonar:sonar`

Checkout project dashboard in SonarQube