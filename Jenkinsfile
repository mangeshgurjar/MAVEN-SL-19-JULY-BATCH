pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipeline'
			}
		}
		
		stage('Clean Stage')
		{
			steps
			{
				bat 'mvn clean'
			}
		}
		stage('Build Stage')
		{
			steps
			{
				bat 'mvn package'
			}
		}		
		
		stage('Build Success')
		{
			steps
			{
				echo 'Build successful'
			}
		}
		
	}
}	
