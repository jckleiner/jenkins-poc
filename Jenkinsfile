
def scmUrl = 'https://github.com/jckleiner/jenkins-poc.git'

pipeline {
    agent any
    tools {
        maven 'apache-maven-3.0.1' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}


/*
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo '-->Building..'
            }
        }
        stage('Test') {
            steps {
                echo '-->Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo '-->Deploying....'
            }
        }
    }
}
*/