package ro.sda.advanced._3_composition;

/* *  Create a class Motherboard with the following fields: model, manufacturer, bios (all are String),
        *  ramSlots and cardSlots (both are int)
        *
        *  The class should have:
        *  - a constructor
        *  - getters for all the fields
        *  - a method loadProgram(programName) which will print a message when a program is loaded*/
public class Motherboard {
    private String model;
    private String manufacturer;
    private String bios;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program name: " + programName);

    }


}
