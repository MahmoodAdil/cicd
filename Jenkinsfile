pipeline {
    agent any
    parameters {
        string(name: 'SL_USERNAME', defaultValue: '', description: 'Softlayer username')
        password(name: 'SL_API_KEY', defaultValue: 'SECRET', description: 'Softlayer API key')
        booleanParam(name: 'SL_VIRTUAL_GUEST', defaultValue: false, description: 'Tell to the job when is being run on a VM or a Baremetal. (By default unset means VSI -- Virtual Machine)')
        file(name: 'userFlag', description: 'What environment?')
    }
    stages {
        stage('Example') {
            steps {
                echo "Hello ${params.SL_USERNAME}"
                echo "Password: ${params.SL_API_KEY}"
                echo "hostnames: ${params.userFlag}"
            }
        }
    }
}
