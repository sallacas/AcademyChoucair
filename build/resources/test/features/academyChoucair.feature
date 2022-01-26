#Autor : Johnatan Casallas | language: en
@stories
Feature: Academy Choucair
  As a user, I Want to learn how to automate in screenplay at the Choucair academy with athe automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser   | strPassword   |
    | jcasallas | Choucair2021* |
    When he search for the course on the Choucair academy platform
    | strCourse               |
    | Metodología Bancolombia |
    Then he finds the course
    | strCourse               |
    | Metodología Bancolombia |