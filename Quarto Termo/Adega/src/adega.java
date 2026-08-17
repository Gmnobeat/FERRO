import java.util.Random;

public class adega {
    private vinho[][] armazenamento;

    public adega(){
        armazenamento = new vinho[20][10];
    }

    public boolean addVinhoPos(vinho vinho, int x,int y){
        if(x<=20 && x>=0 && y>=0 && y<=10)
            if(armazenamento[x][y] == null)
            {
                armazenamento[x][y] = vinho;
                return true;
            }
        return false;
    }

    public int obterQuantidadeTotal(){
        int cont=0;
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 10; y++) {
                if(armazenamento[x][y] != null)
                    cont+=1;
            }
        }
        return cont;
    }

    public boolean incluirVinhoAleatorio(vinho vinho) {
        if (obterQuantidadeTotal() >= 200) {
            return false; // Adega cheia
        }
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(20); // 0 a 19
            y = random.nextInt(10); // 0 a 9
        } while (armazenamento[x][y] != null);
        armazenamento[x][y] = vinho;
        return true;
    }

    public int quantVinhosTipos(String tipo){
        int cont=0;
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 10; y++) {
                if(armazenamento[x][y] != null && armazenamento[x][y].getTipo() == tipo)
                    cont++;
            }
        }
        return cont;
    }


    public double obterValorAgregado() {
        double total = 0.0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (armazenamento[i][j] != null) {
                    total += armazenamento[i][j].getValor();
                }
            }
        }
        return total;
    }


    public vinho obterVinhoMaisAntigo() {
        vinho maisAntigo = null;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                vinho atual = armazenamento[i][j];
                if (atual != null) {
                    if (maisAntigo == null || atual.getData().isBefore(maisAntigo.getData())) {
                        maisAntigo = atual;
                    }
                }
            }
        }
        return maisAntigo;
    }


    public vinho retirarVinho(int posx, int posy) {
        if (posx >= 0 && posx < 20 && posy >= 0 && posy < 10) {
            vinho removido = armazenamento[posx][posy];
            armazenamento[posx][posy] = null; // Esvazia a posição
            return removido; // Retorna o vinho removido (ou null se já estava vazio)
        }
        return null;
    }

    public vinho mostrarVinho(int posx, int posy) {
        if (posx >= 0 && posx < 20 && posy >= 0 && posy < 10) {
            return armazenamento[posx][posy];
        }
        return null;
    }


}
