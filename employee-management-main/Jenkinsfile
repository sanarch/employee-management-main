
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub'
                sh 'ls -la'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Employee Management Application'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running automated unit tests'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating application JAR'
                sh 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Employee Application CI Pipeline Successful!'
            echo 'Build, Test and Package stages completed successfully.'
        }

        failure {
            echo 'Pipeline Failed! Check Console Output for errors.'
        }

        always {
            echo 'CI Pipeline execution completed.'
        }
    }
}
