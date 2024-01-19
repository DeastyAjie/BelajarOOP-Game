package dasar;

public class Game {

    public static void main(String[] args) { // bisa di run krn ada main method
        //gunanya class ini buat manggil, kalau terjadi error, gak benerin dri awal

        // membuat objek player
        player Hero = new player(); //samain kyk code p nya player, nama player nya bebas, asal disamakan class dengan player

        //mengisi atribut player
        Hero.name = "Hero"; //pake petani, karena petani adalah player ( bisa di jalanin)
        Hero.speed = 78;
        Hero.healthPoin = -5;
        Hero.armor = 10;
        Hero.attack = 20;
        Hero.damage = 100;

        //menjalankan method
        Hero.run(); //run nya dipanggil dari objek player

        if (Hero.isDead()) {
            System.out.println("Game Over!");
        } else {
            System.out.println("Player tidak mati");
        }

    }

}
