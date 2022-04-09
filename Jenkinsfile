pipeline{
  
      tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
  agent any
    stage{
      stage("clean"){
        dir("/var/lib/jenkins/workspace/Framework-POO-TestNG-Reports-Logs-Integrations") 
        steps{
             sh 'mvn clean'
            echo 'Run clean tests here...'
    }
    stage{
      stage("build"){
        steps{
          echo 'Run BUILD tests here...'
    }
    stage{
      stage("test"){
        steps{
          sh 'mvn install'
          echo 'Run TEST OR INSTALL tests here...'
    }
  
  }
}
}


