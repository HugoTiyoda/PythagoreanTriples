package br.com.hugotiyoda;

public class PitagTrios {

    public static void main(String[] args) {


        int a;
        int b;
        int c;
        int NmrLimit = 500;
        int NmrLimit2 = 499;



        {
            for (a = 1; a <= NmrLimit; a++)

                for (b = 1; b < NmrLimit2; b++) {

                    for (c = 1; c <= b; c++) {

                        if (a * a == b * b + c * c){
                            System.out.println("a:" + a + " " + "b:" + b + " " + "c:" + c);
                        }

                    }
                }
        }
    }
}



