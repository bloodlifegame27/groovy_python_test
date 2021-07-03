pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('Setup') {
            steps {
                echo 'Hello world!'
            }
        }
        stage('python') {
            steps {
                sh 'ls ~'
            }
        }
    }
}