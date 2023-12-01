/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchadorinterface;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Luchadorinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        
        Raza1 Ironman = new Raza1("Iron man", 9999, 40, 40, 30);
        Raza1 Thanos = new Raza1("Thanos", 150, 50, 30, 10);
        
       
        
      

        System.out.println("Luchadores listos para la pelea: ");
        System.out.println(" ");
        System.out.println("1. Iron man");
        System.out.println("2. Thanos");
        System.out.println("3. Spider man");
        System.out.println("4. Thor");
        System.out.println(" ");
        System.out.println("Escoge tu luchador");
        int opc1 = sc.nextInt();
        Raza1 jugador1 = seleccionarLuchador(opc1);
        
        

        int opc2;

        switch (opc1) {
            case 1 -> {
                System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
                System.out.println("2. Thanos");
                System.out.println("3. Spider man");
                System.out.println("4. Thor");
                opc2 = sc.nextInt();
            }
            case 2 -> {
                System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
                System.out.println("1. Iron man");
                System.out.println("3. Spider man");
                System.out.println("4. Thor");
                opc2 = sc.nextInt();
            }
            case 3 -> {
                System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
                System.out.println("1. Iron man");
                System.out.println("2. Thanos");
                System.out.println("4. Thor");
                opc2 = sc.nextInt();
            }
            case 4 -> {
                System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
                System.out.println("1. Iron man");
                System.out.println("2. Thanos");
                System.out.println("3. Spider man");
                opc2 = sc.nextInt();
            }
            default -> {
                System.out.println("Opcion incorrecta, elige nuevamente.");
                return;
            }
        }

        Raza1 jugador2 = seleccionarLuchador(opc2);
        Raza1 jugador3 = seleccionarLuchador(opc2);
        Raza1 jugador4 = seleccionarLuchador(opc2);

       while (jugador1.getHp() > 0 && jugador2.getHp() > 0 && jugador3.getHp() > 0 && jugador4.getHp() > 0) {
    int dl1 = (int) (Math.random() * (6 - 1 + 1)) + 1;
    int dl2 = (int) (Math.random() * (6 - 1 + 1)) + 1;
    int dl3 = (int) (Math.random() * (6 - 1 + 1)) + 1;
    int dl4 = (int) (Math.random() * (6 - 1 + 1)) + 1;

    System.out.println("Tiro de dados para turno.....");
    System.out.println("Dado luchador 1: " + dl1);
    System.out.println("Dado luchador 2: " + dl2);
    System.out.println("Dado luchador 3: " + dl3);
    System.out.println("Dado luchador 4: " + dl4);
    System.out.println(" ");

    if (dl1 > dl2 && dl1 > dl3 && dl1 > dl4) {
        System.out.println("Gano " + jugador1.getNombre() + " pega:");
        System.out.println("Ataca: " + jugador1.getNombre());
        jugador1.atacarLuchador(jugador2);
        jugador1.atacarLuchador(jugador3);
        jugador1.atacarLuchador(jugador4);
        System.out.println(" ");
    } else if (dl2 > dl1 && dl2 > dl3 && dl2 > dl4) {
        System.out.println("Gano " + jugador2.getNombre() + " pega:");
        System.out.println("Ataca: " + jugador2.getNombre());
        jugador2.atacarLuchador(jugador1);
        jugador2.atacarLuchador(jugador3);
        jugador2.atacarLuchador(jugador4);
        System.out.println(" ");
    } else if (dl3 > dl1 && dl3 > dl2 && dl3 > dl4) {
        System.out.println("Gano " + jugador3.getNombre() + " pega:");
        System.out.println("Ataca: " + jugador3.getNombre());
        jugador3.atacarLuchador(jugador1);
        jugador3.atacarLuchador(jugador2);
        jugador3.atacarLuchador(jugador4);
        System.out.println(" ");
    } else {
        System.out.println("Gano " + jugador4.getNombre() + " pega:");
        System.out.println("Ataca: " + jugador4.getNombre());
        jugador4.atacarLuchador(jugador1);
        jugador4.atacarLuchador(jugador2);
        jugador4.atacarLuchador(jugador3);
        System.out.println(" ");
    }

    if (jugador1.getHp() <= 0) {
        System.out.println("Gana " + jugador2.getNombre());
    } else if (jugador2.getHp() <= 0) {
        System.out.println("Gana " + jugador1.getNombre());
    } else if (jugador3.getHp() <= 0) {
        System.out.println("Gana " + jugador1.getNombre());
    } else {
        System.out.println("Gana " + jugador1.getNombre() );
    }

    System.out.println(" ");
    System.out.println(jugador1.getNombre() + ": " + jugador1.getHp());
    System.out.println(jugador2.getNombre() + ": " + jugador2.getHp());
    System.out.println(jugador3.getNombre() + ": " + jugador3.getHp());
    System.out.println(jugador4.getNombre() + ": " + jugador4.getHp());
}
    }

    private static Raza1 seleccionarLuchador(int opcion) {
        switch (opcion) {
            case 1 -> {
                return new Raza1("Iron man", 100, 40, 40, 30);
            }
            case 2 -> {
                return new Raza1("Thanos", 200, 50, 30, 10);
            }
            case 3 ->{
                return new Raza1("Spider man",300,40,60,15);
            }
            case 4 ->{
                return new Raza1("Thor",350,30,43,23);
            }
            
            default -> {
                System.out.println("Opcion incorrecta, elige nuevamente.");
                throw new IllegalArgumentException("Opcion incorrecta");
            }
        }
    }
    }
    

