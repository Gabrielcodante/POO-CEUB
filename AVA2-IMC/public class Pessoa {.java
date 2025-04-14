public class Pessoa {
    private float peso;
    private String nome;
    private float altura;
    private double imc;

    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = calculoimc(peso, altura);
        }
        private static double calculoimc(float peso, float altura) {
            float imc = 0.0;
            imc = peso / ( Math.pow(altura, 2) );
return imc;
}
}