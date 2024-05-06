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

        // Computer computerObj = new Computer();
        // computerObj.playmusic();
        // String str = computerObj.getPen(55);
        // System.out.println(str);


        // Students studentsObj1 = new Students();
        // Students studentsObj2 = new Students();
        // Students studentsObj3 = new Students();


        //  studentsObj1.name = "Abeeb";
        //  studentsObj1.mark = 43;
        //  studentsObj1.rollNo =1;

        //  studentsObj2.name = "Kaola";
        //  studentsObj2.mark =12;
        //  studentsObj2.rollNo = 7;

        //  studentsObj3.name = "mercy";
        //  studentsObj3.mark =80;
        //  studentsObj3.rollNo =11;

        //  Students studentsArray[] = new Students[3];
        //  studentsArray[0] = studentsObj1;
        //  studentsArray[1] = studentsObj2;
        //  studentsArray[2] = studentsObj3;
        


        //  for(int i=0; i<studentsArray.length; i++){

        //     System.out.println(studentsArray[i].name + " " + studentsArray[i].mark);

        //  }




        // Mobile mobileObj1 = new Mobile();
        // Mobile mobileObj2 = new Mobile();

        // mobileObj1.name= "Galaxy II";
        // mobileObj1.brand="Samsung";
        // mobileObj1.price=34;

        // mobileObj2.name = "Redmi Note 11";
        // mobileObj2.brand="Xiaomi";
        // mobileObj2.price=19;

        // mobileObj1.showMobile();
        // mobileObj2.showMobile();


            Human humanObj = new Human();
            Human humanObj2 = new Human();
            Human humanObj3 = new Human("Redmi Note", "granted", 222);

            // System.out.println()
            // humanObj.setAge(45);
            // humanObj.setName("Ade");
            // humanObj.setBrand("Android");
            System.out.println(humanObj2.getName() + " " + " bought " +  humanObj.getBrand() + " at" + humanObj.getAge());
            System.out.println(humanObj3.getName() + " " + " bought " +  humanObj.getBrand() + " at" + humanObj.getAge());
       
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

// class Computer{
//     public void playmusic() {
//         System.out.println("music playing");
//     }

//     public String getPen(int pencost) {
    
//         if(pencost >=6)
//             return "Your pen at the cost of " + pencost + " " + "is okay for use";
//         else{
//             return "Your pen at the cost of " + pencost + " " + "is not okay for use";
//         }    
//     }
// }

// class Students {
//     String name;
//     int rollNo;
//     int mark;
         

// }




// class Mobile{
//     String name;
//     String brand;
//     int price;

//     public void showMobile(){
//     System.out.println("Your phone name is " + name + " of the "+ brand + " brand " + " at a cheeper price of  " + " " + price);
//     }
// }

class Human {
    private String name;
    private String brand;
    private int age;

    public Human(String name, String brand, int age)
    {
        this.name = name;
        this.brand = brand;
        this.age = age;
    }

    public Human()
    {
        this.name = "Mike";
        this.brand = "NYSCORE";
        this.age = 23;
    }

    // public void setName(String n){
    //     name = n;
    // }


    // public void setBrand(String b){
    //     brand = b;
    // }

    // public void setAge(int a){
    //     age = a;
    // }
    public int getAge(){
    return age;
    }

   

    public String getName(){
       return name;
    }

    public String getBrand() {
        return brand;
    }


}