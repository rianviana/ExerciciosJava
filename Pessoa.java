package Atividades.ExerciosUdemy.Arrays.DesafioModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.pesoComida;
        }

    }

    String apresentacao() {
        return "Olá meu nome é " + nome + " e tenho " + peso + "Kgs.";
    }

}
