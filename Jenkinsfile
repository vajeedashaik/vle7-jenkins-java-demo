pipeline {
    agent any

    tools {
        jdk 'Java21'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn -B package'
            }
        }
    }

    post {
        success {
            echo 'Java Maven CI pipeline completed successfully!'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
