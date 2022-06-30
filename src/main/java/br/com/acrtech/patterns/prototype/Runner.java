package br.com.acrtech.patterns.prototype;

public class Runner {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setX(10);
        circulo.setY(10);
        circulo.setColor("Azul");
        circulo.setRaio(3);

        Shape clone = circulo.clone();
        Shape mesmaReferencia;
        mesmaReferencia = circulo;
        System.out.println("Objeto original: " + circulo);
        System.out.println("Objeto novo clonado pelo método clone: " + clone);
        System.out.println("Objeto novo referenciando o circulo original: " + mesmaReferencia);
        System.out.println("Comparação do original com o clone: " + (circulo == clone));
        System.out.println("Comparação do original com a referência: " + (circulo == mesmaReferencia));
        System.out.println("Comparação do clone com a referência: " + (clone == mesmaReferencia));

        circulo.setColor("Vermelho");
        System.out.println("Objeto original: " + circulo);
        System.out.println("Objeto novo clonado pelo método clone: " + clone);
        System.out.println("Objeto novo referenciando o circulo original: " + mesmaReferencia);
    }
}
