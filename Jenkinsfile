stage 'build'
    node {
        git branch: 'develop', credentialsId: 'rq_github', url: 'https://github.com/kontakte/playService.git'
        def mvnHome = tool 'M3'
        sh "${mvnHome}/bin/mvn package"

        def gitCommit = sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
        //echo gitCommit

        writeFile file: 'SHA1', text: gitCommit
        stash includes: 'SHA1', name: 'SHA1'

        archiveArtifacts artifacts: '**/target/*.war'

        junit '**/target/surefire-reports/TEST-*.xml'

    }