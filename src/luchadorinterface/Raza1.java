/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author Aprendiz
 */
public class Raza1 implements Skills, Magrase {

    String Nombre;
    int Hp;
    int atk;
    int defenza;
    int magia;
    private boolean afectadoPorHielo;

    public Raza1(String Nombre, int Hp, int atk, int defenza, int magia) {
        this.Nombre = Nombre;
        this.Hp = Hp;
        this.atk = atk;
        this.defenza = defenza;
        this.magia = magia;
        this.afectadoPorHielo = false;
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
    public int Escapar() {
        System.out.println("Escapando del rival...");
        return 0;
    }

    @Override
    public int Atacar(Raza1 oponente) {

        int danioAtaque = this.atk;
        System.out.println(this.Nombre + " realiza un ataque simple. Danio: " + danioAtaque);

        return danioAtaque;

    }

    @Override
    public int Dobleataque(Raza1 oponente) {
        int danioDobleAtaque = this.atk * 2;
        System.out.println(this.Nombre + " realiza un ataque doble a " + oponente.getNombre() + ". Danio: " + danioDobleAtaque);
        oponente.recibirDanio(danioDobleAtaque);
        return danioDobleAtaque;
    }

    @Override
    public int curar(Raza1 oponente) {

        int curacion = this.magia + 50;
        this.Hp += curacion;
        System.out.println(this.Nombre + " se esta curando... Curacion: " + curacion);
        return curacion;

    }

    @Override
    public int Robovida(Raza1 oponente) {
        int vidaRobada = this.magia / 2;
        this.Hp += vidaRobada;
        System.out.println("Robando vida al oponente... Vida robada: " + vidaRobada);
        return vidaRobada;
    }

    @Override
    public int Ataquehielo(Raza1 oponente) {
        int danioAtaqueHielo = this.magia + 30;
        System.out.println(this.Nombre + " realiza un ataque de hielo a su oponente. Danio: " + danioAtaqueHielo);

        return danioAtaqueHielo;
    }

    @Override
    public int Ataquefuego(Raza1 oponente) {
        int dano = this.atk + 20;
        oponente.recibirDanio(dano);
        System.out.println(this.getNombre() + " lanza un ataque de fuego y causa " + dano + " de danio a " + oponente.getNombre());
        return dano;
    }

    public void mostrar() {
        System.out.println("NOMBRE:" + this.Nombre);
        System.out.println("HP: " + this.Hp);
        System.out.println("ATK: " + this.atk);
        System.out.println("DEF: " + this.defenza);
        System.out.println("DES: " + this.magia);
    }

    private void recibirDanio(int danio) {

        this.Hp -= danio;
        if (this.Hp < 0) {
            this.Hp = 0;
        }
        System.out.println(this.Nombre + " recibe " + danio + " puntos de danio. Puntos de vida restantes: " + this.Hp);
    }

    public void atacarLuchador(Raza1 luchador) {

        System.out.println("Tiro de dados ......");
        int dl1 = (int) (Math.random() * (20 - 1 + 1)) + 1;
        int dl2 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        System.out.println("dado 1:" + dl1);
        System.out.println("dado 2:" + dl2);
        System.out.println(" ");

        this.setDefenza(this.defenza + dl1);
        luchador.setDefenza(luchador.defenza + dl2);

        this.setAtk(this.atk + dl1);
        luchador.setAtk(luchador.atk + dl2);

        System.out.println("Nombre: " + this.Nombre + " " + "Atk: " + this.atk + " " + "Des: " + this.defenza);
        System.out.println("Nombre: " + luchador.Nombre + " " + "Atk: " + luchador.atk + " " + "Des: " + luchador.defenza);
        System.out.println(" ");

        if (this.defenza > luchador.defenza) {
            luchador.Hp = luchador.Hp - (luchador.atk - this.magia);
            luchador.mostrar();

        } else if (this.defenza < luchador.defenza) {
            this.Hp = this.Hp - (this.atk - luchador.magia);
            this.mostrar();

        }

    }

    @Override
    public int Ataque(Raza1 oponente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
