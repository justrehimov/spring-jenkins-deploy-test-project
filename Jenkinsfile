node {
    def WORKSPACE = "/var/lib/jenkins/workspace/spring-boot-jenkins-deploy"
    def dockerImageTag = "spring-boot-jenkins-deploy:${env.BUILD_NUMBER}"

    try {
        stage ("Add gradle") {
            sh "git clone https://github.com/gradle/gradle-site-plugin.git"
            sh "cd gradle-site-plugin"
            sh "./gradlew build"
        }

        stage('Build Project') {
            sh "gradle clean build"
            sh "gradle spring-boot:run"
        }

    } catch(e) {
        throw e
    }
}