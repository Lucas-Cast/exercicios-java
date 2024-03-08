public class ContaCorrente {
    private double saldo;
    private String numero;
    private String cliente;
    private double limite;
    private boolean situacao;

    public ContaCorrente(double saldo, String numero, String cliente, double limite, boolean situacao) {
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
        this.situacao = situacao;
    }

    private boolean checarLimite(double valor) {
        if (saldo - valor < -limite) return false;
        return true;
    }

    public String sacar (double valor) {

        if (checarLimite(valor)){
            this.saldo -= valor;
            return valor + " sacado com sucesso! Saldo atual: "+ saldo;
        } else {
           return "O saque falhou, limite excedido!";
        }
    }
    public String depositar (double valor) {
        this.saldo += valor;
        return "Valor adicionado, seu novo saldo é " + saldo;
    }

    public void transferir (ContaCorrente destino, double valor) {
        if (this.checarLimite(valor) && numero != destino.getNumero()) {
            this.sacar(valor);
            destino.depositar(valor);
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}

