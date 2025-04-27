pipeline {
    agent any

    environment {
        // Setup environment variables if needed
        SELENIUM_VERSION = '3.141.59'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub repository
                git credentialsId: 'github-token', url: 'https://github.com/devashish0407/selenium-automation.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                // Compile or build the project if necessary
                echo 'Building the project...'
            }
        }

        stage('Test') {
            steps {
                // Run your Selenium tests (make sure you have Maven/Gradle configured)
                echo 'Running Selenium tests...'
                
            }
        }

        stage('Post-Test') {
            steps {
                // Post-test actions, such as generating reports or archiving test results
                echo 'Post-test actions...'
                sh 'cp target/extent-report.html /var/www/html/extent-report.html'
            }
        }
    }

    post {
        always {
            // Send email or notifications
            echo 'Sending email notifications...'
            // Use `junit` for test result reporting or configure a plugin
            // junit '**/target/test-*.xml'
        }
    }
}
