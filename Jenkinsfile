pipeline {
    agent any
    stages {
        stage ('Test unitaire') {
            agent any
            steps {
                sh 'javac HelloWorld.java'
                sh 'java HelloWorld'
            }
        }
    }
}