node {
    def WORKSPACE = "/var/lib/jenkins/workspace/spring-boot-jenkins-deploy"
    def dockerImageTag = "spring-boot-jenkins-deploy:${env.BUILD_NUMBER}"

    try {
        stage ("Docker") {
            sh "docker ps -a"
        }

    } catch(e) {
        throw e
    }
}