# REST Web Service implementation using Jersey(IntelliJ IDEA)
Eclipse Jersey is a REST framework that provides a JAX-RS (JSR-370) implementation


## Jersey Overview
Developing RESTful Web services that seamlessly support exposing your data in a variety of representation media types and abstract away the low-level details of the client-server communication is not an easy task without a good toolkit. In order to simplify development of RESTful Web services and their clients in Java, a standard and portable JAX-RS API has been designed. Jersey RESTful Web Services framework is open source, production quality, framework for developing RESTful Web Services in Java that provides support for JAX-RS APIs and serves as a JAX-RS (JSR 311 & JSR 339) Reference Implementation.


## Setting Up Application Server(Apache Tomcat)

Before going to configure Tomcat Server on your system donwload latest version of it and extract files from. [Click here to donwload latest version of Tomcat 9.0.x](http://mirrors.estointernet.in/apache/tomcat/tomcat-9/v9.0.27/bin/apache-tomcat-9.0.27.tar.gz)

**Go To IntelliJ Welcome screen and click On Configure**

1. Open the Settings/Preferences dialog Ctrl+Alt+S
2. In the left-hand pane, in the Build, Execution, Deployment category, select Application Servers.
3. Select the server that you are going to use( Choose Tomcat Server for now).
4. Put the path of tomcat server installation directory under Tomcat_Home or just browse to select it.



## Creating a Maven Project

1. Click Create New Project on the Welcome screen. Otherwise, select File | New | Project from the main menu.
2. Select Maven from the options on the left.
3. Click on Create from archetype and then choose jersey.quickstart.webapp for this project and click Next.</br>
if you don't find  jersey.quickstart.webapp then add this by clicking add archetype.
and put 
    ```
    GroupId : org.glassfish.jersey.archetypes
    ArtifactId : jersey-quickstart-webapp
    Version : 2.16
    ```
Click Ok. 
4. Provide GroupId,ArtifactId for your project and click Next and then if you want to change project directory then change it and click Finish.


**Build Application**

Go to terminal by clicking terminal option in intelliJ
```
mvn clean install
```


### Creating a run/debug configuration

1. Open the Run/Debug Configurations dialog (for example, Run | Edit Configurations).
2. Click + , select the server of interest (for example, Tomcat Server) and, if available, select Local
3. Choose the Deployment tab, clicking “+”, and choosing Artifact…
4. Select Artifact listed then choose Apply and finally OK.


**Run Application**






