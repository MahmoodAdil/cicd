pipeline {
    agent {
        docker { image 'node:7-alpine'
               }
    }
    stages {
        stage ('Initialize') {
            steps {
                    sh 'node --version'
            }
        }
        stage('Build') {
            agent { docker { image 'golang' } }
            steps {
                echo 'Building..'
                sh 'go -version'
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
