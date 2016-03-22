package Clarence;



/**
 * Created by Ben on 3/21/2016.
 * Based entirely on /u/Gobbedyret's solution in the comments section of the problem:
 * Credit to Godbbedyret for the solution. I'm essentially rewriting his solution in Java.
 */
public class Clarence {

    private String input;

    public Clarence(String input) {
        this.input = input;
    }

    public String Output() throws Exception {
        if (input == null || input.length() == 0)
            throw new Exception("String isn't instantiated/contains no chars");

        return calculateDistance();
    }


    public String calculateDistance() { // helper of Output()
        double temp = 0.0;
        for (int i = 1; i < input.length(); i++) {
            temp += calculateDistanceHelper(input.charAt(i - 1), input.charAt(i));
        }                                                                   /* this for loop finds and adds
                                                                             * the distance between each character
                                                                             * in given ip address (String input)
                                                                             */
        return Double.toString(temp) + "cm";
    }

    public Double calculateDistanceHelper(char a, char b) { // helper of calculateDistance()

        double dx = Math.abs(index(b).charAt(0) - index(a).charAt(0)); // x coord of b - x coord of a
        double dy = Math.abs(index(b).charAt(1) - index(a).charAt(1)); // y coord of b - y coord of a
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)); // calculate distance using pythagorean theorem
    }

    public String index(char c) { // helper of calculateDistanceHelper
        String s = "123456789.0";
        return Integer.toString(s.indexOf(c) % 3) + Integer.toString(s.indexOf(c) / 3); /* x coord is index of char in String s mod 3
                                                                   * y coord is index of char in String s divided by 3
                                                                   */
    }
}