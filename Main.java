public class Main {
    public static void main(String[] args) {
        // variable declarations
        // int num1 = 3;
        // int num2 =5;
        

        // for loop
        // int numPrint = 5;
        // for(int i=0; i<=numPrint; i++) {
        //     System.out.println("print " + i);
        // };
        // System.out.println(num1 +  num2);
        // System.out.println("hello world! it's my first java code"); 



        // Calculator calculator = new Calculator();

        // int result =      calculator.add(6,8);
        //  System.out.println(result);

        Computer computerObj = new Computer();
        computerObj.playmusic();
        String str = computerObj.getPen(55);
        System.out.println(str);

    }
}


// class Calculator {
//     int num1;
//     int num2;
//     public int add(int num1, int num2) {
//  int result = num1 + num2;
//         return result;
//     }
  
// }

class Computer{
    public void playmusic() {
        System.out.println("music playing");
    }

    public String getPen(int pencost) {
    
        if(pencost >=6)
            return "Your pen at the cost of " + pencost + " " + "is okay for use";
        else{
            return "Your pen at the cost of " + pencost + " " + "is not okay for use";
        }    
    }
}