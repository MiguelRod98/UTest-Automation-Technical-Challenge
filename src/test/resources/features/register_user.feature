#Autor: Miguel Rodriguez

@Stories

Feature: user registration on the uTest website
  As a user, I want to register in UTest to become the best automator in the world


  Scenario Outline: Registering a new user on the uTesT page
    Given that the user enters the uTest page
    When a user fills out the registration form correctly
      | firstName   | lastName   | email   | birthMonth   | birthDay   | birthYear   | city   | zip   | country   | computer   | version   | languages   | mobileDevice   | model   | operatingSystem   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <birthMonth> | <birthDay> | <birthYear> | <city> | <zip> | <country> | <computer> | <version> | <languages> | <mobileDevice> | <model> | <operatingSystem> | <password> | <confirmPassword> |
    Then the registration is successful
      | confirmationRegisterText |
      | Complete Setup           |

    Examples:
      | firstName | lastName  | email                   | birthMonth | birthDay | birthYear | city   | zip    | country  | computer | version         | languages | mobileDevice | model       | operatingSystem | password             | confirmPassword      |
      | Miguel    | Rodriguez | miguel_herc77@gmail.com | December   | 19       | 1998      | Soacha | 250051 | Colombia | Windows  | Windows 11 Home | English   | Apple        | iPhone 15   | iOS 16.0        | MiguelHercGo@123456* | MiguelHercGo@123456* |
      | Juan      | Mendez    | juan_herc88@gmail.com   | June       | 3        | 1980      | Bogota | 153500 | Colombia | macOS    | Sonoma 14.0     | Spanish   | Lenovo       | Tab P12 Pro | Android 13      | JuanHercGo@123456*   | JuanHercGo@123456*   |
