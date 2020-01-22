pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            sh "mvn clean package"

         }
         post {
            success {
               archiveArtifacts 'target/*.war'
            }
         }
      }
   }
}