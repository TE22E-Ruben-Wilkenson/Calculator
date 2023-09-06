import java.util.Scanner;
import java.io.Console;
import java.lang.Math;
import java.util.Arrays;

public class App {
    String t_input;
    public static void main(String[] args) throws Exception {
    
    App var = new App();
     Console cnsl = System.console();

    Scanner tan = new Scanner(System.in);

    boolean running = false;

    System.out.print("Do you want to run the program?(y/n):     ");
    var.t_input = tan.nextLine();

    if (var.t_input.equals("y" )){
        running = true;
    }

    else if (var.t_input.equals("n")){
        running = false;
    }




while (running = true){

    System.out.print("Enter(Type exit to exit the program):    ");
    var.t_input = tan.nextLine();
    
    if (var.t_input.equals("exit")){
        System.exit(0);
    }

    else{
        {}
    }


    // Ta en input som array
    String[] arr = null;
    arr = var.t_input.split(" ");

    //gör kopior
    String[] arr_int = new String[(int)Math.ceil((double)arr.length/2)];
    String[] arr_string = new String[(int)Math.floor((double)arr.length/2)];
    
    // fill kopior
    for(int i = 0, k = 0, j = 0; i < arr.length; i++){
        
        if (i%2 == 0 || i == 0){

            arr_int[k] = arr[i];
            k ++;
                            
        }
        else if(i%2 != 0){

            arr_string[j] = arr[i];
            j ++;
            
        }
        else{
            {}
        }
    }

    // kalkylera resultat
    double result = Integer.parseInt(arr_int[0]);

    for (int i = 1; i < arr_string.length + 1; i++){

        if (arr_string[i-1].equals("+"))
            result = result + Integer.parseInt(arr_int[i]);

        if (arr_string[i-1].equals("-"))
            result = result - Integer.parseInt(arr_int[i]);
            
        if (arr_string[i-1].equals("/"))
            result = result / (double)(Integer.parseInt(arr_int[i]));
        
        if (arr_string[i-1].equals("*"))
            result = result * Integer.parseInt(arr_int[i]);

    }

    System.out.println(result);

    }
}
}



