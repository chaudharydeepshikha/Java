package com.company;

/**
 * @author Deepshikha chaudhary on 11/18/2017
 */
public class Bed {

    private String style;
    private int pillar;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillar, int height, int sheets, int quilt) {
        this.style = style;
        this.pillar = pillar;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed -- > making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillar() {
        return pillar;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
