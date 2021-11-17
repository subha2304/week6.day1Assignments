Feature: Mergelead Functionality
Scenario Outline:
Given click the findleads 
Then click the phone button
Then enter the phonenumber as <phonenumber>
Then click the findleads button
And click the firstId
Then enter the edit button
Then enter a companyName as <cname>
And click the summit button
Examples:
|phonenumber||cname|
|'78'||'agp'|
|'98'||'cts'|