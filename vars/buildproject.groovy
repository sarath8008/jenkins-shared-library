def call() {
  echo "this staage will generate artifact"
  sh "mvn clean package"
}
