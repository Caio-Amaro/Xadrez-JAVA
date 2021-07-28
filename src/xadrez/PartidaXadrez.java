
package xadrez;

import tabuleirojogo.Posicao;
import tabuleirojogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaXadrez()
    {
    
        this.tabuleiro = new Tabuleiro(8, 8);
        ConfigInicial();
    
    }
    
    public PecaXadrez[][] getPeca()
    {
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];     
        
        for (int i=0; i<tabuleiro.getLinha(); i++ )
        {
            for (int n=0; n<tabuleiro.getColuna(); n++)
            {
                mat[i][n] = (PecaXadrez)tabuleiro.peca(i, n);
            }
        
        }
        
        return mat;
    
    }
    
    private void ConfigInicial()
    {
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(0,0));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(0,4));
        
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(7,7));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(7,3));
    
    }
    
    
}
