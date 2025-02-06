package edu.larissa.primeiropacote;
//geralmente todos os arquivos .java começam com a letra maiuscula
public class MyClass {
    public static void main(String [] args){
        //public -> pública
        // static -> estática
        // void -> não retorna nada
        // main -> método principal
        //string - > parâmetro tipo string
        // [] -> array
        // args -> argumentos/parâmetros
        // {} -> corpo

        System.out.print("Olá mundo");
        //system -> sistema
        //out ->  dê uma saida
        //print -> imprima:

        final String BR = "Brasil";
        //escrito completamente em letras maiusculas e começando com "final": nunca poderá ser aterada

        int ano = 2025;
        //escrito começando com letras minusculas: pode ser alterada:
        ano = 2024;


        String primeiroNome = "Larissa";
        String segundoNome = "Giovanna";
        //define os nomes

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        //envia para o metodo nomeCompeto os nomes (chama o metodo)

        System.out.println(nomeCompleto);
        //imprime o retono do metodo nomeCompleto
    }

    //- Métodos (como se  fosse uma função):
    //sempre no infinitivo. somar, correr, beber, etc.
    public static String nomeCompleto (String primeroNome, String segundoNome){
        //metodo recebe primeiro e segundo nome do metodo main

        return "Resultado: " + primeroNome.concat(" ").concat(segundoNome);
        //retorne o primeiro nome (concatenando) junto do segundo nome
    }
}
