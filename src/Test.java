import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lop [] lop = new Lop[0];
        Students[] hocSinh = new Students[0];
        int choice;
        while (true){

            System.out.print("1 . Lop ");
            System.out.print("2. Students ");
            System.out.println("3 . Exit");
            System.out.println("your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("what to do with Lop? ");
                    System.out.print(" 1. add ");
                    System.out.print("2 . Show");
                    int select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            lop = Manager.addClass(lop);
                        case 2: {
                            for (Lop l : lop) {
                                System.out.println(l);

                            }
                        }
                    }
                }
                case 2: {
                    System.out.print("What to do with students : ");
                    System.out.println("1. add");
                    System.out.println("2. changes");
                    System.out.println("3. delete");
                    System.out.println("4. Display");

                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                            hocSinh = Manager.addStudents(hocSinh, lop);
                        case 2: {
                            System.out.println("Enter student id : ");
                            int id = scanner.nextInt();
                            Students target = null;
                            for(int i = 0 ; i < hocSinh.length; i++){
                                if(id == hocSinh[i].getId()){
                                    target = hocSinh[i];
                                }
                            }
                            System.out.print("What to change");
                            System.out.print("1. Name ");
                            System.out.print("2. ID ");
                            System.out.print("3. gender ");
                            System.out.print("4. age ");
                            int selection = scanner.nextInt();
                            switch (selection){
                                case 1: {
                                    System.out.print("Input new name : ");
                                    String name = scanner.nextLine();
                                    target.setName(name);
                                }
                                case 2:
                                    System.out.println("Input new ID : ");
                                    int newID = scanner.nextInt();
                                    target.setId(newID);
                                case 3:
                                    System.out.println("Input new gender : ");
                                    String gender = scanner.nextLine();
                                    target.setGender(gender);
                                case 4:
                                    System.out.println("Input new age: ");
                                    int age = scanner.nextInt();
                                    target.setAge(age);

                            }

                        }
                        case 3:
                            hocSinh = Manager.delete(hocSinh);
                        case 4:
                            for (Students s : hocSinh) {
                                System.out.println(s);
                            }
                    }

                }
                case 3:
                    System.exit(0);

            }
        }
    }
}
