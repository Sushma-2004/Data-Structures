import java.util.Scanner;
import java.util.Arrays;

public class ListOperations {
    private static final int MAX_SIZE = 50;
    private static int[] arr = new int[MAX_SIZE];
    private static int size = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insertAtEnd();
                    break;
                case 2:
                    insertAtPosition();
                    break;
                case 3:
                    insertMultipleAtEnd();
                    break;
                case 4:
                    insertMultipleAtPosition();
                    break;
                case 5:
                    deleteFromPosition();
                    break;
                case 6:
                    displayList();
                    break;
                case 7:
                    searchValue();
                    break;
                case 8:
                    replaceAtPosition();
                    break;
                case 9:
                    replaceValue();
                    break;
                case 10:
                    findAllAndReplace();
                    break;
                case 11:
                    sortList();
                    break;
                case 12:
                    reverseList();
                    break;
                case 13:
                    findMax();
                    break;
                case 14:
                    findMin();
                    break;
                case 15:
                    sumList();
                    break;
                case 16:
                    averageList();
                    break;
                case 17:
                    clearList();
                    break;
                case 18:
                    checkIfEmpty();
                    break;
                case 19:
                    getCurrentSize();
                    break;
                case 20:
                    findDuplicates();
                    break;
                case 21:
                    removeDuplicates();
                    break;
                case 22:
                    rotateLeft();
                    break;
                case 23:
                    rotateRight();
                    break;
                case 24:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 24);
    }

    private static void displayMenu() {
        System.out.println("----------- List Operations -----------");
        System.out.println("1. Insert at the end");
        System.out.println("2. Insert at a specific position");
        System.out.println("3. Insert multiple values at the end");
        System.out.println("4. Insert multiple values at a specific position");
        System.out.println("5. Delete from a specific position");
        System.out.println("6. Display the list");
        System.out.println("7. Search for a value");
        System.out.println("8. Replace value at a specific position");
        System.out.println("9. Replace all occurrences of a value");
        System.out.println("10. Replace all occurrences of a value with another");
        System.out.println("11. Sort the list in ascending order");
        System.out.println("12. Reverse the list");
        System.out.println("13. Find the maximum value");
        System.out.println("14. Find the minimum value");
        System.out.println("15. Calculate the sum of all values");
        System.out.println("16. Calculate the average of all values");
        System.out.println("17. Clear the list");
        System.out.println("18. Check if the list is empty");
        System.out.println("19. Get the current size of the list");
        System.out.println("20. Find duplicates in the list");
        System.out.println("21. Remove duplicates from the list");
        System.out.println("22. Rotate the list left");
        System.out.println("23. Rotate the list right");
        System.out.println("24. Exit the program");
        System.out.println("--------------------------------------");
    }

    private static void insertAtEnd() {
        if (size == MAX_SIZE) {
            System.out.println("List is full. Cannot insert more elements.");
            return;
        }
        System.out.print("Enter the value to insert: ");
        int val = scanner.nextInt();
        arr[size++] = val;
        System.out.println("Inserted " + val + " at the end of the list.");
    }

    private static void insertAtPosition() {
        if (size == MAX_SIZE) {
            System.out.println("List is full. Cannot insert more elements.");
            return;
        }
        System.out.print("Enter the position to insert (0 to " + (size) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position. Insertion failed.");
            return;
        }
        System.out.print("Enter the value to insert: ");
        int val = scanner.nextInt();
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
        size++;
        System.out.println("Inserted " + val + " at position " + pos + ".");
    }

    private static void insertMultipleAtEnd() {
        System.out.print("Enter the number of elements to insert: ");
        int count = scanner.nextInt();
        if (size + count > MAX_SIZE) {
            System.out.println("Cannot insert " + count + " elements. List will exceed maximum size.");
            return;
        }
        System.out.println("Enter " + count + " values:");
        for (int i = 0; i < count; i++) {
            int val = scanner.nextInt();
            arr[size++] = val;
            System.out.println("Inserted " + val + " at position " + (size - 1) + ".");
        }
    }

    private static void insertMultipleAtPosition() {
        System.out.print("Enter the position to insert (0 to " + (size) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position. Insertion failed.");
            return;
        }
        System.out.print("Enter the number of elements to insert: ");
        int count = scanner.nextInt();
        if (size + count > MAX_SIZE) {
            System.out.println("Cannot insert " + count + " elements. List will exceed maximum size.");
            return;
        }
        System.out.println("Enter " + count + " values:");
        for (int i = size - 1; i >= pos; i--) {
            arr[i + count] = arr[i];
        }
        for (int i = 0; i < count; i++) {
            int val = scanner.nextInt();
            arr[pos + i] = val;
            size++;
            System.out.println("Inserted " + val + " at position " + (pos + i) + ".");
        }
    }

    private static void deleteFromPosition() {
        if (size == 0) {
            System.out.println("List is empty. Deletion failed.");
            return;
        }
        System.out.print("Enter the position to delete (0 to " + (size - 1) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position. Deletion failed.");
            return;
        }
        int deletedValue = arr[pos];
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted " + deletedValue + " from position " + pos + ".");
    }

    private static void displayList() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Current elements in the list:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    private static void searchValue() {
        if (size == 0) {
            System.out.println("List is empty. Search failed.");
            return;
        }
        System.out.print("Enter the value to search: ");
        int val = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                System.out.println("Value " + val + " found at position " + i + ".");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Value " + val + " not found in the list.");
        }
    }

    private static void replaceAtPosition() {
        if (size == 0) {
            System.out.println("List is empty. Replacement failed.");
            return;
        }
        System.out.print("Enter the position to replace (0 to " + (size - 1) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position. Replacement failed.");
            return;
        }
        System.out.print("Enter the new value: ");
        int newVal = scanner.nextInt();
        int oldVal = arr[pos];
        arr[pos] = newVal;
        System.out.println("Replaced " + oldVal + " with " + newVal + " at position " + pos + ".");
    }

    private static void replaceValue() {
        if (size == 0) {
            System.out.println("List is empty. Replacement failed.");
            return;
        }
        System.out.print("Enter the value to be replaced: ");
        int oldVal = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int newVal = scanner.nextInt();
        int replaceCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
                replaceCount++;
            }
        }
        if (replaceCount > 0) {
            System.out.println("Replaced " + replaceCount + " occurrences of " + oldVal + " with " + newVal + ".");
        } else {
            System.out.println("Value " + oldVal + " not found in the list. Replacement failed.");
        }
    }

    private static void findAllAndReplace() {
        if (size == 0) {
            System.out.println("List is empty. Replacement failed.");
            return;
        }
        System.out.print("Enter the value to be replaced: ");
        int oldVal = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int newVal = scanner.nextInt();
        int replaceCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
                replaceCount++;
            }
        }
        if (replaceCount > 0) {
            System.out.println("Replaced all occurrences of " + oldVal + " with " + newVal + ".");
        } else {
            System.out.println("Value " + oldVal + " not found in the list. Replacement failed.");
        }
    }

    private static void sortList() {
        if (size == 0) {
            System.out.println("List is empty. Sorting failed.");
            return;
        }
        Arrays.sort(arr, 0, size);
        System.out.println("List sorted in ascending order.");
    }

    private static void reverseList() {
        if (size == 0) {
            System.out.println("List is empty. Reverse operation failed.");
            return;
        }
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[size - 1 - i];
        }
        System.arraycopy(temp, 0, arr, 0, size);
        System.out.println("List reversed successfully.");
    }

    private static void findMax() {
        if (size == 0) {
            System.out.println("List is empty. Maximum value not found.");
            return;
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the list: " + max);
    }

    private static void findMin() {
        if (size == 0) {
            System.out.println("List is empty. Minimum value not found.");
            return;
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the list: " + min);
    }

    private static void sumList() {
        if (size == 0) {
            System.out.println("List is empty. Sum of elements: 0");
            return;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the list: " + sum);
    }

    private static void averageList() {
        if (size == 0) {
            System.out.println("List is empty. Average of elements: 0");
            return;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double average = (double) sum / size;
        System.out.println("Average of all elements in the list: " + average);
    }

    private static void clearList() {
        size = 0;
        System.out.println("List cleared successfully.");
    }

    private static void checkIfEmpty() {
        if (size == 0) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
    }

    private static void getCurrentSize() {
        System.out.println("Current size of the list: " + size);
    }

    private static void findDuplicates() {
        if (size == 0) {
            System.out.println("List is empty. No duplicates found.");
            return;
        }
        boolean foundDuplicates = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    foundDuplicates = true;
                    System.out.println("Duplicate elements found: " + arr[i]);
                }
            }
        }
        if (!foundDuplicates) {
            System.out.println("No duplicates found in the list.");
        }
    }

    private static void removeDuplicates() {
        if (size == 0) {
            System.out.println("List is empty. No duplicates to remove.");
            return;
        }
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newSize++] = arr[i];
            }
        }
        size = newSize;
        System.out.println("Duplicates removed from the list.");
    }

    private static void rotateLeft() {
        if (size == 0) {
            System.out.println("List is empty. Rotation failed.");
            return;
        }
        System.out.print("Enter the number of positions to rotate left: ");
        int positions = scanner.nextInt() % size;
        for (int i = 0; i < positions; i++) {
            int first = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = first;
        }
        System.out.println("List rotated left by " + positions + " positions.");
    }

    private static void rotateRight() {
        if (size == 0) {
            System.out.println("List is empty. Rotation failed.");
            return;
        }
        System.out.print("Enter the number of positions to rotate right: ");
        int positions = scanner.nextInt() % size;
        for (int i = 0; i < positions; i++) {
            int last = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("List rotated right by " + positions + " positions.");
    }
}
