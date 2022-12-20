package edu.sdccd.cisc191.template;

public class genericValue<Type>
{
    //Type for any type you want to use
    Type valueToPrint;

    //now this is a generic class
    public genericValue(Type thingToPrint) {
        this.valueToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(valueToPrint);
    }
}