pipeline {
    agent any
    stages {
        stage('Setup') {
            steps {
                echo 'Hello world!'
            }
        }
        stage('python') {
            steps {
                sh 'python --version'
            }
        }
    }
}