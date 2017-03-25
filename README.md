# 1 - Overview

To Do application built using scaffolding generated by JHipster. The project leverages Spring Boot and Angular 2. 

# 2 - JHipster Installation

The pre-requisites I already had installed included:

* JDK 8
* Gradle 3
* Git
* Node

I leveraged Yarn for installation, so I needed to install it with the following command:

	npm install --global yarn
	
Next, I installed Yeoman with the following command:

	yarn global add yo

Finally, I installed the JHipster generator with the following command:

	yarn global add generator-jhipster
	
One additional note, if a proxy is required it may need to be set up for NPM and Yarn with the following commands:

	npm config set proxy http://username:password@host:port
	npm config set https-proxy http://username:password@host:port
	yarn config set proxy http://username:password@host:port
	yarn config set https-proxy http://username:password@host:port
	
# 3 - JHipster Scaffolding Generation

With JHipster installed, the next step was to run the generator. I followed these steps:

1. Opened a command prompt and created a directory (C:\dev\github-repos\jhipster-angular2-todo-app)
2. Navigated to the new directory
3. Ran the command below:

	yo jhipster
4. I then used the following entries for inputs:

	? (1/15) Which *type* of application would you like to create? Microservice gateway
	? (2/15) What is the base name of your application? ToDoApp
	? (3/15) Would you like to install other generators from the JHipster Marketplace? No
	? (4/15) As you are running in a microservice architecture, on which port would like your server to run? It should be unique to avoid port conflicts. 8080
	? (5/15) What is your default Java package name? com.michaelhoffmantech.jhipster.todoapp
	? (6/15) Which *type* of authentication would you like to use? JWT authentication (stateless, with a token)
	? (7/15) Which Service Discovery and Configuration solution would you like to use? No Service Discovery and Configuration
	? (8/15) Which *type* of database would you like to use? SQL (H2, MySQL, MariaDB, PostgreSQL, Oracle, MSSQL)
	? (9/15) Which *production* database would you like to use? PostgreSQL
	? (10/15) Which *development* database would you like to use? H2 with disk-based persistence
	? (11/15) Do you want to use Hibernate 2nd level cache? No
	? (12/15) Would you like to use Maven or Gradle for building the backend? Gradle
	? (13/15) Which other technologies would you like to use? (Press <space> to select, <a> to toggle all, <i> to inverse selection)
	? (14/15) Which *Framework* would you like to use for the client? [BETA] Angular 2.x
	? (15/15) Would you like to use the LibSass stylesheet preprocessor for your CSS? Yes
	? (16/15) Would you like to enable internationalization support? No
	? (17/15) Besides JUnit and Karma, which testing frameworks would you like to use? Protractor
	
A few notes regarding the selections I made:

* Note I used Microservice Gateway over Microservice Application as this is the selection to use for a UI gateway-based project.
* You are forced to select a database; though, I won't be using one for this as the database interaction would occur in a data service behind an API. 
* There were other technologies that could be selected in step 13, such as Elasticsearch, but I did not choose any at this time. 
* Angular 2 is beta. 

With the installation successfully complete, the Spring Boot app can be run using the following command:

	./gradlew
	
The client can be started with the following command:

	yarn start
	
I ran the gradlew command and was able to open the application at the following location:

	http://localhost:8080
	
# 4 - Eclipse Setup

Importing the project as a Gradle project was simple; however, there was one challenge I encountered. The JSON validator will fail out reading the node_modules directory. When this occurs, it will result in a stack overflow error and crash the workspace. I simply clicked to not close the workspace, right clicked the project, selected properties -> Validation and unchecked JSON validation. 

# 5 - Generated Project Structure

There are several aspects of the project that get generated. I'll focus on each below. 

## 5.1 - JavaScript Assets

### 5.1.1. - Angular CLI JSON file

JHipster generates the file angular-cli.json at the root of the project. I ran the command below to install angular-cli for direct command execution:

	yarn global add @angular/cli
	
By including this file, JHipster gives you the ability to use Angular CLI to perform various scaffolding tasks. This includes creating components, directives, aervices, etc. 

I tried a few examples below.

Command: ng generate component test-component

I ran into several issues, one of them being the difference in CLI versions installed locally and globally. 

This is a link to an issue with environmentSource missing : [https://github.com/valor-software/ng2-dragula/issues/591](https://github.com/valor-software/ng2-dragula/issues/591). 

Here are some helpful commands for cleaning up and restarting:

	npm uninstall -g @angular/cli
	npm cache clean
	npm install -g @angular/cli@latest
	rm -r .\node_modules\
	npm install --save-dev @angular/cli@latest
	npm install


	
## 5.2 - Java Assets


