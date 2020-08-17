import java.util.*;

class Question6 {
     static String Name;
    static int year;
    static String Address;

    public static void print() {
        System.out.print(Name +"           " + year + "                " + Address);
        System.out.println();
    }

    public static void main(String[] args) {
        // first object
        Question6 emp1 = new Question6();
        Question6 emp2 = new Question6();
        Question6 emp3 = new Question6();

        Scanner sc = new Scanner(System.in);

  
        System.out.println("Name: ");
        emp1.Name = sc.nextLine();
        System.out.println("Address: ");
        emp1.Address = sc.nextLine();
        System.out.println("Year: ");
        emp1.year = Integer.parseInt(sc.nextLine());

  
        System.out.println("Name: ");
        emp2.Name = sc.nextLine();
        System.out.println("Address: ");
        emp2.Address = sc.nextLine();
        System.out.println("Year: ");
        emp2.year = Integer.parseInt(sc.nextLine());


        System.out.println("Name: ");
        emp3.Name = sc.nextLine();
        System.out.println("Address: ");
        emp3.Address = sc.nextLine();
        System.out.println("Year: ");
        emp3.year = Integer.parseInt(sc.nextLine());

        System.out.println("Name:    " + "Year of Joining:  " + "             Address          ");
        emp1.print();
        emp2.print();
        emp3.print();
    }

}