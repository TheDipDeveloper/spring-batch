# spring-batch

### MySQL query to create CUSTOMERS_INFO table

CREATE TABLE CUSTOMERS_INFO (
ID VARCHAR(255) PRIMARY KEY,
CUSTOMER_ID VARCHAR(255),
FIRST_NAME VARCHAR(255),
LAST_NAME VARCHAR(255),
COMPANY VARCHAR(255),
CITY VARCHAR(255),
COUNTRY VARCHAR(255),
PHONE_1 VARCHAR(255),
PHONE_2 VARCHAR(255),
EMAIL VARCHAR(255),
SUBSCRIPTION_DATE VARCHAR(255),
WEBSITE VARCHAR(255)
);

### Hit the curl to run batch job
curl --location --request POST 'http://localhost:8080/customer/start'

### Query to verify jobs and steps

SELECT * FROM dipdeveloperdb.customers_info;
SELECT * FROM dipdeveloperdb.batch_job_execution;
SELECT * FROM dipdeveloperdb.batch_step_execution;

