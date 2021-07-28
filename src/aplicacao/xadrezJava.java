package aplicacao;


import tabuleirojogo.Tabuleiro;
import xadrez.PartidaXadrez;


public class xadrezJava {
    public static void main(String[] args) {
        
        PartidaXadrez partida = new PartidaXadrez();
        UI.imprimeTabu(partida.getPeca());
        
        
    }
    
}
