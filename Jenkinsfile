pipeline{
  agent any
    stages{
      stage("clean"){
        steps{
             sh 'mvn clean'
            echo 'Run clean tests here...'
    }
    stages{
      stage("build"){
        steps{
          echo 'Run BUILD tests here...'
    }
    stages{
      stage("test"){
        steps{
          sh 'mvn install'
          echo 'Run TEST OR INSTALL tests here...'
    }
  
  }
}
}


