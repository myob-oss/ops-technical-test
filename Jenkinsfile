
properties([
	[$class: 'CopyArtifactPermissionProperty', projectNames: '*'],
	[$class: 'jenkins.model.BuildDiscarderProperty', strategy: [$class: 'LogRotator',
                                                                                numToKeepStr: '5',
                                                                                artifactNumToKeepStr: '5']]
])

node('master') {
    stage('Checkout') {
    	checkout scm
    }
    stage('Code Scan') {
    	//code scan
    }
    stage('Run Build') {
    	sh "${mvnCMD} clean package"
    }
    stage('Build Image') {
    	sh "docker build . -t myob"
    }
    stage('Push Image') {
    	//Pushing to ECR
    }
}