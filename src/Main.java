
//Question 1 - FizzBuzz

/*Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz";
  for multiples of 5, print "Buzz", and for numbers that are both multiples of 3 and 5, print "FizzBuzz"*/


public class Main {

    public static void main(String[] args) {

        for (int i =1; i<= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if ( i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }

        }
    }
}



// Question 2 - Fibonacci Sequence

/*Write a program to generate the Fibonacci Sequence up to 100*/

public class Main {
    public static void main(String[] args) {
        int n=100;
        int a = 0,b=1;

        System.out.println("Fibonacci Sequence up to 100");
        System.out.print(a + " " +b+ " ");

        while (a + b <=n){
            int next = a+ b;
            System.out.print(next + " ");
            a = b;
            b=next;
        }
    }
}




// Question 3 - Power of Two

/*Write a program that takes an integer as input and returns true if the input is a power of two*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean powerof2 = checkpowerof2(num);

        if (powerof2) {
            System.out.println(num +" True");
        } else {
            System.out.println(num + " False");
        }
    }
    public static boolean checkpowerof2 (int num){
        if (num <=0){
            return false;
        }
        return (num & (num - 1)) ==0;
    }
}


 */
// Question 4 - Capitalize Words

/*Write a program that accepts a string as input, capitalizes the first letter of each word in the
 string, and the returns the result string*/

         import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        scanner.close();

        String capitalize = capitalizewords(input);
        System.out.println("Capitalize String: "+ capitalize);
    }

    public static String capitalizewords(String input) {
        StringBuilder result= new StringBuilder();
        String[] words = input.split("\\s+");

        for (String word:words){
            if (!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();

    }
}



// Question 5 - Reverse Integer

/*Write a program that takes an integer as input and returns an integer with reversed digit ordering*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversenumber = reverseInteger(num);
        System.out.println("Reversed Integer: " + reversenumber);
    }
    public static int reverseInteger (int num) {
        int reversenumber = 0;
        while (num !=0){
            int digit = num % 10;
            reversenumber = reversenumber*10+digit;
            num /=10;
        }
        return reversenumber;
    }
}



// Question 6 - Count vowels

/* Write a program that counts the number of vowels in a sentence*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int countvowel = vowelscount(sentence);
        System.out.println("Number of vowels in the sentence is: " + countvowel);
    }
    public static int vowelscount (String sentence){
        int count =0;
        for (int i=0;i<sentence.length();i++){
            char ch=Character.toLowerCase(sentence.charAt(i));
            if (ch== 'a'|| ch=='e' || ch== 'i'|| ch=='0' ||ch== 'u'){
                count++;
            }
        }
        return count;
    }
}