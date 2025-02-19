def call(cmd) {
  echo "installin  ${cmd}"
  sh"sudo apt update"
  sh "sudo apt install -y  ${cmd}"
}
