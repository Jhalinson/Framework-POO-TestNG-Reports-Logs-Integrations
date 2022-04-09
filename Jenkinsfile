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
                sh 'mvn clean'
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
