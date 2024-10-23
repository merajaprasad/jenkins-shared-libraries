def call(String DockerUsr, String ProjectName, ImageTag) {
  sh "trivy image --format table -o image.html ${DockerUsr}/${ProjectName}:${ImageTag}"
}
