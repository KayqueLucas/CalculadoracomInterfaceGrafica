# **Calculadora com Interface Gráfica em Java** 

Este projeto é uma calculadora simples implementada em Java utilizando a biblioteca **Swing** para interface gráfica. Ele permite ao usuário realizar operações matemáticas básicas de forma intuitiva, com suporte a soma, subtração, multiplicação, divisão e cálculo de porcentagem.

---

## **Funcionalidades**  

1. **Operações Matemáticas**:  
   - Soma  
   - Subtração  
   - Multiplicação  
   - Divisão  
   - Porcentagem  

2. **Interface Gráfica**:  
   - Botões interativos para cada operação e números.  
   - Exibição clara do número ou resultado no display principal.  

3. **Ações Adicionais**:  
   - Limpar o campo de entrada.  
   - Apagar o último dígito inserido.  
   - Adicionar ponto decimal.  

---

## **Tecnologias Utilizadas**  
- **Java** (JDK 8 ou superior)  
- **Swing** para criação da interface gráfica.  
- Estruturação em **MVC**:  
  - `Model`: Gerencia a lógica de cálculo.  
  - `View`: Interface gráfica interativa para o usuário.  

---

## **Como Executar o Projeto**  

1. **Pré-requisitos**:  
   - Tenha o Java Development Kit (JDK) instalado na sua máquina.  
   - Um ambiente de desenvolvimento como NetBeans, Eclipse ou IntelliJ IDEA é recomendado.  

2. **Passos para executar**:  
   - Clone ou baixe este repositório.  
   - Abra o projeto em seu ambiente de desenvolvimento.  
   - Compile e execute a classe principal `CalculadoraView`.  

---

## **Estrutura do Código**  

- **`CalculadoraModel`**:  
  Contém a lógica de cálculo para realizar as operações matemáticas.  
  Métodos principais:  
  - `somar()`  
  - `subtrair()`  
  - `multiplicar()`  
  - `dividir()`  

- **`CalculadoraView`**:  
  Gera a interface gráfica e gerencia as interações do usuário com os botões.  

---