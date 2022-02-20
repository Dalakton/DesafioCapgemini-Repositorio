package com.DesafioExercicios;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class degraus {


        public static void main(String[] args) {


            /*
             * Utilizei a classe Scanner, para a entradas dos dados necessarios
             *  para resolvimento da questão.
             */
            Scanner scan = new Scanner(System.in);

            /*
             *  Utilizei o método ArrayList, para não se preocupar com
             *  a quantidade de posições inicais do array.
             *
             */

            List<String> degraus = new ArrayList<>();

            /*
             * Usei o System.out.print(); para imiprimir na tela ,
             * a quantidade de vezes que o usuario desejaria.
             *
             * E ja fez a leitura dessa quantidade , com a classe Scanner
             * da variavel inteira com identificador (qtdDegraus).
             */

            System.out.print("Digite a quantidade de vezes: ");
            int qtdDegraus = scan.nextInt();

            /*
             *
             * Usei o laço de repetição for, para da as seguintes informações : Enquanto i for 0 que é o inicio do laço
             *  para não haver um lop infinito, então começa com 0 , e este i for menor que as quantidade de degraus (qtdDegraus),
             *  ira haver o incremento de mais 1 , quando for inserido o valor e for adicionado a variavel (qtdDegraus),
             * O ( qtdDegrau - 1 ) serve para acrescentar espaço, através do append, na lateral esquerda. depois acrescenta em vez de numero vai por o "*"
             *  acrescentará mais 1 "*" e os repeat para repetir os dados , ou seja tudo que ele diminui em cima será acrescentado em baixo ate o valor da qtdDegraus chegar a o de i que é zero.
             *
             *
             *
             */


            for (int i = 0; i < qtdDegraus; i++) {
                degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));

            }

            /*
             * o for each ira pecorrer o ArrayList Degraus , e acrescentará na variavel  String (d)
             *  e vai imprimir para o usuario a quantidade de degraus informados com "*".
             *
             *
             */



            for (String d : degraus) {
                System.out.println(d);
            }
        }
    }

