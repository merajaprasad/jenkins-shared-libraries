def call() {
  dependencyCheck additionalArguments: '--scan ./ --format XML', odcInstallation: 'DP-Check'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
