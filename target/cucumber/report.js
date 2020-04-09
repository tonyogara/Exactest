$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resource/Features/Launch.feature");
formatter.feature({
  "line": 1,
  "name": "Check launching the application works.",
  "description": "",
  "id": "check-launching-the-application-works.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check the application launches successfully and I can select the \"Consultancy\" page link",
  "description": "",
  "id": "check-launching-the-application-works.;check-the-application-launches-successfully-and-i-can-select-the-\"consultancy\"-page-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select the Consultancy link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I will be on the Consultancy page",
  "keyword": "Then "
});
formatter.match({
  "location": "Launch.i_launch_the_application()"
});
formatter.result({
  "duration": 2605247879,
  "status": "passed"
});
formatter.match({
  "location": "Launch.i_select_the_Consultancy_link()"
});
formatter.result({
  "duration": 520744074,
  "status": "passed"
});
formatter.match({
  "location": "Launch.i_will_be_on_the_Consultancy_page()"
});
formatter.result({
  "duration": 93751832,
  "status": "passed"
});
});