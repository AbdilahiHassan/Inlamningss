import java.util.ArrayList;
import java.util.Scanner;

public class CountClass {

    private  String Rader;
    private String Tecken;
    private  String stopp;

    public CountClass(String AntalRader, String AntalTecken, String Stop) {
        Rader = AntalRader;
        Tecken = AntalTecken;
        stopp = Stop;
    }

    public String getAntalRader() {
        return  Rader;
    }

    public String getAntalTecken()
    {
        return  Tecken;
    }

    public String getStop()
    {
        return  stopp;
    }


    public void CountMethod() {
        Scanner scann = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Write what you want write");
        String input = scann.nextLine();

        while (!input.equals("stop")) {
            list.add(input);
            input = scann.nextLine();
        }
        int numChars = 0;
        for (String s : list){
            numChars += s.length();
        }
        System.out.println("AntalRader är: " + list.size());
        System.out.println("AntalTecken är: " + numChars);
    }

}

