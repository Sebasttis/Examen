/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author Aprendiz
 */
public class Raza3 implements Magrase {

    private String Nombre;
    private int Hp;
    private int atk;
    private int defenza;
    private int magia;

    public Raza3(String Nombre, int Hp, int atk, int defenza, int magia) {
        this.Nombre = Nombre;
        this.Hp = Hp;
        this.atk = atk;
        this.defenza = defenza;
        this.magia = magia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefenza() {
        return defenza;
    }

    public void setDefenza(int defenza) {
        this.defenza = defenza;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    @Override
    public int curar() {
        System.out.println("Curando...");
        return 0;
    }

    @Override
    public int Robovida() {
        System.out.println("Robando vida al oponente...");
        return 0;

    }

    @Override
    public int Ataque() {
        System.out.println("Atacando...");
        return 0;
    }

    @Override
    public int Ataquehielo() {
        System.out.println("Ataque de hielo...");
        return 0;
    }

    @Override
    public int Ataquefuego() {
        System.out.println("Ataque de fuego...");
        return 0;
    }

}