
package tabuleirojogo;

public class Peca {
    protected Posicao posicao;
    public Tabuleiro tabuleiro;
    
    public Peca(Tabuleiro tabuleiro)
    {
        this.tabuleiro = tabuleiro;
        this.posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
