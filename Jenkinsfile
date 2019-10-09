pipeline {
agent any
 stages{
	stage('Build') {  
      
      steps {               
             bat'make'
              withMaven( maven: 'maven-3.5.0',
                                    mavenSettingsConfig: 'maven-settings-default')
             bat "mvn  compille "
             )
   		     echo 'Building..'           
           }       
      }     
      stage('Test') {          
        steps {       
        	 bat'make check || true'
			// junit '**/target/*.xml' 
            echo 'Testing..'           
           }        
       }       
       stage('Deploy') {    
       	 when{              
	        expression {
	                  //  currentBuild.result != null || currentBuild.result == 'SUCCESS'
	                  currentBuild.result == null || currentBuild.result == 'SUCCESS'
	                 }
	         }         
           steps {     //           
            echo 'Deploying....'
        }  
      }
       stage('My stage') {           
           steps {               
            echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}" 
            echo 'My stage....'           
        }     
    }
      stage('END') {           
           steps {               
            echo 'Built....'           
        }  
      }//
    
    
    
    
  }
}
 

 