pipeline {
    agent any
    agent { docker { image 'maven:3.3.3' } }
    stages {
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
