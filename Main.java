import java.awt.*;//import java awt
import java.awt.datatransfer.Clipboard; //import clipboard
import java.awt.datatransfer.StringSelection; //import string selection
import java.util.Random; //import random
import java.util.Scanner;//import scanner

public class Main { //requirement
    public static void main(String[] args) throws InterruptedException { //requirement
        Scanner ask_password = new Scanner(System.in); //input
        System.out.println("enter your password"); //output
        String password = ask_password.nextLine(); //set ask variable to normal variable
        if (password.equals("password")){//set the password here
            Scanner ask_user = new Scanner(System.in); //ask username
            String text; //I don't know why I made this. but I made the text below as variable.
            text = "set your username"; //set the text here
            System.out.println(text); //output of the text variable
            String user = ask_user.nextLine(); //ask username
            System.out.println("username:" + user); //println username
            System.out.println("Hello,"+user+" "+"thank you for downloading my software"); //user output
            System.out.println("Select the mode:"); //user output
            System.out.println("1:Normal calculator (decimal version/int version)"); //user output
            System.out.println("2:Calculator for π calculation"); //user output
            System.out.println("3:Calculate is it odd or even number"); //user output
            System.out.println("4:Generate random integers");//user output
            System.out.println("5:Power calculator");//user output
            System.out.println("6:Convert decimals to percentage");
            Scanner ask_mode = new Scanner(System.in); //set ask variable
            String mode = ask_mode.nextLine(); //set calc variable to ask variable
            if (mode.equals("1")) { //detect this condition
                System.out.println("Normal calculator selected"); //enable calculator mode
                System.out.println("choose the type:    +:addition,-:subtraction,*:multiplication,/:division"); //int
                Scanner ask_calculator_math_type = new Scanner(System.in); //set ask variable
                String calculation_type = ask_calculator_math_type.nextLine(); //ask the type of calculation
                System.out.println("calculation type selected"); //output for notify that calculation type was select
                System.out.println("please choose true:decimal(less accurate)/ false:only integers"); //boolean variable for select decimal or int
                Scanner ask_calculator_decimal_or_int_math_type = new Scanner(System.in); //get input of calculation type(int/decimals)
                boolean calculation_type_decimal_or_int = ask_calculator_decimal_or_int_math_type.nextBoolean(); //ask the type of calculation
                if (!calculation_type_decimal_or_int) { //get the condition of the calculation was false
                    System.out.println("integer calculation selected"); //user output
                    if (calculation_type.equals("+")) { //condition
                        System.out.println("you chose addition"); //addition
                        System.out.println("write down first integer"); //user output
                        Scanner ask_calculator_first_int = new Scanner(System.in); //ask for the first int
                        int calculation_first_int = ask_calculator_first_int.nextInt(); //set variable
                        System.out.println("write down second integer"); //user output
                        Scanner ask_calculator_second_int = new Scanner(System.in); //ask second int
                        int calculation_second_int = ask_calculator_second_int.nextInt(); //set variable for second int
                        int calculation_result; //create the int variable for result of the calculation
                        calculation_result = calculation_first_int + calculation_second_int; //get the sum of first and second int and set that value as the variable of result
                        System.out.println("result:" + calculation_result); //user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask for do you copy
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //use boolean and ask for true or false
                        if (clipboard_copy_boolean) { //the conditional of if clipboard was true
                            String clipboard_copy = Integer.toString(calculation_result); //set variable
                            StringSelection stringSelection = new StringSelection(clipboard_copy); //select string variable to copy
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //toolkit program line
                            clipboard.setContents(stringSelection, null); //set clipboard
                            System.out.println("copied to clipboard"); //user output
                        }
                        if (!clipboard_copy_boolean){ //conditional of if clipboard was false
                            System.out.println("skipped");//output skipped for the user
                        }
                    }
                    if (calculation_type.equals("-")) { //conditional of subtraction
                        System.out.println("you chose subtraction"); //subtraction
                        System.out.println("write down first integer"); //user output
                        Scanner ask_calculator_first_int = new Scanner(System.in); //ask for first int
                        Integer calculation_first_int = ask_calculator_first_int.nextInt(); //set variable
                        System.out.println("write down second integer"); //user output
                        Scanner ask_calculator_second_int = new Scanner(System.in); // ask second int
                        Integer calculation_second_int = ask_calculator_second_int.nextInt(); //set variable
                        int calculation_result; //make the variable for result
                        calculation_result = calculation_first_int - calculation_second_int; // subtract the first in and second int then get the final result value
                        System.out.println("result:" + calculation_result); //user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask for copy
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //boolean variable for the input
                        if (clipboard_copy_boolean) { //conditional of if clipboard was true
                            String clipboard_copy = Integer.toString(calculation_result); //set string of string variable
                            StringSelection stringSelection = new StringSelection(clipboard_copy);  //set variable
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //toolkit program line
                            clipboard.setContents(stringSelection, null); //set clipboard
                            System.out.println("copied to clipboard");//user output
                        }
                        if (!clipboard_copy_boolean){ //conditional of if clipboard was false
                            System.out.println("skipped"); //user output
                        } //stop
                    }
                    if (calculation_type.equals("*")) { //conditional of if the calculation type was multiplication
                        System.out.println("you chose multiplication"); //multiplication
                        System.out.println("write down first integer"); //user output
                        Scanner ask_calculator_first_int = new Scanner(System.in); //ask the first int
                        Integer calculation_first_int = ask_calculator_first_int.nextInt(); //set variable of first int
                        System.out.println("write down second integer"); //user output
                        Scanner ask_calculator_second_int = new Scanner(System.in); //ask second int variable
                        Integer calculation_second_int = ask_calculator_second_int.nextInt(); //set second int variable
                        int calculation_result; //create the result variable
                        calculation_result = calculation_first_int * calculation_second_int; //multiply first and second int together and get the final result value and set that value for the value variable
                        System.out.println("result:" + calculation_result); //user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask for clipboard
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //set clipboard variable
                        if (clipboard_copy_boolean) { //conditional of if clipboard is true
                            String clipboard_copy = Integer.toString(calculation_result); //convert int to string
                            StringSelection stringSelection = new StringSelection(clipboard_copy); //set string to copy
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                            clipboard.setContents(stringSelection, null); //copy
                            System.out.println("copied to clipboard"); //user output
                        }
                        if (!clipboard_copy_boolean){ //if clipboard is false
                            System.out.println("skipped"); //user output
                        }
                    }
                    if (calculation_type.equals("/")) { //if the calculation type was division
                        System.out.println("you chose division"); //division
                        System.out.println("write down first integer"); //user output
                        Scanner ask_calculator_first_int = new Scanner(System.in); //user input of first int
                        Integer calculation_first_int = ask_calculator_first_int.nextInt(); //set variable of first int
                        System.out.println("write down second integer"); //user output
                        Scanner ask_calculator_second_int = new Scanner(System.in); //get user input of second int
                        Integer calculation_second_int = ask_calculator_second_int.nextInt(); //set second int
                        int calculation_result; //create variable of result
                        calculation_result = calculation_first_int / calculation_second_int; //set result variable to first int divided by second int
                        int calculation_result_division; //output of int left
                        calculation_result_division = calculation_first_int % calculation_second_int; //set calculation result of division to first in % second int
                        if (calculation_result_division == 0){ //if result of division was 0 run the code below
                            System.out.println("result:" + calculation_result); //output the result
                        }else { //if it's not 0
                            System.out.println("result:" + calculation_result + " " + "and" + " " + calculation_result_division); //output special output of division
                        }
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask clipboard copy
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //get true or false
                        if (clipboard_copy_boolean) { //if the clipboard was true
                            String clipboard_copy = Integer.toString(calculation_result); //convert int to string
                            String clipboard_copy_division = Integer.toString(calculation_result_division); //convert division result to the string
                            StringSelection stringSelection = new StringSelection(clipboard_copy+ " and " +clipboard_copy_division); //the string to copy
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                            clipboard.setContents(stringSelection, null); //clipboard
                            System.out.println("copied to clipboard");//user output
                        }
                        if (!clipboard_copy_boolean){ //if the clipboard was false
                            System.out.println("skipped"); //user output
                        }
                    }
                }
                if (calculation_type_decimal_or_int) { //if the calculation by decimal was true run the program bellow
                    System.out.println("decimal calculation selected"); //user output
                    if (calculation_type.equals("+")) { //if the type was +
                        System.out.println("you chose addition with decimal");//addition with decimal
                        System.out.println("write down first number");//user output
                        Scanner ask_calculator_decimal_first_int = new Scanner(System.in); //ask the first int
                        Double calculation_decimal_first_int = ask_calculator_decimal_first_int.nextDouble(); //set first int variable
                        System.out.println("write down second number");//user output
                        Scanner ask_calculator_decimal_second_int = new Scanner(System.in);//ask second int
                        Double calculation_decimal_second_int = ask_calculator_decimal_second_int.nextDouble(); //set second int variable
                        double calculation_decimal_result = calculation_decimal_first_int + calculation_decimal_second_int; //get the sum of first and second decimal num
                        System.out.println("result:" + calculation_decimal_result);//result output
                        System.out.println("the result isn't accurate"); //user output for notify it's not accurate
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask to copy of clipboard or not
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //set clipboard variable
                        if (clipboard_copy_boolean) { //if the variable is true run the program below
                            String clipboard_copy = Double.toString(calculation_decimal_result); //convert the double to string
                            StringSelection stringSelection = new StringSelection(clipboard_copy); //select the string
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                            clipboard.setContents(stringSelection, null); //set clipboard
                            System.out.println("copied to clipboard"); //user output
                        }
                        if (!clipboard_copy_boolean){ //if the variable was false
                            System.out.println("skipped"); //user output
                        }
                    }
                    if (calculation_type.equals("-")) { //if the type of the calculation was subtraction run the program below
                        System.out.println("you chose subtraction with decimal");//subtraction with decimal
                        System.out.println("write down first number"); //user output
                        Scanner ask_calculator_decimal_first_int = new Scanner(System.in); //ask decimal
                        Double calculation_decimal_first_int = ask_calculator_decimal_first_int.nextDouble(); //ask for the first int variable
                        System.out.println("write down second number");//user output
                        Scanner ask_calculator_decimal_second_int = new Scanner(System.in);//ask for the second int variable
                        Double calculation_decimal_second_int = ask_calculator_decimal_second_int.nextDouble();//set second int variable
                        double calculation_decimal_result = calculation_decimal_first_int - calculation_decimal_second_int; //calculate  first int - second int and set the final result variable
                        System.out.println("result:" + calculation_decimal_result);//user output
                        System.out.println("the result isn't accurate"); //user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in); //ask for the clipboard
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean(); //get true or false
                        if (clipboard_copy_boolean) { //if the clipboard variable was true return the program below
                            String clipboard_copy = Double.toString(calculation_decimal_result); //convert double to string variable
                            StringSelection stringSelection = new StringSelection(clipboard_copy); //set variable of clipboard copy
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();//tool kit
                            clipboard.setContents(stringSelection, null); //copy on clipboard
                            System.out.println("copied to clipboard");//user output
                        }
                        if (!clipboard_copy_boolean){ //if the clipboard variable was false
                            System.out.println("skipped"); //user output
                        }
                    }
                    if (calculation_type.equals("*")) { //if the calculation type selection's result was multiplication run the program below
                        System.out.println("you chose multiplication with decimal");//multiplication with decimal
                        System.out.println("write down first number");//user input
                        Scanner ask_calculator_decimal_first_int = new Scanner(System.in);//ask the first int variable
                        Double calculation_decimal_first_int = ask_calculator_decimal_first_int.nextDouble();//set the variable of first int
                        System.out.println("write down second number"); //user output
                        Scanner ask_calculator_decimal_second_int = new Scanner(System.in); //ask second int variable
                        Double calculation_decimal_second_int = ask_calculator_decimal_second_int.nextDouble();//set second int variable
                        double calculation_decimal_result = calculation_decimal_first_int * calculation_decimal_second_int;//set the decimal result variable to first int * second int
                        System.out.println("result:" + calculation_decimal_result);//user output
                        System.out.println("the result isn't accurate");//user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in);//ask does user use the clipboard mode
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set true/false in the variable of the boolean (clipboard copy)
                        if (clipboard_copy_boolean) {//conditional of if the clipboard was true. then return the program below
                            String clipboard_copy = Double.toString(calculation_decimal_result); //convert double to string
                            StringSelection stringSelection = new StringSelection(clipboard_copy);//select the string
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();//tool kit
                            clipboard.setContents(stringSelection, null); //set the clipboard
                            System.out.println("copied to clipboard"); //user output
                        }
                        if (!clipboard_copy_boolean){ //if the clipboard
                            System.out.println("skipped"); //user input
                        }
                    }
                    if (calculation_type.equals("/")) { //conditional of if the calculation type was division run the program below
                        System.out.println("you chose division with decimal");//division with decimal
                        System.out.println("write down first number"); //user output
                        Scanner ask_calculator_decimal_first_int = new Scanner(System.in); //ask first int
                        Double calculation_decimal_first_int = ask_calculator_decimal_first_int.nextDouble();//set first int variable
                        System.out.println("write down second number");//user output
                        Scanner ask_calculator_decimal_second_int = new Scanner(System.in);//ask second int
                        Double calculation_decimal_second_int = ask_calculator_decimal_second_int.nextDouble();//set second int
                        double calculation_decimal_result = calculation_decimal_first_int / calculation_decimal_second_int; //set final result by doing the calculation of first int/second int
                        System.out.println("result:" + calculation_decimal_result);//user output
                        System.out.println("the result isn't accurate"); //user output
                        System.out.println("do you want to copy the result on clip board? true/false"); //copy
                        Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                        boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                        if (clipboard_copy_boolean) {//condition of if the clipboard was true
                            String clipboard_copy = Double.toString(calculation_decimal_result); //convert double to string
                            StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                            clipboard.setContents(stringSelection, null); //load clipboard
                            System.out.println("copied to clipboard");//user output
                        }
                        if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                            System.out.println("skipped");//user output
                        }
                    }
                }
            }
            if (mode.equals("2")){//detects if the mode was pi mode
                System.out.println("PIπ calculator selected");//user output
                System.out.println("please select the type:");//user output
                System.out.println("1:Perimeter of circle");//user output
                System.out.println("2:Area of circle");//user output
                System.out.println("3:Surface area of sphere");//user output
                System.out.println("4:Volume of sphere");//user output
                double PI = 3.14;
                Scanner ask_PI_calculator_calculation_type = new Scanner(System.in);//ask the calculation type
                int PI_calculator_calculation_type = ask_PI_calculator_calculation_type.nextInt();//set calculation type variable
                if (PI_calculator_calculation_type == 1){//if the variable was 1
                    System.out.println("selected perimeter of circle mode");//user output
                    System.out.println("hey! "+user+" write your range of circle");//user output
                    Scanner ask_PI_calculator_range = new Scanner(System.in); //ask the range of circle
                    double PI_calculator_range = ask_PI_calculator_range.nextDouble(); //set range to double
                    double PI_calculator_result = (PI_calculator_range * 2)* PI; //calculate the formula of this is  2πr
                    System.out.println("result:"+PI_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Double.toString(PI_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (PI_calculator_calculation_type == 2){//if the variable was 2
                    System.out.println("selected area of circle mode");//user output
                    System.out.println("hey!"+user+" please enter the range"); //user output
                    Scanner ask_PI_calculator_range = new Scanner(System.in); //ask range
                    double PI_calculator_range = ask_PI_calculator_range.nextDouble(); //set range variable to double
                    double PI_calculator_result = (PI_calculator_range * PI_calculator_range) * PI; //calculate πr²
                    System.out.println("result:"+PI_calculator_result); //user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Double.toString(PI_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (PI_calculator_calculation_type == 3){//if the variable was 3
                    System.out.println("selected surface area of sphere mode");//user output
                    System.out.println("hey!"+user+" please enter the range"); //user output
                    Scanner ask_PI_calculator_range = new Scanner(System.in); //ask range
                    double PI_calculator_range = ask_PI_calculator_range.nextDouble(); //set range variable to double
                    double PI_calculator_result = (4 * PI *(PI_calculator_range * PI_calculator_range * PI_calculator_range)) /3; //calculate 4/3 π r³
                    System.out.println("result:"+PI_calculator_result); //user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Double.toString(PI_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }

                }
                if (PI_calculator_calculation_type == 4){//if the variable was 4
                    System.out.println("selected volume of sphere mode");//user output
                    System.out.println("hey!"+user+" please enter the range"); //user output
                    Scanner ask_PI_calculator_range = new Scanner(System.in); //ask range
                    double PI_calculator_range = ask_PI_calculator_range.nextDouble(); //set range variable to double
                    double PI_calculator_result = (4 * PI *( PI_calculator_range * PI_calculator_range)); //calculate 4πr²
                    System.out.println("result:"+PI_calculator_result); //user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Double.toString(PI_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
            }
            if (mode.equals("3")){//detects if the mode was odd/even mode
                System.out.println("odd/even number mode selected"); //user output
                System.out.println("please write the integers you want to check");//user output
                Scanner ask_odd_or_even = new Scanner(System.in); //ask for the int
                int odd_or_even = ask_odd_or_even.nextInt(); //set the int
                int odd_or_even_result = odd_or_even %  2; //calculate
                if (odd_or_even_result == 0){ //if the result was 0 run the code below
                    System.out.println(odd_or_even+" is a even number");//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String odd_or_even_string = Integer.toString(odd_or_even); //convert double to string
                        String clipboard_copy = odd_or_even_string+" is even number";
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }else { //if the result wasn't 0 run the code below
                    System.out.println(odd_or_even+" is a odd number");//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String odd_or_even_string = Integer.toString(odd_or_even); //convert double to string
                        String clipboard_copy = odd_or_even_string+" is odd number";
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
            }
            if (mode.equals("4")){//if the mode was 4 run the program below
                System.out.println("random number generator selected");//user output
                Random rnd = new Random(); //random
                System.out.println("enter the amount of random number you want to generate");//user output
                Scanner ask_random_amount = new Scanner(System.in);//ask amount
                int random_amount = ask_random_amount.nextInt();//set amount
                System.out.println("please enter the maximum number");//user output
                Scanner ask_random_maximum_int = new Scanner(System.in);//ask maximum int
                int random_maximum_int = ask_random_maximum_int.nextInt();//set maximum int
                System.out.println("    random numbers");//user output
                System.out.println("----------------------");//user output
                for (int i = 0; i < random_amount; i++ ){ //repeat
                    int r = rnd.nextInt(random_maximum_int) + 1;//generate random
                    System.out.println(r + " ");//user output
                }
                System.out.println();//user output
                System.out.println("----------------------");//user output
            }
            if (mode.equals("5")){//if the mode was power calculation mode run the program below
                System.out.println("power calculation mode selected");//user output
            System.out.println("hey!"+user+" please enter the integer you want to power");//user output
                Scanner ask_power_calculator_int = new Scanner(System.in);//user input
                int power_calculator_int = ask_power_calculator_int.nextInt();//set variable
                System.out.println(power_calculator_int+" powered by what? (maximum 10)");//user output
                System.out.println("please enter here");//user output
                Scanner ask_power_calculator_power = new Scanner(System.in);//get user input
                int power_calculator_power = ask_power_calculator_power.nextInt();//set variable
                if (power_calculator_power == 1){//get the power
                    System.out.println("result:"+power_calculator_int);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_int);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean){ //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 2) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 3) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 4) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int + power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 5) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 6) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 7) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 8) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 9) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power == 10) {//get the power
                    int power_calculator_result = power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int * power_calculator_int; //calculate
                    System.out.println("result:" + power_calculator_result);//user output
                    System.out.println("do you want to copy the result on clip board? true/false"); //copy
                    Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                    boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                    if (clipboard_copy_boolean) {//condition of if the clipboard was true
                        String clipboard_copy;
                        clipboard_copy = Integer.toString(power_calculator_result);
                        StringSelection stringSelection = new StringSelection(clipboard_copy); //select sting
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                        clipboard.setContents(stringSelection, null); //load clipboard
                        System.out.println("copied to clipboard");//user output
                    }
                    if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                        System.out.println("skipped");//user output
                    }
                }
                if (power_calculator_power > 10){
                    System.out.println("power must be lower than 10");
                }
            }
            if (mode.equals("6")){//if the mode matches 6 run the program
                System.out.println("convert decimals to percentage");
                System.out.println("please enter the decimals you want to convert");
                Scanner ask_decimals_to_percentage_decimals = new Scanner(System.in);
                double decimals_to_percentage_decimals = ask_decimals_to_percentage_decimals.nextDouble();
                double decimals_to_percentage_result = decimals_to_percentage_decimals*100;
                System.out.println("result:"+decimals_to_percentage_result+"%");
                System.out.println("do you want to copy the result on clip board? true/false"); //copy
                Scanner ask_clipboard_copy = new Scanner(System.in);//ask for does user copy to clipboard
                boolean clipboard_copy_boolean = ask_clipboard_copy.nextBoolean();//set the variable to the answer above
                if (clipboard_copy_boolean) {//condition of if the clipboard was true
                    String clipboard_copy;
                    clipboard_copy = Double.toString(decimals_to_percentage_result);
                    StringSelection stringSelection = new StringSelection(clipboard_copy+"%"); //select sting
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //tool kit
                    clipboard.setContents(stringSelection, null); //load clipboard
                    System.out.println("copied to clipboard");//user output
                }
                if (!clipboard_copy_boolean) { //the condition of if the clipboard was false
                    System.out.println("skipped");//user output
                }
            }
        } else {
            System.out.println("incorrect password"); //return this if the password is incorrect
        }
        System.out.println("stopping..."); //output
        System.out.println("closing in 10sec..."); //user output
        Thread.sleep(10000); //wait 10 sec
        }
} //stop

