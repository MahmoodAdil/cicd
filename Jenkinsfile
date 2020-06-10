pipeline {
    agent {
        docker { image 'node:7-alpine' }
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
                sh 'mvn --version'
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
