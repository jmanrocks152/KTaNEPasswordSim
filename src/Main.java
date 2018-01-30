import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by jj.phung on 1/28/2018.
 */

//Features to be added
//Ensuring that duplicate characters will not appear in the same column
//Ensuring that no other passwords besides the selected password will be in the garbage letters
//Adding a timer to tell the user how long it took for them to solve the module
//Transcribe the passwordInt switch to an ArrayList and pull indexes from there
//Make a data file with all the possible passwords that the main pulls from
//Figure out a way to give up and tell the password and the time you took trying to solve it

public class Main {
    public static void main(String[] args) {
        int passwordInt;
        int passwordCharPos;
        Random random = new Random();
        passwordInt = random.nextInt((35 - 1) + 1) + 1;
        int alphabetRNG = random.nextInt((25 - 0) + 1) + 0;
        String input;
        Scanner scanner = new Scanner(System.in);
        Boolean passwordSolved = false;
        Boolean passwordGivenUp = false;
        String password = "";
        char passwordChars[];
        int charPosition1Index = 0;
        int charPosition2Index = 0;
        int charPosition3Index = 0;
        int charPosition4Index = 0;
        int charPosition5Index = 0;
        ArrayList<Character> charPosition1 = new ArrayList<>();
        ArrayList<Character> charPosition2 = new ArrayList<>();
        ArrayList<Character> charPosition3 = new ArrayList<>();
        ArrayList<Character> charPosition4 = new ArrayList<>();
        ArrayList<Character> charPosition5 = new ArrayList<>();
        ArrayList<Integer> passwordCharPositions = new ArrayList<>();
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<Integer> usedChars = new ArrayList<>();

        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        for (int i = 0; i < 5; i++) {
            charPosition1.add(i, '0');
        }

        for (int i = 0; i < 5; i++) {
            charPosition2.add(i, '0');
        }

        for (int i = 0; i < 5; i++) {
            charPosition3.add(i, '0');
        }

        for (int i = 0; i < 5; i++) {
            charPosition4.add(i, '0');
        }

        for (int i = 0; i < 5; i++) {
            charPosition5.add(i, '0');
        }

        switch (passwordInt) {
            case 1:
                password = "about";
                break;
            case 2:
                password = "after";
                break;
            case 3:
                password = "again";
                break;
            case 4:
                password = "below";
                break;
            case 5:
                password = "could";
                break;
            case 6:
                password = "every";
                break;
            case 7:
                password = "first";
                break;
            case 8:
                password = "found";
                break;
            case 9:
                password = "great";
                break;
            case 10:
                password = "house";
                break;
            case 11:
                password = "large";
                break;
            case 12:
                password = "learn";
                break;
            case 13:
                password = "never";
                break;
            case 14:
                password = "other";
                break;
            case 15:
                password = "place";
                break;
            case 16:
                password = "plant";
                break;
            case 17:
                password = "point";
                break;
            case 18:
                password = "right";
                break;
            case 19:
                password = "small";
                break;
            case 20:
                password = "sound";
                break;
            case 21:
                password = "spell";
                break;
            case 22:
                password = "still";
                break;
            case 23:
                password = "study";
                break;
            case 24:
                password = "their";
                break;
            case 25:
                password = "there";
                break;
            case 26:
                password = "these";
                break;
            case 27:
                password = "thing";
                break;
            case 28:
                password = "think";
                break;
            case 29:
                password = "three";
                break;
            case 30:
                password = "water";
                break;
            case 31:
                password = "where";
                break;
            case 32:
                password = "which";
                break;
            case 33:
                password = "world";
                break;
            case 34:
                password = "would";
                break;
            case 35:
                password = "write";
                break;
            default:
                System.out.println("Something happened with the RNG D:");
                break;
        }

        passwordChars = password.toCharArray();

        for (int i = 0; i < 5; i++) {
            passwordCharPos = random.nextInt((4 - 0) + 1) + 0;
            passwordCharPositions.add(passwordCharPos);
        }

        charPosition1.add(passwordCharPositions.get(0), passwordChars[0]);
        charPosition2.add(passwordCharPositions.get(1), passwordChars[1]);
        charPosition3.add(passwordCharPositions.get(2), passwordChars[2]);
        charPosition4.add(passwordCharPositions.get(3), passwordChars[3]);
        charPosition5.add(passwordCharPositions.get(4), passwordChars[4]);

        for (int i = 0; i < 6; i++) {
            //TODO: Add check for the alphabetRNG here and roll again if necessary
            if (charPosition1.get(i) == '0') {
                charPosition1.remove(i);
                charPosition1.add(i, alphabet.get(random.nextInt(((25 - 0) + 1)) + 0));
            }
            if (charPosition2.get(i) == '0') {
                charPosition2.remove(i);
                charPosition2.add(i, alphabet.get(random.nextInt(((25 - 0) + 1)) + 0));
            }
            if (charPosition3.get(i) == '0') {
                charPosition3.remove(i);
                charPosition3.add(i, alphabet.get(random.nextInt(((25 - 0) + 1)) + 0));
            }
            if (charPosition4.get(i) == '0') {
                charPosition4.remove(i);
                charPosition4.add(i, alphabet.get(random.nextInt(((25 - 0) + 1)) + 0));
            }
            if (charPosition5.get(i) == '0') {
                charPosition5.remove(i);
                charPosition5.add(i, alphabet.get(random.nextInt(((25 - 0) + 1)) + 0));
            }
        }

        System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");

        while (passwordSolved == false && passwordGivenUp == false) {
            input = scanner.next();
            if(input.equals("1")) {
                charPosition1Index++;
                if(charPosition1Index > 5)
                    charPosition1Index = 0;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("1'")) {
                charPosition1Index--;
                if(charPosition1Index < 0)
                    charPosition1Index = 5;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("2")) {
                charPosition2Index++;
                if(charPosition2Index > 5)
                    charPosition2Index = 0;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("2'")) {
                charPosition2Index--;
                if(charPosition2Index < 0)
                    charPosition2Index = 5;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("3")) {
                charPosition3Index++;
                if(charPosition3Index > 5)
                    charPosition3Index = 0;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("3'")) {
                charPosition3Index--;
                if(charPosition3Index < 0)
                    charPosition3Index = 5;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("4")) {
                charPosition4Index++;
                if(charPosition4Index > 5)
                    charPosition4Index = 0;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("4'")) {
                charPosition4Index--;
                if(charPosition4Index < 0)
                    charPosition4Index = 5;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("5")) {
                charPosition5Index++;
                if(charPosition5Index > 5)
                    charPosition5Index = 0;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals("5'")) {
                charPosition5Index--;
                if(charPosition5Index < 0)
                    charPosition5Index = 5;
                System.out.println("|" + charPosition1.get(charPosition1Index) + "|" + charPosition2.get(charPosition2Index) + "|" + charPosition3.get(charPosition3Index) + "|" + charPosition4.get(charPosition4Index) + "|" + charPosition5.get(charPosition5Index) + "|");
            }
            if(input.equals(password)) {
                passwordSolved = true;
            }
            //TODO: Fix the "give up" if statement"
//            if(input.equals("give up")) {
//                System.out.println("The password was " + password + ".");
//                passwordGivenUp = true;
//            }
        }
//        if(passwordGivenUp == false){
//            System.out.println("Module Solved!");
//        }
//        else {
//
//        }
    }
}