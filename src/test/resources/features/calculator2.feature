# language: pt
# encoding: utf-8

Funcionalidade: Calcular soma de inteiros utilizando "Scenario Outline"

  Esquema do Cenario: Soma dois números positivos
    Dado Que eu tenha uma calculadora
    Quando Eu somo os números <num1> e <num2>
    Entao O resultado deve ser <total>
    Exemplos:
      | num1 | num2 | total |
      | 1    | 2    | 3     |
      | 10   | 15   | 25    |
      | 5    | 15   | 20    |