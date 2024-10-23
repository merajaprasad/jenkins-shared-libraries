def call(String SonarQubeServer, String ProjectName, String ProjectKey) {
  withSonarQubeEnv("${SonarQubeServer}") {
      sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey}'''
  }
}
