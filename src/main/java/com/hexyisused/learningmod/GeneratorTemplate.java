package com.hexyisused.learningmod;

public class GeneratorTemplate {
    private int maxPower = 4000;
    private int storedPower = 0;

    public GeneratorTemplate() {

    }

    //when a block around it is updated check if it is a block that can input power(machines, cables, batteries, etc.) if so give power

    public void GivePower(/*machine*/ machine) {
        int transfer = machine.getTransferRate();
        storedPower -= transfer;
        machine.addPower(transfer);
    }
}
