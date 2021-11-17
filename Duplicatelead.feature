Feature: Duplicatelead Functionality
Scenario Outline:
Given click the findleads 
Then click the phone button
Then enter the phonenumber as <phonenumber>
Then click the findleads button
And click the firstId
Then click the duplicate lead button
And click the summit button
Examples:
|phonenumber|
|'78'|
|'98'|