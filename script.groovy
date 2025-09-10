def buildJar() {
    echo 'building the application...'
    sh 'mvn package'
}

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t vinny100/demo-app:jma-4.3 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push vinny100/demo-app:jma-4.3'
    }
}

def deployApp() {
    echo 'deploying the application...'
}

return this
