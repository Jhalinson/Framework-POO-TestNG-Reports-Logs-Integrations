pipeline{
  agent any
    stages{
      stage("clean"){
        steps{
            echo 'Run clean tests here...'
           sh 'mvn clean'
    }
    stages{
      stage("build"){
        steps{
          echo 'Run BUILD tests here...'
                     sh 'mvn compile'
    }
    stages{
      stage("test"){
        steps{
          
          echo 'Run TEST OR INSTALL tests here...'
                     sh 'mvn install'
    }
  
  }
}
}


