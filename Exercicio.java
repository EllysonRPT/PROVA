package Prova;

import java.util.Scanner;


public class Exercicio {
   Scanner sc = new Scanner(System.in);

   public void Exercicio1() {
      System.out.println("Digite numeros inteiro");

      int Numero1 = sc.nextInt();
      int Numero2 = sc.nextInt();
      System.out.println("1.Adição 2.subtração 3.divisao 4.multiplicação");
      int aritmética = sc.nextInt();

      if (aritmética == 1) {
         int Resultado = Numero1 + Numero2;

      } else if (aritmética == 2) {
         int Resultado = Numero1 - Numero2;

      } else if (aritmética == 3) {
         int Resultado = Numero1 / Numero2;

      } else if(aritmética==4){
         int Resultado = Numero1 * Numero2;

      }else if (aritmética==4 && Numero2!=0);

      int Resultado = Numero1 * Numero2;
      System.out.println("o resultado foi de " + Resultado);

   }

   public void Exercicio2() {
      System.out.println("digite o o numero da matricula");
      double matricula = sc.nextInt();

      if (matricula % 4 == 0) {
         System.out.println("Time do Chris");

      } else if (matricula % 4 == 1) {
         System.out.println("Time do Greg");

      } else if (matricula % 4 == 2) {
         System.out.println("Time do Caruso");

      } else {
         System.out.println("Time do Jerome");

      }

   }

   /**
    * 
    */
   public void Exercicio3() {
      System.out.println("digite a quantidade de morango");
      double morangoKG = sc.nextDouble();
      System.out.println("digite a quantidade de maca");
      Double macaKG = sc.nextDouble();
      System.out.println("digite a quantidade de banana");
      Double bananaKG = sc.nextDouble();
      double morango = 2.50;
      double maça = 1.80;
      double banana = 1.30;
      double valorFinal = (morango * morangoKG) + (maça * macaKG) + (banana * bananaKG);
      int percentualDesconto = 10;
      if (morangoKG + macaKG + bananaKG > 8 || valorFinal > 25) {
         double desconto = (valorFinal * percentualDesconto) / 100;
         double precoComDesconto = valorFinal - desconto;
         System.out.println(" o valor a pagar" + precoComDesconto);

      } else {
         System.out.println("o valor a pagar é " + valorFinal);
      }

   }
}