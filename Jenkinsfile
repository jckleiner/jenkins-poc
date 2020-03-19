
def scmUrl = 'https://github.com/jckleiner/jenkins-poc.git'

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

// If you want Jenkins to build a local repo, just give the local git project path, with file protocol
// file:///Users/kleiner/develop/eclipse-workspace/jenkins-poc

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