public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;

    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if(this.getTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        }


    }

    public void fecharConta() {
        if(this.getSaldo() > 0 || this.getSaldo() < 0) {
            System.out.println("ERRO: Não pode fechar a conta");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(float valor) {
        if(this.isStatus() == true) {
            this.setSaldo(saldo + valor);
        } else {
            System.out.println("ERRO: Conta Fechada");
        }


    }

    public void sacar(float valor) {
        if(this.isStatus() == true) {
            if(this.getSaldo() > valor) {
                this.setSaldo(saldo + valor);;
            } else {
                System.out.println("ERRO: Saldo insuficiente");
            }
        } else {
            System.out.println("ERRO: Conta Fechada");
        }

    }

    public void pagarMensal() {
        float valorMensal = 0;
        if(this.getTipo() == "CC") {
            valorMensal = 12;
        }
        if(this.getTipo() == "CP") {
            valorMensal = 20;
        }
        if(this.status = true) {
            if(this.getSaldo() > valorMensal) {
                this.setSaldo(saldo - valorMensal);;
            } else {
                System.out.println("ERRO: Saldo Insuficiente");
            }
        } else {
            System.out.println("ERRO: Conta Fechada");
        }
        
        // evitat usar tipo.atributo, mas sim usar o método que acessa ele ou
        // modifica ele.
        // exemplo: Evitar usar this.saldo para acessar, e usar this.getSaldo()
        // evitat usar this.saldo para modificar e usar this.setSaldo()
        
        
        //if(this.tipo == "CC") {
        //    if(this.status == true) {
        //        if(this.saldo > 12) {
        //            this.saldo = saldo - 12;
        //        } else {
        //            System.out.println("ERRO: Saldo Insuficiente");
        //        }
        //    } else {
        //        System.out.println("ERRO: Conta Fechada");
        //    }
       // }
       //     if(this.status == true) {
       //         if(this.tipo == "CP") {
       //             if(this.saldo > 20) {
       //                 this.saldo = saldo - 20;
       //         } else {
       //         System.out.println("ERRO: Saldo Insuficiente");
       //         }
       //     } else {
       //         System.out.println("ERRO: Conta");
       //     }

      //  }

    }

}
