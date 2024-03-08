//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ContaCorrente lucas = new ContaCorrente(500, "12345", "Lucas", 1000, true);
       ContaCorrente pessoa = new ContaCorrente(1000, "123", "Pessoa", 5000, true);
       System.out.println(lucas.sacar(1500));
       System.out.println(lucas.depositar(500));
       pessoa.transferir(lucas, 1000);
       System.out.println(lucas.getSaldo());
       System.out.println(pessoa.getSaldo());
    }
}