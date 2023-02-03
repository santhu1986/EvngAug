Feature: Role Creation Functionality

Scenario Outline: Verify Role creation with Multiple sets of data

Given Tester Should on RHP

When Tester Enters Username and Password

Then Tester click on role button

When Tester click on new Role and enters "<RoleName>" and "<RoleType>"

Then Tester Close the Applicaton

Examples:

        | RoleName | RoleType |
        | TellerDcbank | E |
        | ClerkDcbank | E |
        | GenmanagerDcbank | E |
        
