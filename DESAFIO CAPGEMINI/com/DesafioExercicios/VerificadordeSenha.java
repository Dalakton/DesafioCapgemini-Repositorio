package com.DesafioExercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadordeSenha {


    public static int contadordecaracteres(String Senha) {

        /*
         * Declarei o contador iniciando e rebendo 0.
         */
        int count = 0;

        /*
         * para usar o metodo regex, usei a classe Pattern para declara as expresões relugares, pattern.compile para
         *  compilar e validar elas,  preparando-a para ser usada.
         */

        Pattern numero = Pattern.compile("(\\d)");

        Pattern maiusculo = Pattern.compile("([A-Z])");

        Pattern minusculo = Pattern.compile("([a-z])");

        Pattern especial = Pattern.compile("(\\W)");

        /*
         * utilizei o matcher para varres as expressões regulares em pattern ,
         *  para procurar as expressões regulares na senha e ver se vai casar com o a senha.
         */



        Matcher Numero = numero.matcher(Senha);

        Matcher Maiusculo = maiusculo.matcher(Senha);

        Matcher Minusculo = minusculo.matcher(Senha);

        Matcher Especial = especial.matcher(Senha);


        /*
         * usei a estrutura composta if, para quando não for encontrado as expressões regulares,
         * acrescentar mais 1 ao contador.
         *
         */


        if (!Numero.find()) {
            count++;
        }

        if
        (!Maiusculo.find()) {
            count++;
        }

        if
        (!Minusculo.find()) {
            count++;
        }

        if
        (!Especial.find()) {
            count++;
        }

        /*
         * neste if vou adicionar o contador mais a senha usando o length onde ira da a
         * quantidade de caracteres, e tem quer ser menor que 6 , e o contador vai
         * receber ele mesmo + 6, e - menos o contador + mais a senha.
         *
         *
         *
         */




        if
        ((count + Senha.length()) < 6) {
            count = count + 6 - (count + Senha.length());

        }
        /*
         *  Nos retornará o contador.
         */


        return count;
    }

    public static void main(String[] args) {

        /*
         * Classe Scanner para a entrada de dados.
         *
         */
        Scanner Entrada = new Scanner(System.in);
        String SegundaSenha;

        /*
         * usei o System.out.print para colher a senha desejada pelo o usuario.
         *
         */

        System.out.println("digite sua senha: ");
        SegundaSenha = Entrada.next();

        /*
         * Neste if , chamei a classe contadordecaracteres e validei com a senha inserida que
         * esta contida dentro da variavel SegundaSenha, e se o contador que esta dentro da classe,
         * retorna um valor menor que 1, a senha esta correta pos não esta faltando nenhum caracter,
         * e dara a saida senha correta.
         *
         */


        if (contadordecaracteres(SegundaSenha) <1) {
            System.out.println("senha correta");

            /*
             * neste else if , chamei novamente a classe contadordecaracteres e validei com a senha inserida
             * que esta contida na variavel SegundaSenha , se o contador que esta dentro da classe , retorna
             * um valor maior ou igual a 1 , vai dar sennha incorreta pos estará faltando alguns carateres e
             * retornará quantos esta faltando.
             *
             */

        } else if (contadordecaracteres(SegundaSenha) >= 1) {
            System.out.println(" senha insegura , esta faltando " + contadordecaracteres(SegundaSenha) +"caracteres , revise sua senha e veja se contém "
                    +" pelo menos uma letra minúscula,precisa de pelo menos 1 letra maiúscula, precisa pelo menos 1 numero e um caracter especial"
                    +" por exemplo: [!@#$%^&*()-+]");


        }
    }

}















