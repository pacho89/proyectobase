# Autor: Danny Francisco Hernandez Godoy
  @stories
  Feature: Academy Choucair
    As a user, I want to learn hot to automate in screenplay at the Choucair Academy with the automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than Danny wants to learn automation at the Academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course Recursos Automatización Bancolombia on the choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called resources Recursos Automatización Bancolombia
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser    | strPassword   | strCourse                           |
        | 1105784633 | Choucair2021* | Recursos Automatización Bancolombia |