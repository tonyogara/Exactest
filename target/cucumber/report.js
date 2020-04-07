$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resource/Features/Contact_Us.feature");
formatter.feature({
  "line": 1,
  "name": "Check Contact Us functionality",
  "description": "",
  "id": "check-contact-us-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Veirify Phone Number error messages",
  "description": "",
  "id": "check-contact-us-functionality;veirify-phone-number-error-messages",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid full name \"\u003cFull Name\u003e\" and invalid phone entry \"\u003cPhone Entry\u003e\" and email \"\u003cEmail Address\u003e\" and message \"\u003cMessage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the correct \"\u003cError Message\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "check-contact-us-functionality;veirify-phone-number-error-messages;",
  "rows": [
    {
      "cells": [
        "Full Name",
        "Phone Entry",
        "Email Address",
        "Message",
        "Error Message"
      ],
      "line": 10,
      "id": "check-contact-us-functionality;veirify-phone-number-error-messages;;1"
    },
    {
      "cells": [
        "Andy Andrews",
        "xx",
        "tony.ogara@email.com",
        "Some message",
        "The telephone number is invalid."
      ],
      "line": 11,
      "id": "check-contact-us-functionality;veirify-phone-number-error-messages;;2"
    },
    {
      "cells": [
        "Bob Brown",
        "",
        "Bob.Brown@email.com",
        "Some message",
        "The field is required@."
      ],
      "line": 12,
      "id": "check-contact-us-functionality;veirify-phone-number-error-messages;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Veirify Phone Number error messages",
  "description": "",
  "id": "check-contact-us-functionality;veirify-phone-number-error-messages;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid full name \"Andy Andrews\" and invalid phone entry \"xx\" and email \"tony.ogara@email.com\" and message \"Some message\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the correct \"The telephone number is invalid.\" is displayed",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_Us.i_am_on_the_contact_page()"
});
formatter.result({
  "duration": 3226778640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Andy Andrews",
      "offset": 25
    },
    {
      "val": "xx",
      "offset": 64
    },
    {
      "val": "tony.ogara@email.com",
      "offset": 79
    },
    {
      "val": "Some message",
      "offset": 114
    }
  ],
  "location": "Contact_Us.user_enters_contact_details(String,String,String,String)"
});
formatter.result({
  "duration": 1384551849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The telephone number is invalid.",
      "offset": 13
    }
  ],
  "location": "Contact_Us.the_correct_is_displayed(String)"
});
formatter.result({
  "duration": 428616189,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Veirify Phone Number error messages",
  "description": "",
  "id": "check-contact-us-functionality;veirify-phone-number-error-messages;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid full name \"Bob Brown\" and invalid phone entry \"\" and email \"Bob.Brown@email.com\" and message \"Some message\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the correct \"The field is required@.\" is displayed",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_Us.i_am_on_the_contact_page()"
});
formatter.result({
  "duration": 2082329191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob Brown",
      "offset": 25
    },
    {
      "val": "",
      "offset": 61
    },
    {
      "val": "Bob.Brown@email.com",
      "offset": 74
    },
    {
      "val": "Some message",
      "offset": 108
    }
  ],
  "location": "Contact_Us.user_enters_contact_details(String,String,String,String)"
});
formatter.result({
  "duration": 1391584939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The field is required@.",
      "offset": 13
    }
  ],
  "location": "Contact_Us.the_correct_is_displayed(String)"
});
formatter.result({
  "duration": 592610361,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...he field is required[@].\u003e but was:\u003c...he field is required[].\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat StepDefinitions.Contact_Us.the_correct_is_displayed(Contact_Us.java:55)\n\tat ✽.Then the correct \"The field is required@.\" is displayed(src/main/resource/Features/Contact_Us.feature:7)\n",
  "status": "failed"
});
});