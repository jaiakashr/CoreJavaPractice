package MiniProjects;

import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        int choice;

        do {
            System.out.println("\n=== Simple Text Editor ===");
            System.out.println("1. Add text");
            System.out.println("2. Insert text at position");
            System.out.println("3. Replace text");
            System.out.println("4. Delete text");
            System.out.println("5. Reverse text");
            System.out.println("6. View text");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to add: ");
                    String add = sc.nextLine();
                    text.append(add);
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter text to insert: ");
                    String insert = sc.nextLine();
                    if (pos >= 0 && pos <= text.length()) {
                        text.insert(pos, insert);
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement text: ");
                    String rep = sc.nextLine();
                    if (start >= 0 && end <= text.length() && start < end) {
                        text.replace(start, end, rep);
                    } else {
                        System.out.println("Invalid range!");
                    }
                    break;

                case 4:
                    System.out.print("Enter start index: ");
                    int delStart = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int delEnd = sc.nextInt();
                    if (delStart >= 0 && delEnd <= text.length() && delStart < delEnd) {
                        text.delete(delStart, delEnd);
                    } else {
                        System.out.println("Invalid range!");
                    }
                    break;

                case 5:
                    text.reverse();
                    System.out.println("Text reversed!");
                    break;

                case 6:
                    System.out.println("Current text: " + text);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
