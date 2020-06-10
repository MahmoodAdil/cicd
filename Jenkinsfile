pipeline {
    agent {
        docker { image 'golang'
               }
    }
    stages {
        stage ('Initialize') {
            steps {
                    sh 'go -version'
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
