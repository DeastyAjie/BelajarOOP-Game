package dasar;

public class player {
  // gaak bisa di run krn gak ada main method, bisa run di class game
    
    //definisi atribut 
    String name;
    int speed; // int speed, healthPoint;
    int healthPoin;
    int damage;
    int armor;
    int attack;
    // tambahin attack, damage (besar/kecilnya) int, defense/bertahan, tameng (besar kecil) (void semua)
    
    //definisi method run
    void run(){
        System.out.println(name +" is running. . .");
        System.out.println("Speed: "+ speed); // peletakannya
        System.out.println(damage+ ", sakit bro");
        System.out.println( "yaelaah " + armor + " segini doang nih?");
        System.out.println("apa yah cuma " + attack + " doang");
    }
    
    //definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){ 
        if(healthPoin <= 0)return true;
        return false;
    }
    // else{
    //return false;
}
