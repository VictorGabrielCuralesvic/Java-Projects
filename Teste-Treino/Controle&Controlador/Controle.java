package controle&controlador;

public class Controle implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        this.volume = 20;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    
    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("// Menu Aberto //");
        System.out.println("-- Tá ligado? " + isLigado());
        System.out.println("-- Tá tocando? " + isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i = i + 1) {
            System.out.print("|");
        }

    }    

    @Override
    public void fecharMenu() {
        System.out.println("// Fechando o Menu... //");
        
    }

    @Override
    public void menosVolume() {
        if(isLigado() == true) {
            this.setVolume(this.getVolume() - 2);
        }
        
    }

    @Override
    public void maisVolume() {
        if(isLigado() == true) {
            this.setVolume(this.getVolume() + 2);
        }
        
    }
    

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
        
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0) {
            this.setVolume(10);
        }
        
    }

    @Override
    public void play() {
        if(this.isLigado() == true && this.isTocando() == false) {
            this.setTocando(true);
        }
        
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando() == true) {
            this.setTocando(false);
        }
        
    }

}