package com.RockPaperScissor;
import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {
    public static void main(String[] args) {
        System.out.println("kindly choose rock,paper or scissor ");
        System.out.println("0-->rock");
        System.out.println("1-->paper");
        System.out.println("2-->scissor");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int n = rand.nextInt(3);
        if (a == n){
            System.out.println("match draw no L for you yet  ");
            System.out.println("you(retarded) and computer(genius) both have chosen same option");
        } else if (a==0 && n==1){
            System.out.println("you never fail to disappoint yourself do you ? looser bich");
            System.out.println("you chose ROCK and computer chose PAPER");
        }
          else if (a==0 && n==2){
            System.out.println("you can take the W for now but there won't be a next time suka(russian word d-head ");
            System.out.println("you chose ROCK and computer chose SCISSOR");
          }
          else if (a==1 && n==0){
            System.out.println("i am literally a code,and i have sympathy for a sorry excuse like you that is why you won ");
            System.out.println("you chose PAPER and computer chose ROCK");
        }
          else if (a==1 && n==2){
            System.out.println("L if you thought you would win you are a retarded moron");
            System.out.print(" you may not be the dumbest person in world but you better hope they don't die");
            System.out.println("you chose PAPER and computer chose SCISSOR");
          }
          else if (a==2 && n==0){
            System.out.println("what a joke just exit the code idiot enough for today ");
            System.out.println("you chose SCISSOR and computer chose ROCK");
          }
          else if (a==2 && n==1){
            System.out.println("\"W\" the only W you will get this you enjoy it while you can ");
            System.out.println("you chose SCISSOR and computer chose PAPER");
          }
          else{
            System.out.println("you cannot enter the correct number knucklehead you ae hard to under estimate");
        }


    }


    }


