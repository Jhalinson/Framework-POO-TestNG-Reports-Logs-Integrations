pipeline {
    agent any
    tools {     
        jdk 'JDK 16' 
        maven 'apache-maven'   
    }
    stages {
        stage('Build') {
            steps {
              
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
                   sh "pwd"
                
                dir("MyStore") {
    sh "pwd"
}
//                 sh """
//                 ls -al
//             """
                   sh "pwd"
//                 sh """ls"""
                
//                    sh "pwd"
           
//                 sh "cd /Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main/MyStore"
               
//                  sh "pwd"
//                   cd /Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main
                
                
//                 sh "pwd"
//                  sh '/Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main/Framework-POO-TestNG-Reports-Logs-Integrations/MyStore'
//                 sh "pwd"
//                 dir ()
                echo 'Before cleaning script'
//                 sh 'mvn clean'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
