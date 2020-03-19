
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

// If you want Jenkins to build a local repo, just give the local git project path, with file protocol
// file:///Users/kleiner/develop/eclipse-workspace/jenkins-poc
// BUT... This way you still have to commit your changes locally so jenkins can see them

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