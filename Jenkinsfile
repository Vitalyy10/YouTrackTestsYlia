pipeline {
    agent any

        tools {
            maven 'Maven-3.9.14'   // имя из Global Tool Configuration
            jdk 'Java17'           // если нужно
        }

    stages {

//         stage('Checkout') {
//             steps {
//                 git 'https://github.com/USERNAME/REPOSITORY.git'
//             }
//         }

        stage('Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            allure results: [[path: 'target/allure-results']]
        }
    }
}