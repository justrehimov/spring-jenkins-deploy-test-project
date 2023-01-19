node {
    def WORKSPACE = "/var/lib/jenkins/workspace/spring-boot-jenkins-deploy"
    def dockerImageTag = "spring-boot-jenkins-deploy:${env.BUILD_NUMBER}"

    try {

        stage('Initialize'){
                 def dockerHome = tool 'dockerJenkins'
                 env.PATH = "${dockerHome}/bin:${env.PATH}"
             }

        stage('Clone Repo') {
            git url: 'https://github.com/justrehimov/spring-jenkins-deploy-test-project.git'
            credentialsId: 'justrehimov'
            branch: 'master'
        }

        stage('Build Docker') {
            sh "docker images"
            sh "ls"
            sh "docker build -t desofme/spring-boot-jenkins-deploy"
        }

    } catch(e) {
        throw e
    }


}