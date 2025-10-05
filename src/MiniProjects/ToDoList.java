package MiniProjects;

import java.util.LinkedList;
import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		LinkedList<String> toDoList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== TO-DO LIST MENU ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String task = sc.nextLine();
                    toDoList.add(task);
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    System.out.println("\n📋 Your Tasks:");
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks found!");
                    } else {
                        int i = 1;
                        for (String t : toDoList) {
                            System.out.println(i++ + ". " + t);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();
                    if (index > 0 && index <= toDoList.size()) {
                        String removed = toDoList.remove(index - 1);
                        System.out.println("❌ Removed: " + removed);
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
	}
}
