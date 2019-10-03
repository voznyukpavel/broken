pipeline {
agent any
 stages{
	stage('Build') {  
      
      steps {               
             bat'make'
   		     echo 'Building..'           
           }       
      }     
      stage('Test') {          
        steps {             
           echo 'Testing..'           
           }        
       }       
       stage('Deploy') {    
       	 when{              
	        expression {
	                    currentBuild.result != null || currentBuild.result == 'SUCCESS'
	                 }
	         }         
           steps {               
            echo 'Deploying....'           
        }  
      }
       stage('My stage') {           
           steps {               
            bat'make'
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
 

 