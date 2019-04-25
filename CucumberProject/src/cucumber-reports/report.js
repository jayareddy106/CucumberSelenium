$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/cucumber.feature");
formatter.feature({
  "name": "AddCart feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Product AddCart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCart.user_enter_url()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat skeleton.AddCart.user_enter_url(AddCart.java:32)\r\n\tat ✽.user enter url(file:src/test/resources/skeleton/cucumber.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter data for Addcart",
  "keyword": "When "
});
formatter.match({
  "location": "AddCart.user_enter_data_for_Addcart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "product add successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCart.product_add_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});