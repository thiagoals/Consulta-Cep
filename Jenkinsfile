pipeline{
	agent any
	stages {
		stage ('Logger'){
			steps{
				echo '---- CEP API ----'
			}
		}
		stage ('Clone Github Project') {
		    steps{
		        echo 'Clone Github Project'
		        sh 'if [ ! -d "Consulta-Cep" ]; then git clone https://github.com/thiagoals/Consulta-Cep.git; fi'
		        sh 'cd Consulta-Cep && git pull'
		    }
		}
		stage ('Docker compose'){
			steps{
				sh 'cd Consulta-Cep && docker compose up -d'
			}
		}
	}
}
