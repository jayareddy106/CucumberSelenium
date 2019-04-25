$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/TestMeCaseStudy1.feature");
formatter.feature({
  "name": "TestMe Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestMe Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of TestMe",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberCaseStudy1.url_of_TestMe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the data for Login",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberCaseStudy1.user_enter_the_data_for_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberCaseStudy1.user_Login_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TestMe AddCart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "AddCart page",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberCaseStudy1.addcart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for AddProduct",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberCaseStudy1.user_enters_the_data_for_AddProduct()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat skeleton.CucumberCaseStudy1.user_enters_the_data_for_AddProduct(CucumberCaseStudy1.java:56)\r\n\tat ✽.user enters the data for AddProduct(file:src/test/resources/skeleton/TestMeCaseStudy1.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user get product successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberCaseStudy1.user_get_product_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});