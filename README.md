# scottispower_exercise
<h1>Test exercise for Scottish Power by Joao Oliveira</h1>

<h2>Data</h2>
Data is present in the H2 database. To see the data, run the application and select the following URL:
http://localhost:8080/h2-console/

There is no password, so simply press "Connect". After, enter the following query and press "Run":

SELECT * FROM SMART_READ 

<h2>Testing</h2>
To test the RESTful endpoints, Swagger UI was included. To access Swagger, simply run the application and select the following URL:
http://localhost:8080/swagger-ui.html#

Select the Smart Read Controller and to test each endpoint, simply select it, press the "Try it out" button and insert an account number
