# Tech242 MFlix API

## Project Outline
This is a proof of concept project.

The product owner wants to explore the possibility of having a MongoDB and cloud-based solution for accessing information about movies, allowing users to post or read comments on movies and managing a film schedule for cinemas.
A sample database (sample_mflix) is provided which includes details of movies, comments, "theaters" and users.
The product owner would like a RESTful API which allows full CRUD access to the existing data for these 4 collections

## Launching
The application can be run using mvn spring-boot:start or by simple clicking the Run server button on Intellij. The project will by default run on http://localhost:8080 for local machines.

## API Definition
To access the full API documentation, simply head over to http://localhost:8080/swagger-ui/index.html#/ , where all endpoints as well as usage consumption will be defined. The high level summary will be posted here for convenience.

### Summary:
An open API developed by Tech 242 to allow users to access MongoDB's sample MFlix database. Currently, the system allows access to the movies, embedded movies, users, theaters and comments collection. Any users can create or read data, but an API key is needed to update or delete records. Keys should be placed under a header labeled 'key'. A key can be retrieved from the Key API listed below.

### Consumption Guidelines:
To effectively use our open API, we recommend carefully choosing parameters for given queries, as queries with larger results will typically tend to take longer to return. Some get operations can perform subsequent gets faster given that there is no Create, Update or Deletes to a collection - it is recommended to batch Create, Updates or Deletes consecutively as to reduce possible downtime for Get Requests. Sample request bodies can be found below under the Schema heading.

### Additional information:
Currently, we are under the base URL of http://localhost:8080. </br>
Please contact akhairuddin@spartaglobal.com for any further queries or information regarding Tech242 MFlix API

## Required Technologies
* The persistence mechanism must be MongoDB
* The database must be hosted on MongoDB Atlas using the "Shared" (free) tier hosted on AWS
* The database must be based on the sample_mflix database, which is provided for use within MongoDB - this tutorial explains how to install the sample
* Spring Boot must be used for the API
* Spring Data MongoDB must be used for accessing the database from both the API and the Web application
* The code repository for the project must be hosted on GitHub

## Testing
* The API itself should be internally tested using unit testing
* The API Testing framework should make use of good modeling (Connection, Injection and DTOs)
* The API Framework should also be internally tested
* Where possible, Code coverage should be reported on
* Consider using mocking when internally testing the RESTful API

### Jacoco Report
Jacoco report will also be automatically installed as a result of the pom.xml definition. This test report can be generated using mvn clean test followed by jacoco:generate-report. The report will then be produced inside the target folder, under a subfolder labelled sites.
