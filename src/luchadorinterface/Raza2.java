/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author Aprendiz
 */
public class Raza2 implements Skills {

    public String Nombrej;
    public int Hpj;
    public int atkj;
    public int defenzaj;
    public int magiaj;

    public Raza2(String Nombre, int Hp, int atk, int defenza, int magia) {
        this.Nombrej = Nombre;
        this.Hpj = Hp;
        this.atkj = atk;
        this.defenzaj = defenza;
        this.magiaj = magia;
    }

    public String getNombre() {
        return Nombrej;
    }

    public void setNombre(String Nombre) {
        this.Nombrej = Nombre;
    }

    public int getHp() {
        return Hpj;
    }

    public void setHp(int Hp) {
        this.Hpj = Hp;
    }

    public int getAtk() {
        return atkj;
    }

    public void setAtk(int atk) {
        this.atkj = atk;
    }

    public int getDefenza() {
        return defenzaj;
    }

    public void setDefenza(int defenza) {
        this.defenzaj = defenza;
    }

    public int getMagia() {
        return magiaj;
    }

    public void setMagia(int magia) {
        this.magiaj = magia;
    }

    @Override
    public int Escapar() {
        System.out.println("Escapando del rival...");
        return 0;
    }

    @Override
    public int Atacar() {
        System.out.println("Escapando del rival...");
        return 0;
    }

    @Override
    public int Dobleataque() {
        System.out.println("Doble ataque...");
        return 0;
    }
    public void mostrar() {
        System.out.println("NOMBRE:" + this.Nombrej);
        System.out.println("HP: " + this.Hpj);
        System.out.println("ATK: " + this.atkj);
        System.out.println("DEF: " + this.defenzaj);
        System.out.println("DES: " + this.magiaj);
    }
     public void atacarLuchador2(Raza2 luchador2) {

        System.out.println("Tiro de dados para destreza......");
        int dl1 = (int) (Math.random() * (20 - 1 + 1)) + 1;
        int dl2 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        System.out.println("dado 1:" + dl1);
        System.out.println("dado 2:" + dl2);
        System.out.println(" ");

       
        this.setDefenza(this.defenzaj + dl1);
        luchador2.setDefenza(luchador2.defenzaj + dl2);
        
        this.setAtk(this.atkj + dl1);
        luchador2.setAtk(luchador2.atkj + dl2);
        
        System.out.println("Nombre: " + this.Nombrej + " " + "Atk: " + this.atkj + " " + "Des: " + this.defenzaj);
        System.out.println("Nombre: " + luchador2.Nombrej + " " + "Atk: " + luchador2.atkj + " " + "Des: " + luchador2.defenzaj);
        System.out.println(" ");

        if (this.defenzaj > luchador2.defenzaj) {
            luchador2.Hpj = luchador2.Hpj - (luchador2.atkj - this.magiaj);
            luchador2.mostrar();

        } else if (this.defenzaj < luchador2.defenzaj) {
            this.Hpj = this.Hpj - (this.atkj - luchador2.magiaj);
            this.mostrar();

        }
        this.defenzaj = 60;
        luchador2.defenzaj = 60;
        this.atkj = 100;
        luchador2.atkj = 100;

    }

    
}