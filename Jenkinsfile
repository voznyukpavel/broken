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
            echo 'My stage....'           
        }     
      }
 }
  node {
 stage('Build'){
 	 echo 'Building....'
 }stage('Test'){
     echo 'Testing....'
 }stage('Deploy'){
     echo 'Deploying....'
     }
 }
 }
 

 