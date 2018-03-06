$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Exisiting NewTour user should be able to login into account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6604478369,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log into account with correct details",
  "description": "",
  "id": "login-into-account;log-into-account-with-correct-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to NewTour Travel and Tour",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_NewTour_Travel_and_Tour()"
});
formatter.result({
  "duration": 1668495843,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 3405335309,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 95090832,
  "status": "passed"
});
formatter.after({
  "duration": 4418904713,
  "status": "passed"
});
});