
def scmUrl = 'https://github.com/jckleiner/jenkins-poc.git'

pipeline {
    agent any
    tools {
        maven 'Maven 3.5.3'
        jdk 'JDK-11.0.1 (OpenJDK)'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install --fail-at-end'
                // Only needed for adesso Jenkins
                //stash name:'build', useDefaultExcludes: false
            }
//            post {
//                success {
//                    junit '**/target/surefire-reports/**/*.xml'
//                }
//                unstable {
//                    script{
//                           error "Build contained failed tests"
//                    }
//                }
//            }
        }
/*
        stage('Sonar analysis') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
*/
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