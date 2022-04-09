pipeline {
    agent any
    tools {     
        jdk 'JDK 16' 
        maven 'apache-maven'   
    }
     
    stages {
        
        stage('Build') {
            
            steps {
                dir("${env.WORKSPACE}/MyStore") 
                        {
                            echo 'Running in Mystore after seetting dir up'
                                sh "pwd"
                    sh 'mvn clean'
                            
                    sh 'mvn compile'

                          }
              
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
                   sh "pwd"
                                                    
            
               
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
                sh 'pwd'
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
}
