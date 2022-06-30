package br.com.acrtech.patterns.prototype;

public class Circulo extends Shape{

    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override public Shape clone() {
        return new Circulo(this);
    }

    public Circulo() {
    }

    public Circulo(Circulo target) {
        super(target);
        if (target != null) {
            this.raio = target.raio;
        }
    }

    @Override public String toString() {
        return "Circulo{" + "raio=" + raio + ", x=" + getX() + ", y=" + getY() + ", color='" + getColor() + '\'' + '}';
    }
}
