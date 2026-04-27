public class Exercicio2 {

    public static void main(String[] args) {

        String consoantes = "bcdfghjklmnpqrstvwxyz";
        String vogais = "aeiou";

        int[] tamanhos = {4,6,8};

        for(int u = 0; u < 5; u++) {

            int tamanho = tamanhos[(int)(Math.random()*3)];
            String user = "";

            for(int i = 0; i < tamanho/2; i++) {

                char c = consoantes.charAt((int)(Math.random()*consoantes.length()));
                char v = vogais.charAt((int)(Math.random()*vogais.length()));

                user += c;
                user += v;
            }

            System.out.println("Username: " + user);
        }
    }
}