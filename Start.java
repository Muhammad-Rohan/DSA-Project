package DSA_PROJECT;
//import DSA_PROJECT.Library;

import java.util.Scanner;

public class Start {


    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
//        l.addBook(220, "phy","science");
//        l.addBook(221, "chem","science");
//        l.addBook(222, "math","calculation");

        while (true) {
            System.out.println("1 to add Books");
            System.out.println("2 to remove Books");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    int n;
                    System.out.print("How many Books you want to enter: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Details of Book "+(i+1));
                        System.out.print("Enter Book ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String bookName = sc.nextLine();

                        System.out.print("Enter Book category: ");
                        String category = sc.next();

                        library.addBook(id, bookName, category);
                    }
                    library.displayBook();


//                    return;
                } // case 1 ends

                case 2: {
                    int n;
                    System.out.print("How many Books you want to REMOVE: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter Book ID to remove ");
                        int id = sc.nextInt();
                        library.removeBook(id);
                    }
                    library.displayBook();
                }


















            }

        }


    }
}
