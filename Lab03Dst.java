public class Lab03Dst{
    public static void main(String[] args){
        System.out.println("Lab 03D\n");
        
        int Int1 = 15;
        int Int2 = 42; 
        int Int3 = 13;
        int Int4 = 99;
        int Int5 = 24;
        
        double D1 = 12.34;
        double D2 = 23.45;
        double D3 = 34.56;
        double D4 = 56.78;
        double D5= 67.89;
        
        int intSum = Int1 + Int2 + Int3 + Int4 + Int5;
        int intMean = (Int1 + Int2 + Int3 + Int4 + Int5)/5;
        
        
        double dSum = D1 + D2 + D3 + D4 + D5;
        double dMean = (D1 + D2 + D3 + D4 + D5)/5;
        
        
       System.out.println("Integer 1: " + Int1);
       System.out.println("Integer 2: " + Int2);
       System.out.println("Integer 3: " + Int3);
       System.out.println("Integer 4: " + Int4);
       System.out.println("Integer 5: " + Int5 + "\n");
       
       System.out.println("Integer Sum: " + intSum);
       System.out.println("Integer Average: " + intMean + "\n");
       
       System.out.println("Real Number 1: " + D1);
       System.out.println("Real Number 2: " + D2);
       System.out.println("Real Number 3: " + D3);
       System.out.println("Real Number 4: " + D4);
       System.out.println("Real Number 5: " + D5 + "\n");
       
       System.out.println("Real Number Total: " + dSum);
       System.out.println("Real Number Average: " + dMean + "\n");
      
    }
}