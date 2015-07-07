package teste;

public class TesteCarro {
        public static void main(String[] args) {
                Carro c = new Carro();
                c.cor = "Amarelo";
                c.modelo = "Camaro";
                c.velocidade = 0;

                System.out.println(c.velocidade);
                c.acelerar();
                System.out.println(c.velocidade);
                c.acelerar();
                System.out.println(c.velocidade);
        }
}