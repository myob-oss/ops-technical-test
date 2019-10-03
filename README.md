Myob Platform Enablement test


Getting Started
Created a java application using spring boot frame work.
why springboot?
>Spring Boot is a technology that will set up much of this configuration automatically
 helping you get your project up and running as quickly as possible.
>application uses intelligent defaults based on the classpath and the application context.
Application components include simple response code, health status response, metadata and info of the application.
Maven is used to build the application into a jar file.

Prerequisites

Git and Jenkins accounts.
I have used an Aws Ec2 instance to install jenkins and configured jenkins with necessary plugins.
Java 1.8 and above.

Git 


Once Application and functionaltest code is wiritten, it is pushed in to git repositories with the url https://github.com/krisinampudi/Myobtest.git. 
https://github.com/krisinampudi/myobfunctionaltest.git
I have used an Aws Ec2 instance to install jenkins and configured jenkins with necessary plugins.
Application components include simple response code, health status response, metadata and info of the application.


Jenkins pipeline

A pipeline is created and components of the pipeline are as follows
>  Stage1: conected to git hub repository using url https://github.com/krisinampudi/Myobtest.git.
>Stage2: Maven is used to build and application and an jar artifactory is created.
> Stage3: Articatory if moved to specific directory and comand is executed to run the jar file.
>tage4: this stage sends a notification of the status of the pipeline.

FunctionalTest Job


A test job is created and is triggered when the initial job Myobtest pipeline is executed.

Deployment

MyobTestApp deployed into Tomcat server.
A ec2 instance with java, jenkins is used to deploy the jar file.
snce the application is running on ec2 instance I am proving the url and response codes of the urls
Deployment is done in the third stage of the pipeline once the build is created artifact is moved to a directory from where the jat file is executed.
Deployment url's and output of the deployment are as follows
> http://3.91.20.115:8090/hello
 Hello Myob world

>http://3.91.20.115:8090/info 
{"app":{"description":"pre-interview technical test","name":"Spring Test Application","version":"1.0.0"},
"build":{"version":"0.0.1","artifact":"demo","name":"MYOB","time":"2019-10-02T01:35:03.838","group":"com.example"}}

http://3.91.20.115:8090/metadata
{"Group":"com.example","Version":"0.0.1","Time":"null","Artifact":"demo","Name":"MYOB"}

http://3.91.20.115:8090/response
{"status":"UP","Error Code":200}

Thanks for going through the Myob platform Enablement test.
