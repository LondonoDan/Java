class Datos{
    public static void main(String[] args){


    int cantidad_billetes= 540;
    int Billete_100=0;
    int Billete_50=0;
    int Billete_20=0;
    int Billete_10=0;
    int Billete_5=0;
    System.out.println("cantidad "+cantidad_billetes);

    if (cantidad_billetes > 100){
        Billete_100= cantidad_billetes/100;
        cantidad_billetes = cantidad_billetes-(Billete_100*100);
    }
    if (cantidad_billetes > 50){
        Billete_50= cantidad_billetes/50;
        cantidad_billetes = cantidad_billetes-(Billete_50*50);
    }
    if (cantidad_billetes > 20){
        Billete_20= cantidad_billetes/100;
        cantidad_billetes = cantidad_billetes-(Billete_20*20);
    }
    if (cantidad_billetes > 10){
        Billete_10= cantidad_billetes/10;
        cantidad_billetes = cantidad_billetes-(Billete_10*10);
    }
    if (cantidad_billetes > 5){
        Billete_5= cantidad_billetes/5;
        cantidad_billetes = cantidad_billetes-(Billete_5*5);
    }
    System.out.println("Se utilizan "+Billete_100+ " de 100 ");
    System.out.println("Se utilizan "+Billete_50+ " de 50 ");
    System.out.println("Se utilizan "+Billete_20+ " de 20 ");
    System.out.println("Se utilizan "+Billete_10+ " de 10 ");
    System.out.println("Se utilizan "+Billete_5+ " de 5 ");
    
 }

}
