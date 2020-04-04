$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resource/Features/Launch.feature");
formatter.feature({
  "line": 1,
  "name": "Check launching the application.",
  "description": "",
  "id": "check-launching-the-application.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check the application launches successfully",
  "description": "",
  "id": "check-launching-the-application.;check-the-application-launches-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select the Consultancy link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I will be on the Consultancy page",
  "keyword": "Then "
});
formatter.match({
  "location": "Launch.i_launch_the_application()"
});
formatter.result({
  "duration": 3346941947,
  "status": "passed"
});
formatter.match({
  "location": "Launch.i_select_the_Consultancy_link()"
});
formatter.result({
  "duration": 28621533,
  "error_message": "java.lang.NullPointerException\n\tat com.qa.exactest.pages.HomePage.selectConsultancyLink(HomePage.java:47)\n\tat StepDefinitions.Launch.i_select_the_Consultancy_link(Launch.java:32)\n\tat ✽.When I select the Consultancy link(src/main/resource/Features/Launch.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Launch.i_will_be_on_the_Consultancy_page()"
});
formatter.result({
  "status": "skipped"
});
});