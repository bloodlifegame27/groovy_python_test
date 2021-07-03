
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
                def exampleModule = load "./main.py"
                def age_name = exampleModule.test("Igor")
                println(age_name)
            }
        }
    }
}