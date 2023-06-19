#Author:Akshaya...email...domain..
@login
Feature: validate login page

  Scenario Outline: validate login page with valid credentials
    Given open browser as "firefox"
    When enter url as "https://djangovinoth.pythonanywhere.com/login/"
    And enter username as "Akshayaachu"
    When enter password as "Aswin@1a"
    #And click login button
    When click sign up
    Then verify the welcome page as "hello" in header
    
    But dont click remember password
    
    