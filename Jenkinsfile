node {
    def WORKSPACE = "/var/lib/jenkins/workspace/spring-boot-jenkins-deploy"
    def dockerImageTag = "spring-boot-jenkins-deploy:${env.BUILD_NUMBER}"

    try {

        stage('Clone Repo') {
            git url: 'https://github.com/justrehimov/spring-jenkins-deploy-test-project.git'
            credentialsId: 'justrehimov'
            branch: 'master'
        }

        stage('Build Docker') {
            dockerImage = docker.build("spring-boot-jenkins-deploy:${env.BUILD_NUMBER}")
        }

        stage('Deploy Docker') {
            echo "Docker Image Tag Name: ${dockerImageTag}"

            sh "docker stop spring-boot-jenkins-deploy || true && docker rm spring-boot-jenkins-deploy || true"

            sh "docker run --name spring-boot-jenkins-deploy -d -p 5000:8080 spring-boot-jenkins-deploy: ${env.BUILD_NUMBER}"
        }

    } catch(e) {
        throw e
    }


}