node {
    def WORKSPACE = "/var/lib/jenkins/workspace/spring-boot-jenkins-deploy"
    def dockerImageTag = "spring-boot-jenkins-deploy:${env.BUILD_NUMBER}"

    try {
        stage('Build Project') {
            sh "gradle clea build"
            sh "gradle spring-boot:run"
        }

    } catch(e) {
        throw e
    }
}