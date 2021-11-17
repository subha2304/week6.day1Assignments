Feature: Deletelead functionality
Scenario Outline:
Given click the findleads 
Then click the phone button
Then enter the phonenumber as <phonenumber>
Then click the findleads button
Then gettext from the id 
And click the firstId
Then click the Delete button
Then click findleads
And enter the savedId name
And again click the findbutton
But records should not be displayed
Examples:
|phonenumber|
|'78'|
|'98'|