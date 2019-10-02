pipeline {
agent any
 stages{
	stage('Build') {          
      steps {               
   		  echo 'Building..'           
           }       
      }     
      stage('Test') {          
        steps {             
           echo 'Testing..'           
           }        
       }       
       stage('Deploy') {           
           steps {               
            echo 'Deploying....'           
        }  
      }
       stage('My stage') {           
           steps {               
            bat'My stage batting'
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
 

 