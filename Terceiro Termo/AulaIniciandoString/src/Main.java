public class Main{
    public static void main(String[] args){
        String nome = "Fulano da Silva", sobrenome="Silva", nome2 = "Ciclano Oliveira";
        int i;
        char letra;
        i = nome.length();// exemplo só, nao da para utilizar em uma string sem valor
        System.out.println(nome.length());//length() é para ler o tamanho da string
        nome.toUpperCase();// no caso as funçoes nao alteram direto na variavel
        nome.charAt(0);// é a mesma coisa que nome[0] mas tem que jogar para uma outra variavel
        letra = nome.charAt(0);
        System.out.println(nome);
        System.out.println(letra);
        //exemplo
        for(int n=0;n<nome.length();n++)
        {
            char letra1 = nome.charAt(n);
            System.out.println(letra1);
        }
        // metodo de comparação de string
        // equals, equalsIgnoreCase, endsWith, startsWith, contains,
        if(nome.equals("Fulano da Silva"))
            System.out.println("é o fulano");
        if(nome.equals("fulano da silva"))
            System.out.println("nao é o fulano");
        if(nome.endsWith(sobrenome))// se esta igual o final da string
            System.out.println("é um Silva");
        if(nome.startsWith("Fulano"))//verifica se esta igual a no começo da string
            System.out.println("é um Fulano");
        if(nome.toUpperCase().endsWith(sobrenome))//consegue juntar funçoes em uma condição
            System.out.println("é um Silva");
        if(nome.contains("lano"))// independente de onde estiver conta
            System.out.println("tem um lano");
        //metodos que comparam ordenaçoes
        System.out.println(nome.compareTo(nome2));
        if(nome.compareTo(nome2)>0)// retorna um valor como o strcmp
            System.out.println(nome+" vem depois de "+nome2);
        System.out.println(nome.indexOf("o"));//em qual posição esta o 'o' se nao tiver retorna -1
        nome = nome.replace("Fulano","Zé");// ele troca o nome que achar por outro nome
        System.out.println(nome);
        String[] partes=nome.split(" ");//separa entre os espaços nesse caso
        System.out.println(partes[0]);

        char[] nomeVet = nome.toCharArray();
        char aux= nomeVet[0];
        nomeVet[0] = nomeVet[10];
        nomeVet[10] = aux;
        nome =new String(nomeVet);
        System.out.println(nome);
        System.out.println(nome.substring(0,6));// pega partes da string começando da posição 0 ate a 6 ou se for um valor so ele continua a partir do 10
        nome=nome+" de Oliveira";// concatenação
        System.out.println(nome);
        String placa ="ADD - 5377";
        //REGEX cria modelos de comparação
        if(placa.matches("[A_Z]{3}[-][0_9]{4}"))// serve para definir uma sequencia [fica de um valor a outro separado por _]{quantidades de valores}-
            System.out.println("é uma placa de veiculo");
        String frase= """
                Eu nao sei o que estou escrevendo, 
                pois quero um texto grande pra que 
                sirva para este exemplo, do professor 
                sobre as 3 aspas. 
                """;
        frase = frase.replaceAll("[,.;]","");
        //frase = frase.replaceAll("das|de|dos","*");Exemplo que funciona tambem
        System.out.println(frase);
    }
}