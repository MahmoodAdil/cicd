pipeline {
    agent none
    environment {
       first_path = get_first()
   }
    
    parameters {
        string(name: 'SL_USERNAME', defaultValue: '', description: 'Softlayer username')
        password(name: 'SL_API_KEY', defaultValue: 'SECRET', description: 'Softlayer API key')
        booleanParam(name: 'SL_VIRTUAL_GUEST', defaultValue: false, description: 'Tell to the job when is being run on a VM or a Baremetal. (By default unset means VSI -- Virtual Machine)')
        file(name: 'hostnames.txt', description: 'hostnames file')
    }
    stages {
        stage ('Initialize') {
            steps {
                    agent { label 'master' }
                    echo 'Initializing..'
                    echo "Hello ${params.SL_USERNAME}"
                    echo "Password: ${params.SL_API_KEY}"
                    print(env.first_path)
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
    }
}

def get_first() {
    node('master') {
        return env.PATH.split(':')[0]
    }
}
