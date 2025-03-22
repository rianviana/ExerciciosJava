package Atividades.ExerciosUdemy.Arrays.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {



    Comida c1 = new Comida("Pizza", 0.168);
    Comida c2 = new Comida("Macarrão", 0.190);

    Pessoa p1 = new Pessoa("Gustavo", 90.00);

        System.out.println(p1.apresentacao());
        p1.comer(c1);
        System.out.println(p1.apresentacao());

    }
}
