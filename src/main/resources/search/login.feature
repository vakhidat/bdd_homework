Feature: Login ebay.com

  Scenario: Login with already registered user credentials
    Given I navigate to login page on ebay.com
    And I fill credentials with parameters: login: "test1441@yandex.ru"; password: "123qwerty"
    When I click on login button
    Then I see welcome message at the left page corner