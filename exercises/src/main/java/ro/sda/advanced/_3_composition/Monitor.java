package ro.sda.advanced._3_composition;

/* *  Create a class Monitor which will have the following fields: model, manufacturer, size (all are String)
        *  and a field nativeResolution which is of type Resolution
        *
        * The class should have:
        * - a constructor
        * - getters for all the fields
        * - a method named drawPixelAt(int x, int y, String color) which will only print "Drawing pixel at ... in color ..."*/
public class Monitor {
    public String model;
    public String manufacturer;
    public String size;
    public Resolution nativeResolution;

    public Monitor(String model, String manufacturer, String size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.format("Drawing pixel at %s, %s in color %s",x,y,color);
    }


}
