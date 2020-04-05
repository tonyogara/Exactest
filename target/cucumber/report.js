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
  "duration": 2984463938,
  "status": "passed"
});
formatter.match({
  "location": "Launch.i_select_the_Consultancy_link()"
});
formatter.result({
  "duration": 548670678,
  "status": "passed"
});
formatter.match({
  "location": "Launch.i_will_be_on_the_Consultancy_page()"
});
formatter.result({
  "duration": 467942,
  "status": "passed"
});
});