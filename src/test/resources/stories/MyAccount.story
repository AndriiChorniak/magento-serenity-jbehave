
Narrative:
As a user I want to check My Account feature

Scenario:01 User can log in to his account
Meta:
@skip
Given User is on Login page.
When Entering credential VALID_USER
Then I get My Account Dashboard page with logged in status.

Scenario:02 Fake user can not log in to account
Meta:
@skip
Given User is on Login page.
When Entering credential FAKE_USER
Then Authentication failed

Scenario:03 All required asterisks should be present
Meta:
@skip
Given User is on Login page.
When Click on login button
Then Observe all asterisks

Scenario:04 Verify "Forgot your password" button
Meta:
@skip
Given User is on Login page.
When click on "Forgot your password" button
Then I redirect to Forgot Password page

Scenario:05 Verify "Go back" button
Given User is on Forgot Password page
When click on "Go back" button
Then User redirect to Login page
