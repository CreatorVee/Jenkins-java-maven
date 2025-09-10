pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    echo "Executing pipeline for branch: ${env.BRANCH_NAME}"
                }
            }
        }

        stage('Build') {
            when {
                expression { env.BRANCH_NAME == 'master' }
            }
            steps {
                script {
                    echo "Building the application..."
                }
            }
        }

        stage('Deploy') {
            when {
                expression { env.BRANCH_NAME == 'master' }
            }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}
