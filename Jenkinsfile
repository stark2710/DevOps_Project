pipeline
{
  agent any
  
  stages
  {
    stage('Build')
    {
      steps
      {
        sh 'mvn clean install'
      }
    }
    stage('Test')
    {
      steps
      {
        echo 'Hello pipeline Testing started'
      }
    }
    stage('Deploy')
    {
      steps
      {
        echo 'Hello pipeline Deploying started'
      }
    }
  }
}
