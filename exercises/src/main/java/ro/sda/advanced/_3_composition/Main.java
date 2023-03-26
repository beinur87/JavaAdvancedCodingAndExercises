package ro.sda.advanced._3_composition;
// prop OOP: inheritance, polymorphism, abstractisation, encapsulation

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(new Monitor("541X","DELL","12",new Resolution(1080,1920)),
                new Case("220B","HP","ATX",new Dimensions(35,50,30)));


        pc.powerUp();
        pc.drawLogo();

    }
}
