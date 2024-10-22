def call(String DockerUsr, String ProjectName, String ImageTag) {
  sh "docker build -t ${DockerUsr}/${ProjectName}:${ImageTag} ."
}
