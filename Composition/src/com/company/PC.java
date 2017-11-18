package com.company;

/**
 * @author Deepshikha chaudhary on 11/18/2017
 */
public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case aCase;

    public PC(Motherboard motherboard, Monitor monitor, Case aCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.aCase = aCase;
    }

    public void powerUp(){
        aCase.pressPowerButton();
        motherboard.loadProgram("Linux RHEL 7.0");
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1500, 50,"blue");
    }
}
