class Pessoa {
    String nome;
    int idade;
    int altura;
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos, e tenho " + altura + "cm de altura.");
    }
}
public class orientacaoobjeto {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gabriel";
        pessoa1.idade = 20;
        pessoa1.altura = 193;
        pessoa1.apresentar();
    }
}
