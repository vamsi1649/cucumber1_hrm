Feature:Test Orange Hrm
1)Valid case
2)Invalid case
Background:
Given I should go to the login page
@PositiveTesting
Scenario:To Test login functionality with valid data
And Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "OrangeHRM"
@NegativeTesting
Scenario:To Test login functionality with invalid data
And Enter the username "admin"
And Enter the password "Admin123"
And Click on the login button
Then I should see the username as "OrangeHRM"