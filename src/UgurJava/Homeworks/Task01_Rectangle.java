package UgurJava.Homeworks;

public class Task01_Rectangle {
/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
    private int width, length;

    public Task01_Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double cevre(){
        double cevre=(width+length)*2;
        return cevre;
    }
    public double alan(){
        double alan=width*length/2;
        return alan;
    }
}
