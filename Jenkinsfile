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
        stage('My stage') {           
           steps {               
            echo 'Deploying....'           
        }     
      }
 }
 }
 node {stage('Build'){
 	echo 'Building....'
 }stage('Test'){
    echo 'Building....'
 }stage('Deploy'){
    echo 'Deploying....'}
 }
 