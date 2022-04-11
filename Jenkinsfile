


pipeline {
  agent any
  stages {
    stage('Execute Selenium Tests from Github Repo Using Jenkins 2.0 Pipeline') {
      steps {
        echo 'Execute Tests'
        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
        echo "Jenkins Workspace ${env.WORKSPACE}"
        sh "mvn -f MyStore clean"
        sh "mvn -f MyStore test -P testng"
      }
    } 
  }
}
/*pipeline {
    agent {
        any {
            image 'maven:3.8.5-openjdk-17'
            label 'docker'
        
        }
    }
    
    stages {
        
        stage('Build') {
            
            steps {
                
                echo "WorkSpace {$WORKSPACE}"
//                 echo "Build  {BUILD_ID}"
                dir("${env.WORKSPACE}/MyStore") 
                        {
                            echo 'Running in Mystore after seetting dir up'
                                sh "pwd"
                             sh 'mvn -version'
                    sh 'mvn clean'
                            
                    sh 'mvn compile'

                          }
              
//                 sh '''
//                     echo "PATH = ${PATH}"
//                     echo "M2_HOME = ${M2_HOME}"
//                 ''' 
                   sh "pwd"*/
                                                    
            
               
//                 sh 'mvn clean'
//                 sh """
//                 ls -al
//             """
//                 sh """ls"""
                
//                    sh "pwd"
           
//                 sh "cd /Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main/MyStore"
               
//                  sh "pwd"
//                   cd /Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main
                
                
//                 sh "pwd"
//                  sh '/Users/jhalinsonacosta/.jenkins/workspace/my-seleniumproject-pipeline_main/Framework-POO-TestNG-Reports-Logs-Integrations/MyStore'
//                 sh "pwd"
//                 dir ()
                
//                 sh '''
//                 ls -al
//                 '''
               /* sh 'pwd'
                echo 'Before cleaning script'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                dir("MyStore"){
                sh "pwd"

                    
                    sh 'mvn clean install'
                
                }
               
                          
                echo 'Testing..'
                
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}*/
