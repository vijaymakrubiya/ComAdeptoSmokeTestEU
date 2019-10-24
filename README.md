## Techinical notes:
● This project is developed using IntelliJ IDEA IDE

● JAVA Programmin langauge used in this project

● Junit used for to assert the scenario end result

● Feature file written in cucumber gherkin language

● Apache Maven automation tool used for projects build, dependency and documentation for POM model

# ComAdeptoSmokeTestEU
This project is about creating account and build work profile for the employees on the https://smoketesteu.adepto.com

I need some more clarification on requirement for the functionality to drawout the acceptance criteria. All the acceptance criteria are based on my best assumptions and knowledge.

## Requirement
###### **Task 1.** Exploratory testing - please complete the signup process and document all issues/bugs.

###### ** Answer**
###### Issue 1 : Broken image on the homepage and sign up and login page. 
- Bug ID : SignUp01
- Bug description : broken image on the sign up/login page. 
- Expected Result: Image on the right side on top of the welcome message, should fully load as the page load finish.
- Actual Result : Broken Image on homepage and sign up page and login page 
- Status : assigned 
- Raised By : Vijay Makrubiya
- Assign To : 
- Raised Date :24.10.19
- ScreenShots : attached to email, file name is relevant to BUG ID  
- Environment : Google Chrome version 77, Windows 10. 

###### Issue 2 : Password field on the sign up form is accepting only letters without mixer of symbols, number and special characters and I assume that It should not.
- Bug ID : SignUp02
- Bug description : Password field allow to create password with letters only without any symbol or numbers
- Expected Result: should not allowed to create password with letters only 
- Actual Result : It does allow to creat password with letters only 
- Status : assigned 
- Raised By : Vijay Makrubiya
- Assign To :
- Raised Date : 24.10.19
- ScreenShots :
- Environment : Google Chrome version 77, Windows 10. 

###### Issue 3 : When user skip to upload the CV on the build your profile page then CV Upload step showing mark as done without CV upload. It  should show as an outstanding task.
- Bug ID : SignUp03
- Bug description : I assume that it should not showing marked as CV uploaded when we either skip page or click next to work experience 
- Expected Result: CV upload step should be ticked mark only after CV uploaded fully
- Actual Result :  CV upload step ticked mark without CV upload
- Status : assigned 
- Raised By : Vijay Makrubiya
- Assign To :
- Raised Date : 24.10.19
- ScreenShots :
- Environment : Google Chrome version 77, Windows 10.

###### Issue 4 : Previous experience start date field is accepting the future date. 
- Bug ID : SignUp04
- Bug description : previous experience start date field is accepting the future date where I assume start date should not accept future date.
- Expected Result: previous experience start date should show an error when user enter future date
- Actual Result : previous experience start date does not show an error when user enter future date 
- Status : assigned 
- Raised By : Vijay Makrubiya
- Assign To :
- Raised Date : 24.10.19
- ScreenShots :attached to email, file name is relevant to BUG ID
- Environment : Google Chrome version 77, Windows 10.

###### Issue 5 : Work preference “Next Available Date” taking the date value in the past.
- Bug ID : SignUp05
- Bug description : Work Preference availablility should not allowed to select date from past 
- Expected Result: next available date field in work preference should not allow to select date from past 
- Actual Result : next available date field in work preference does allow to select date from past 
- Status : assigned 
- Raised By : Vijay Makrubiya
- Assign To :
- Raised Date : 24.10.19
- ScreenShots :attached to email, file name is relevant to BUG ID
- Environment : Google Chrome version 77, Windows 10.

###### **Task 2.** System testing - write some test cases for the signup forms testing, i.e. the first page to submit the user information to open the ToU page etc.

Written relevant test scenarios in BDD formate using gherkin langauge in cucumber fearture file in this project

###### **Task 3.** Complete an automation script to cover some of the test cases from task 2 .
Preferred language Java but can be any language you are familiar with. Please provide a README about running the automation scripts.

From task 2 have automate 1 test scenario.
Note : User creating account required one time verification code from the personal email ID so its not possible to automate so thats need ot left as manual testing.
