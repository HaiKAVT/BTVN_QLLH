import java.util.Scanner;

public class Manager {


    public static  Lop[] addClass(Lop[]arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("add new class ");
        System.out.print("Enter id: ");
        int id  =  Integer.parseInt(scanner.nextLine());
        System.out.print("Enter class name : ");
        String nameClass = scanner.nextLine();
        Lop lop = new Lop(id , nameClass);
        Lop [] newLop = new Lop[arr.length + 1];
        for(int i = 0 ; i < arr.length; i++){
            newLop[i] = arr[i];
        }
        newLop[newLop.length - 1] = lop;
        
        return newLop;
    }
    public static Students[] addStudents(Students[]arr , Lop[] lop){
        Scanner scanner = new Scanner(System.in);
        System.out.print("add student");
        System.out.print(" Enter id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name : ");
        String  name = scanner.nextLine();
        System.out.println("Enter gender : ");
        String gender = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Choose your class id : ");
        for (Lop l: lop) {
            System.out.println(l);
        }
        int classID = scanner.nextInt();
         Lop chooseLop = null;
         for( int i = 0; i< lop.length ; i++){
             if(classID== lop[i].getId()){
                 chooseLop = lop[i];
                 
             }
         }
         Students students = new Students(id, name, gender, age, chooseLop);
         Students[] newStudents = new Students[arr.length + 1];
         for (int i = 0 ; i < arr.length; i++){
             newStudents[i] = arr[i];
         }
         newStudents[newStudents.length - 1 ] = students;
        return newStudents;
    }
    public static Students[] delete(Students[]arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id = scanner.nextInt() - 1;
        Students[] newArr = new Students[arr.length -1 ];
        for(int i = id; i < newArr.length; i++){
            arr[i] = arr[i+1];
        }
        for(int j = 0 ; j < newArr.length; j++){
            newArr[j]= arr[j];
        }
        return newArr;

    }
}
