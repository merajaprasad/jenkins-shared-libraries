def call() {
  sh "trivy image --format table -o image.html ${DOCKER_USR}/demoimage:latest"
}
