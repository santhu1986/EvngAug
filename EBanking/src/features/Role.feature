Feature: Role Creation

Scenario Outline: Role Creation with Multiple Sets of data

Given Tester should on Ranford Home Page

When Tester Enters un and pwd click on login

When Tester click on Role button

Then Tester Click on New Role and enters "<RoleName>" and "<RoleType>"

When Tester Click on Log Out

Examples: 

          | RoleName | RoleType |
          | Tellerab | E |
          | Cashierab | E |
          | Managerabc | E |
          