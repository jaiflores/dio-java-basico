package edu.jai;
public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Jaianny";
        String segundoNome = "Vivian";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return  primeiroNome.concat(" ").concat(segundoNome);
}

}