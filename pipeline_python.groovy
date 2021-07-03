def exampleModule = load "./main.py"
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
            String age_name = exampleModule.test("Igor")
            println(age_name)
            }
        }
    }
}