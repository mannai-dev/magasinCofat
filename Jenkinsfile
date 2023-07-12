pipeline {
    agent any
      stages {
      	stage("getting code from SCM") {
	    steps {
        	script {
            	checkout([
                $class: 'GitSCM',
                branches: [[name: '*/master']],
                extensions: [],
                userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/mannai-dev/magasinCofat.git']]
            	])
        	}
    		}
	}    
       	stage("cleaning code") {
            steps {
                script {
                   sh 'mvn -B -DskipTests clean '
                }
            }
        }
        stage("building") {
            steps {
                script {
                   sh 'mvn -B -DskipTests clean package'
                }
            }
        }
         stage("testing") {
            steps {
                script {
                   sh 'mvn test'
                }
            }
        }
	 stage("code QualityCheck Sonar") {
            steps {
                script {
             sh " mvn sonar:sonar -Dsonar.projectKey=spring -Dsonar.host.url=http://localhost:9000   -Dsonar.login=c69bc11587eb3c42a96ef8464377a1dfdb7ee733"
	               }
            }
        }
   
/*
  stage("DEPLOY") {
            steps {
		   sh "mvn clean install deploy:deploy-file -DskipTests -DgroupId=com.cofat -DartifactId=MagasinCofat -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/MagasinCofat-1.0.jar"
	    }
        }
*/	
               stage("building docker image") {
            steps {
                script {
                   sh 'docker build -t mannai3/pfe:spring -f  /var/lib/jenkins/workspace/Backend/Dockerfile-backend  .'
                }
            }
        }


        stage("push to docker hub") {
             steps {
                 script {
                    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh 'docker push mannai3/pfe:spring'

                    }
                 }
             }
         }
        /*
	      stage("deploy with docker-compose ") {
            steps {
                script {
                  sh 'docker compose up -d '
                }
            }
        }
        */
    }
}
