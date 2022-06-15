# Teksys_java_05
This is the code for Teksys_java_05's capstone project to document user stories and technical challenges

user Stories:
-As a patient, I want to see more information about the medication I'm taking, so that I coul feel safe taking the medications.
-As a Doctor, I want to confirm my knowledge about the medication I'm prescribing, so that I confidently prescribe the medication.
-As a Medical student, I want to study the medication's side effects, main purposes, and other information about the medication, so that I could better
  understand and use the medication for future patients.
  
  
 Technical problems:

1)Wanted the login page to show up before the Home page. Wasn't able to direct it to the login first other than specifically inputting /login as the URL endpoint.
  Solution: Erik helped me with this problem by mapping the endpoint "/" as with the return "login" page, instead of the Homepage mapped with "/". Then changed the th:href="@{/login}" in the login.html page. After changing those endpoints and requestmappings, then changed the HomePage orginially of "/" to "HomePage". Also added "login**" top of the securityconfiguration file.
  
2)After creating SQL tables, everytime a Java to SQL method was used, SQL created a brand new table with lowered case table name from the original table name. Tried to delete, truncate, and recreate the tables, but the same lower case table names pop up.
  Solution: Kevin offered a line of code to try. I inputted the line of code into the application.properties file, just before the server.port=8080, deleted and recreated the tables. Now SQL doesn't create a new lowered case table anymore.
  The line of code:
    spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
    
3)Medication image carousel imported from Bootstrap took more than half of the page. No matter how I resize the image carousels by using "width:" and "height", the images stayed the same, just resizing to its partial size.
  Solution: used the inspect element of the browser, figured out where the image carousel was declared the size. ALthough didn't find where the configurations are for the image carousel. I was able to resize the image carousel by defining the carousel class.
  
4)The navigation buttons of the image carousel was longer than the image carousel itself, took a really long time to figure out where the sizing was, wasn't able to find it. 
   Solution: resized the image carousel by creating, defining, and override the previous classes. Although the image carousel codes are from Bootstrap, I only copied and pasted the image carousel codes to fit the capstone requirement, I didn't copy any of the styling of the image carousel. Unsure of where the oringinal sizing came from without being referred to a CSS file or had inline styling. Even although didn't figure out the source of the iamge carousel sizes, was able to resize by defining and overriding the html class.
   
5) Originally wanted to keep a organized file to keep date-to-date versions of this project, but as a beginner to all coding, and didn't understand how to se github to the fullest, I created many different versions of the same project in both my labtop and github account.
  Solution: The file or repository I created previously was considered the "small" file of a large file. I thought it was the main file of the computer instead. So I created a new repository, and redropped and uploaded the capstone file that way.
  
6)I wanted each columns of the current medication table splitted into four tables to fit the "four tables" requirement. But wasn't able to figure out how when a user add a new medication to the database by using thymeleaf to input into different tables. I searched a lot of different online resources, but none came up other than using a single table to input the user inputs. Then I asked Erik, and Erik mentioned that there is a way to automatecally input all of the user's inputs into different table columns. But doing it this way will be more complicated, as there has to be more controllers, mapping, endpoints, and forms to be created in order to input all the user inputs into different table columns. And that for the capstone, it will not be requireed, but in the future jobs, it will be very beneiftial to learn.
    Solution: So then I remade a new SQL database, this time, to put all the Medication related informations within one table. Then I used the below resources to help me with the CRUD methods and other web server actions.
    https://www.codejava.net/frameworks/spring-boot/spring-boot-thymeleaf-form-handling-tutorial
    https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-web-application-with-jdbc-thymeleaf-oracle
    https://www.javaguides.net/2020/05/spring-boot-crud-web-application-with-thymeleaf.html
    
7)Wasn't able write the title "Hydroncodone & Acetaminophen" as like others where its bold and have a larger font. 
    Solution: decrease the font, and made the font-lighter

8)Wasn't able to write Hydrocodone&Acetaminophen as the title page of the src/java/resources, Eclipse didn't let the & to pass through, kept creating a new file.
    Solution: changed the & to "And".
    
9)Had trouble testing the custom queries of each repository.
    Solution: Erik showed me the SpringFramework Guru's Introduction to Test Driven Development playlist on Youtube, was able to use and follow the examples.
    
 
    
    
    



