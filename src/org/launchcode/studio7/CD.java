package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    int capacity;
    String dataType;

    public CD(String name, String contents) {
        super(name, contents);
        this.capacity = 700;
        this.dataType = "CD";
    }

    @Override
    public void reportData() {
        System.out.println("information");
    }

    @Override
    public void erase() {
        System.out.println("Reformatting..");
    }

    @Override
    public void spinDisc() {
        System.out.println("");
    }

    @Override
    public void readDisc() {
        System.out.println("");
    }

    @Override
    public void writeDisc() {
        System.out.println("");
    }

    @Override
    public void storeData() {
        System.out.println("");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
