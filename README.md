# spring_data_jpa_with_freemarker

Steps to be followed
1. create a spring starter project
2. edit java version to 1.8 and add maven-jar-plugin-version tag in pom.xml
3. create a html file and change it to .flth 
4. add properties in application.properties file
5. create task and controller class and work with it
6. add data source properties in properties file
7. since h2 is in memory db, the data will be cleared everytime while restarting the application
8. add the following line in properties file
	
		# to load data from data.sql and schema.sql
		spring.jpa.defer-datasource-initialization: true
		
9. add data.sql and schema.sql files in resources
10. run the application you will see the list of records in UI

11. for crud and custom queries follow the tutorial video
