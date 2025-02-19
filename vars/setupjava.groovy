def call() {
  echo "installin java 17"
  sh"sudo apt update"
  sh "sudo apt install -y openjdk-17-jdk"
}
