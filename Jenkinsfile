pipeline {
agent any
 stages{
	stage('Build') {  
      
      steps {               
          //   bat'make'
             bat "mvn -f C:/Users/Pavel/git/broken/com.vogella.dnd.jface1/pom.xml install -Dstyle.color=always"
   		     echo 'Building..'           
           }       
      }     //
      stage('Test') {          
        steps {       //
        	// bat'make check || true'
			//// junit '**/target/*.xml' 
            echo 'Testing..'           
           }        
       }       
       stage('Deploy') {    
       	 when{              
	        expression {
	                  // currentBuild.result != null || currentBuild.result == 'SUCCESS'
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
    }
  }
}
 

 
