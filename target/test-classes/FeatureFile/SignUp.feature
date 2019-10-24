Feature: Sign Up Functionlity to create account with Adepto
  As a User
  I want to create an account
  so that I can login
  Given I am on the Homepage


  @signUp
  Scenario Outline: To verify that I should see an error message when I enter special character or numbers in First Name and Last Name field
    When I click on join Network
    And I click on Sign up
    And I enter valid email address "<accountEmail>"
    And I enter "<firstName>" and "<lastName>" with special character and numbers
    And I enter "<password>" mixture of letters, numbers and symbol
    And click on the sign Up button
    Then I should see an Error message for first name and last name field
    Examples:
      | accountEmail        | firstName | lastName  | password   |
      | paulcreek@yahoo.com | 12565%&!  | 85964&*^% | paul@1980f |

  Scenario Outline: To verify that I should see an error message when I enter 151 character in account email field
    When I click on join Network
    And I click on Sign up
    And I enter "<accountEmail>" with 151 character
    Then I should see an error message Invalid account email underneath the account email field
    Examples:
      | accountEmail                                                                                                                                            |
      | pppppppppppaaaaaaaaaaauuuuuuuuuuuuuuuuuuuulllllllllllllllllllccccccccccccccccccrrrrrreeeeeekkkkkkkkk@yaaaaaaahhhhhhooooo.cccccccooooooommmmmmmmmmmmmmmm |

  Scenario: To verify that I should be able to create account with Adepto
    When I click on join Network
    And I click on Sign up
    And I enter account email address
    And I enter First Name
    And I enter Last Name
    And I create a valid password mixture of letters, numbers and symbol
    And click on the sign Up button
    And I should navigate to welcome page.
    And I select Accept terms and condition
    And I click on Continue button
    And I navigate to Check your email webpage
    And I enter one time account verification code
    And I click on button
    Then I should be able to create account.

  Scenario Outline: To verify that I should see an error message when I enter 36 character in First Name  and Last Name fields.
    When I click on join Network
    And I click on Sign up
    And I enter "<firstName>" with 36 character
    And I enter "<lastName>" with 36 character
    Then I should see an error message Invalid First Name and Invalid Last Name underneath the relevant fields.
    Examples: | firstName                            | lastName                             |
    | ppapapapapapaulalakaiakajanajannaajj | aksifkfirjruvjgnvhfjduriakslorifjdut |

  Scenario Outline: To verify that I should see an error message when I create password of 21 character.
    When I click on join Network
    And I click on Sign up
    And I create a "<password>" of 21 character mixture of letters, numbers and symbols.
    Then I should see error message invalid password underneath the password field
    Examples: | password              |
    | ajskdiwn5263487$%&"!u |

  Scenario Outline: To verify that I should see an error message when I create password with only 10 letters without symbol and numbers
    When I click on join Network
    And I click on Sign up
    And I create "<password>" of only 10 letters without any numbers or symbol
    Then I should see error message try a mix of numbers, letters, and symbols underneath the password field
    Examples: | password   |
    | anhytsgdlo |

  Scenario: To verify that I should be able to sign up with social sites google account.
    When I click on join Network
    And I click on Sign up
    And I click on G logo sign of Google
    Then I navigate to sign in with google
    And I choose and click the relevant account to continue
    Then I should be able to sign up

  Scenario: To verify that I should be able to sign up with social sites facebook.
    When I click on join Network
    And I click on Sign up
    And I click on F logo sign of Facebook.
    Then I navigate to log in to facebook page
    And I enter valid email address and  password to log in facebook
    And I click login Button
    Then I should be able to sign up

  Scenario: To verify that I should be able to sign up with social sites LinkedIn
    When I click on join Network
    And I click on Sign up
    And I click on In logo sign of linkedIn web site
    Then I navigate to linkedIn Welcome sign in webpage
    And I enter valid email address and  password to sign in linkedIn
    And I click sign in Button
    Then I should be able to sign up








