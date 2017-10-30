pipeline {
    agent any

    stages {
        stage('Stage1') {
            steps {
                checkout scm
            }
        }
        stage('Stage2') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}