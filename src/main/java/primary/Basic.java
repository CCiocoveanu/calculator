package primary;

import interfata.Calculator;

public class Basic implements Calculator {


    public Basic(){
        // are 10 flaoting points
        // %.10d;
        // DecimalFormat df = new DecimalFormat("#.0000000000");
    }
    public Basic(String s){
        // are n flaoting points
        String n = s;
    }

    public long add(int...numbers){
        long result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }
    public long add(long...numbers){
        long result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
    public double add(double...numbers){
        double result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }



}
