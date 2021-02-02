package org.launchcode.studio7;

public abstract class BaseDisc {
    //variables
    private String name;
    private int capacityInMb;
    private String contents;
    private String discType;

    public BaseDisc(String name, String contents){
        this.name = name;
        this.contents = contents;
    }

    //methods??

    public abstract void reportData();
    public abstract void erase();

}
