pipeline {
    agent {
        docker { image 'node:7-alpine' }
        docker { image 'golang' }
    }
    stages {
        stage ('Initialize') {
            steps {
                    sh 'node --version'
            }
        }
        stage('Build') {
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
