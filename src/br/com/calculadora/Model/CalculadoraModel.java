package br.com.calculadora.Model;


public class CalculadoraModel {
    
    
    double valor1, valor2, resultado;

    public CalculadoraModel() {
    valor1 = 0;
    valor2 = 0;
    resultado = 0;
    }
    
    public void somar(){
        
        resultado = valor1 + valor2;
    }
    
    public void subtrair(){
        
        resultado = valor1 - valor2;
    }
    
    public void multiplicar(){
        
        resultado = valor1 * valor2;
    }
    
    public void dividir(){
        
        resultado = valor1 / valor2;
    }

    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
}
