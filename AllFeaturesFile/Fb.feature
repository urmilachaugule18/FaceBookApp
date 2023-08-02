Feature: Test FaceBook Application

  Scenario Outline: Test FaceBook Register Page Functionality
    Given User open Register Page url on "chrome" browser
    When User Enter valid "<firstname>" and "<lastname>" and "<Email>" and "<ReEmail>" and "<Password>" and "<Date>" and "<Month>" and "<Year>" click on submit button

    Examples: 
      | firstname | lastname | Email          | ReEmail        | Password | Date | Month | Year |
      | Urmila    | Khadake  | urmi@gmail.com | urmi@gmail.com | urmi1234 |   18 | Mar   | 1997 |
      | Amol      | Chaugule | amol@gmail.com | amol@gmail.com | amol1234 |   25 | Jun   | 1995 |
      | Rani      | Desai    | rani@gmail.com | rani@gmail.com | rani1234 |   13 | Mar   | 2000 |
