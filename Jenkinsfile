pipeline {
    
    agent {
        docker { image 'node:7-alpine' }
    }

    stages {
        stage ('Initialize') {
            steps {
                    echo 'node version checking..'
                    sh 'node --version'
            }
        }
        stage('Build') {
            steps {
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
