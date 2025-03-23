pipeline {
    agent any
    tools {
	    maven "Maven"
	    jdk "JDK11"
	}
    stages{
        stage('Fetch code') {
          steps{
              git branch: 'main', url:'https://github.com/mahdi-ardani/Hello-world-java.git'
          }  
        }

        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
    }          
}    
