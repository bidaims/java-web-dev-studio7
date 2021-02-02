package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    int capacity;
    String dataType;
    public DVD(String name, String contents) {
        super(name, contents);
        this.capacity = 4500;
        this.dataType = "DVD";
    }

    @Override
    public void reportData() {

    }

    @Override
    public void erase() {

    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void readDisc() {

    }

    @Override
    public void writeDisc() {

    }

    @Override
    public void storeData() {

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
