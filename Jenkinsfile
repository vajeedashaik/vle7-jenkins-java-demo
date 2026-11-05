pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'java -version'
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

        stage('Docker Build') {
            steps {
                sh 'docker build -t vle7-jenkins-java-demo:${BUILD_NUMBER} -t vle7-jenkins-java-demo:latest .'
            }
        }

        stage('Docker Run') {
            steps {
                sh 'docker run --rm vle7-jenkins-java-demo:${BUILD_NUMBER}'
            }
        }
    }

    post {
        success {
            echo 'Java Maven CI/CD pipeline completed successfully!'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        always {
            junit testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true
        }
    }
}
