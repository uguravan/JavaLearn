package UgurJava.Denemeler;

public class doStuff {
    static String myStr="9009";
    public void doStuff(String str){
        //String myStr= str;
        int myNum=0;
        try {
            String myStr = str;
            myNum= Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {System.err.println("Error");}
        System.out.println(myStr + " " + myNum);
    }
    public static void main(String[] args) {
        doStuff obj = new doStuff();
        obj.doStuff("7007");
    }
}
