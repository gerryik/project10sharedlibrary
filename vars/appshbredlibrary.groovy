def call(String repoURL) {
pipeline{
  agent any
  tools {
     maven 'maven'
  }
  stages{
    stage('Parallel stage'){
      parallel{     
        stage('Gerald Agbonye'){
          steps{
            sh '/var/lib/jenkins/script/project9grp5q1scrpit.sh'
            sh 'mvn --version'
            git branch: 'main',
              url: "${repoURL}"
          }
        }
        stage('Pretei Lemo'){
          steps{
            sh '/var/lib/jenkins/script/lemorscript.sh'
          }
        }
   stage('Pere'){
       steps{
            echo "TODO"
        }
    }
    stage('Odile Domingo'){
       steps{
           sh '/var/lib/jenkins/script/odilescript.sh'
         }
     }
        stage("Henry Forson") {
           steps {
               echo "TODO"
            }
          }
        }
     }
   }
}

}
