pipeline {
    agent any
    tools {
	    maven "Maven"
	    jdk "JDK17"
	}
    stages{
        stage('Fetch code') {
          steps{
              git branch: 'main', url:'https://github.com/mahdi-ardani/Hello-world-java.git'
          }  
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
            post {
                success {
                    echo "Now Archiving."
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
        stage('Test'){
            steps {
                sh 'mvn test'
            }

        }

        stage('Checkstyle Analysis'){
            steps {
                sh 'mvn checkstyle:checkstyle'
            }
        }
