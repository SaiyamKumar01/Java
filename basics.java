public class basics {
    public static void main(String args[]){
        //println -> next line
        System.out.println("Java Programming Language");
        System.out.println("Java is OOP Language");
        System.out.println("Java is Portable Language");
    
        //print -> same line
        System.out.print("Hello");
        System.out.println("World!");
        
        //print numbers
        System.out.println(33);
        System.out.println(3345);
        System.out.println(56798);

        //operations on numbers
        System.out.println(5+7);
        System.out.println(7*5);

        /*
        Multiline Comment */

        //Java Variables
        int num = 15;
        System.out.println(num);

        String name = "Saiyam";
        System.out.println(name);

        boolean val = true;
        System.out.println(val);

        char a = 'c';
        System.out.println(a);

        float number = 5.9f;
        System.out.println(number);

        //Cant change the Value
        final int n = 56; 
        System.out.println(n);

        //Sum of variables
        String firstname = "Saiyam";
        String lastname = "Kumar";
        String fullname = firstname + lastname;

        System.out.print(fullname);

        int x = 5;
        int y = 10;
        //+ is for add operation
        System.out.println("The sum of x and y : "+(x+y));
        //+ is for concatition
        System.out.println("The sum of x and y : "+x+y);

        int q=50,r=40,s=30;
        System.out.println("The sum of q,r,s :"+(q+r+s));
        
        //INFO College Student
        String myname = "Saiyam Kumar";
        String uid = "24bcs10108";
        int age = 19;
        float studentfee = 75.44f;
        char grade = 'A';

        System.out.println("Name of the student :"+myname);
        System.out.println("uid of the student :"+uid);
        System.out.println("Age of the student :"+age);
        System.out.println("Studentfee of the student :"+studentfee);
        System.out.println("Grade of the student :"+grade);

        //Area of Rectangle
        int length = 5;
        float width = 4.5f;
        float area;
        area = length*width;
        System.out.println("Area of Rectangle :"+area);

    }
}
