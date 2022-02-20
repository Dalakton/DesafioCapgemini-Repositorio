package com.DesafioExercicios;

import java.util.Iterator;
import java.util.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Sherlock {

    public static void main(String[] args) {

        /*
         * Utilizei a classe escaner para a entrada de dados
         */

        Scanner Entrada = new Scanner(System.in);

        /*
         * Usando o System.out.print pede para que o usuario digite a sua palavra desejada,
         * que foi adicionada a variavel S
         */

        System.out.println("digite uma palavra: ");
        String S = Entrada.nextLine();
        process(S);
    }

    /*
     *
     * @param map o pimeiro metodo ira validar se a palavra fornecida ,
     *  atraves da classe map, se existe como forma
     *  alguma outra palavra para ser anagrama , vai analisar pegando a chave e o value
     *  que são as funçoes do map e fara as operaçoes aritmeticas para saber.
     *
     */


    public static void printMap(Map<String,Integer> map){

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        int soma =0;
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)it.next();
            int contador = entry.getValue();
            int pares = contador*(contador-1)/2;
            soma += pares;
        }
        System.out.println(soma);
    }

    /*
     *
     * @param str segundo vai pegar uma string conatr seus caracteres ira ver se é menor que len
     * ira usar a funçao de string para ver as subString ira adicionar em char array , organizalo com o metodo sort
     * e ser se contem a chave na substring , ira pega a sub string e adicionar ao contador cso encontre o que esta sendo pedido ira nos retorna a quatidade
     *  de anagrama , caso não nos voltara zero e terminara o programa.
     */

    public static void process(String str){

        Map<String,Integer> hMap = new HashMap<>();
        int length = str.length();
        int len = 1;
        while(len<length){

            for(int i=0;i<=length-len;i++){
                String sub = str.substring(i,i+len);
                char [] array = sub.toCharArray();
                Arrays.sort(array);
                sub = new String(array);
                if(hMap.containsKey(sub)){
                    int count = hMap.get(sub);
                    hMap.put(sub,++count);
                }
                else{
                    hMap.put(sub,1);
                }
            }

            len++;
        }

        printMap(hMap);
    }
}
























