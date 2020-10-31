Feature: Chanter comme un Canard
  Everybody wants to sing like a duck

  Scenario: Cancanner comme un colvert
    Given a new colvert
    When I am asked to cancaner
    Then I should say "Je cancane!"

  Scenario: Cancanner comme un mandarin
    Given a new mandarin
    When I am asked to cancaner
    Then I should say "Je cancane!"

  Scenario Outline: Cancaner comme un canard
    Given a new "<duckClass>"
    When I am asked to cancaner
    Then I should say "<answer>"

  Examples:
  # |-----------------------------------------------------
    | duckClass                          | answer        |
  # |----------------------------------------------------
    | org.blagnac.cpoa.Colvert           | Je cancane!   |
    | org.blagnac.cpoa.Mandarin          | Je cancane!   |
    | org.blagnac.cpoa.CanardEnPlastique | Je cancane!   |
  # |-----------------------------------------------------
