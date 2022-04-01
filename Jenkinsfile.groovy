pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('Hello 2') {
            steps {
                sh """
			hostname
			mkdir sachin123
                """
            }
        }
	
	stage('Hello 3') {
	    steps {
		echo ' testing stage3 '
		sh """
			pwd
			ls -l sachin123
			

		"""
            }
	}
    }
}
