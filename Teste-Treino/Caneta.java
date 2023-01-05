public class Caneta {
    public String cor;
    private int carga;
    protected boolean tampada;

    //metodo construtor
    public Caneta(String c, int cg, boolean t) {
        this.cor = c;
        this.carga = cg;
        this.tampada = t;
        //this.tampar();
        
        //setcor(c);
        //setcarga(cg);
        //settampada(t);
    }

    public void status() {
        System.out.println(this.cor);
        System.out.println(this.carga);
        System.out.println(this.tampada);
    }
    //metodos acessores e metodos modificadores
    
    public String getcor() {
        return this.cor;
    }

    public void setcor(String c) {
        this.cor = c;
    }

    public int getcarga() {
        return this.carga;
    }

    public void setcarga(int cg) {
        this.carga = cg;
    }

    public boolean gettampada() {
        return this.tampada;   
    }

    public void settampada(boolean t) {
        this.tampada = t;
    }

    public void tampar() {
        this.settampada(true);
        //this.tampada = true;
    }

    public void destampar() {
        this.settampada(false);
        //this.tampada = false;
    }
}
