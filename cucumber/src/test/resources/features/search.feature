Feature: Youtube search
 Scenario: Search "Selenium: on Youtube
   Given navigate to the 'http://youtube.com'
   When enter 'Selenium'
   And  click Search
   Then search results should not be false