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

      } else {
         int Resultado = Numero1 * Numero2;

      }

      int Resultado = Numero1 * Numero2;
      System.out.println("o resultado foi de " + Resultado);

   }

   public void Exercicio2() {
      System.out.println("digite o o numero da matricula");
      double Matricula = sc.nextInt();

      if (Matricula % 4 == 0) {
         System.out.println("Time do Chris");

      } else if (Matricula % 4 == 1) {
         System.out.println("Time do Greg");

      } else if (Matricula % 4 == 2) {
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
      double MorangoKG = sc.nextDouble();
      System.out.println("digite a quantidade de maca");
      Double MacaKG = sc.nextDouble();
      System.out.println("digite a quantidade de banana");
      Double BananaKG = sc.nextDouble();
      double Morango = 2.50;
      double Maça = 1.80;
      double Banana = 1.30;
      double ValorFinal = (Morango * MorangoKG) + (Maça * MacaKG) + (Banana * BananaKG);
      int percentualDesconto = 10;
      if (MorangoKG + MacaKG + BananaKG > 8 || ValorFinal > 25) {
         double desconto = (ValorFinal * percentualDesconto) / 100;
         double precoComDesconto = ValorFinal - desconto;
         System.out.println(" o valor a pagar" + precoComDesconto);

      } else {
         System.out.println("o valor a pagar é " + ValorFinal);
      }

   }
}