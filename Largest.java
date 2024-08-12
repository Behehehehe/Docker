public class Largest  
{  
    public static void main(String[] args)   
    {  
        int a = 10, b = 20, c = 30; // Assign values directly
        int largest, temp;  

        // comparing a and b and storing the largest number in a temp variable  
        temp = a > b ? a : b;  
        // comparing the temp variable with c and storing the result in the variable  
        largest = c > temp ? c : temp;  
        // prints the largest number  
        System.out.println("The largest number is: " + largest);  
    }  
}
