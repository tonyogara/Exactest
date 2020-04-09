# Project Name
> Test Automation of the Exactest Website

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
This projects is based around the automation testing of the Exactest website. I am using this to improve my automation experience using a real world website. The website has been downloaded to run locally. Site was downloaded using the "HTTrack" tool.

## Screenshots
![Example screenshot](./img/screenshot.png)

## Technologies
* Technologies used are Java, Eclipese IDE, Selenium, Cucumber, Extent Report.

## Setup
1. Load the ExactestFrameWorkArId into Eclipse
2. Load the downloaded website to a specific folder. Copy the localtion of the "index.html" file to the "launchUrl" setting in the config.properties file. * Note if this is to be run on the live site then just copy the live url "https://exactest.ie" to the "launchUrl" in the config.properties file.
3. To run the "Contact_Us" feature file set the "contactUsUrl" value to the following  location "file:///Users/tony/websites/Exactest/exactest.ie/contact-us/index.html"
4. In the config.properties file set the "reportConfigPath" value to "extent-config.xml" file that was loaded in step 1
5. Feature files have been set with the following tags:
@SmokeTest
@SystemTest
6. In the "TestRunner" class set the tag/tags which you wish to run
7. In the "TestRunner" class right click the mouse and select the option "Run As".."JUnit Test"
8. When tests have been executed the automatically generated report can be found at the following location "ExactestFrameWorkArId/target/cucumber-reports/Exactest report.html"

## Code Examples
See below for an example of a feature file that was executed.
Feature: Check Contact Us functionality

  @SystemTest
  Scenario Outline: Veirify Phone Number error messages
    Given I am on the contact page
    When I enter valid full name "<Full Name>" and invalid phone entry "<Phone Entry>" and email "<Email Address>" and message "<Message>"
    Then the correct "<Error Message>" is displayed

    Examples: 
      | Full Name    | Phone Entry | Email Address        | Message      | Error Message                    |
      | Andy Andrews | xx          | tony.ogara@email.com | Some message | The telephone number is invalid. |
      | Bob Brown    |             | Bob.Brown@email.com  | Some message | The field is required1.          |

## Features
List of features ready
* Feature: Launch.feature - Check launching the application works.
* Feature: Contact_Us.feature - Check Contact Us functionality

To-do list:
* Feature: Check all links land on the correct page


## Status
Project is in progress. More features will be added. Work up to now has been to set up the framework and prove that the features created run as expected

## Inspiration
Learning from different websites on Youtube. Alot of problems solved by referencing the "Stackoverflow" website.

## Contact
Created by [tony.ogara@gmail.com) - feel free to contact me!
