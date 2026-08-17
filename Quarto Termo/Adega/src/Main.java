void main() {
    adega adega = new adega();

    vinho v1 = new vinho("Tinto", "Catena Zapata", 750, 250.00, LocalDate.parse("2018-05-10"));
    vinho v2 = new vinho("Branco", "Chardonnay Reserva", 750, 120.50, LocalDate.parse("2021-09-15"));
    vinho v3 = new vinho("Tinto", "Barolo", 750, 450.00, LocalDate.parse("2015-03-20"));

    adega.addVinhoPos(v1,0,0);
    adega.addVinhoPos(v2,0,1);


    adega.incluirVinhoAleatorio(v3);

    for (int x = 0; x < 20; x++) {
        for (int y = 0; y < 10; y++) {
            if(adega.mostrarVinho(x,y) != null)
                System.out.println(adega.mostrarVinho(x,y));
        }
    }

    System.out.println("--- DADOS DA ADEGA ---");
    System.out.println("Vinho na posição [0][0]: " + adega.mostrarVinho(0, 0));
    System.out.println("Total de garrafas: " + adega.obterQuantidadeTotal());
    System.out.println("Qtd de Tintos: " + adega.quantVinhosTipos("Tinto"));
    System.out.println("Qtd de Brancos: " + adega.quantVinhosTipos("Branco"));
    System.out.printf("Valor agregado total: R$ %.2f\n", adega.obterValorAgregado());
    System.out.println("Vinho mais antigo: " + adega.obterVinhoMaisAntigo());

    System.out.println("\n--- REMOVENDO VINHO ---");
    vinho retirado = adega.retirarVinho(0, 0);
    System.out.println("Vinho retirado da [0][0]: " + retirado);
    System.out.println("Total de garrafas após remoção: " + adega.obterQuantidadeTotal());


}
