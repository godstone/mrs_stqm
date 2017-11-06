pipeline {
    agent any
    tools {
        maven 'maven 3.3.3'
        jdk 'jdk8'
    }

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