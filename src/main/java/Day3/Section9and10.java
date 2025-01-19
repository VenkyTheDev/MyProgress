package Day3;
import java.util.*;

public class Section9and10 {
    public class SortedArray {
        // write code here
        public static int[] getIntegers(int size) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[size];

            System.out.println("Enter " + size + " integers:");

            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            return numbers;
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }

        public static int[] sortIntegers(int[] array) {
            int[] sortedArray = Arrays.copyOf(array, array.length);
            Arrays.sort(sortedArray);
            int temp;

            for (int i = 0; i < sortedArray.length / 2; i++) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
                sortedArray[sortedArray.length - 1 - i] = temp;
            }

            return sortedArray;
        }
    }
    //MinElement Challenge
    public class MinimumElement {
        // write code here
        private static int readInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            return scanner.nextInt();
        }


        private static int[] readElements(int count) {
            Scanner scanner = new Scanner(System.in);
            int[] elements = new int[count];

            System.out.println("Enter " + count + " integers:");
            for (int i = 0; i < count; i++) {
                elements[i] = scanner.nextInt();
            }

            return elements;
        }

        private static int findMin(int[] array) {
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        }
    }
    //Reverse Array Challenge
    public class ReverseArray {
        // write code here
        private static void reverse(int[] array) {
            System.out.print("Array = [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) System.out.print(", ");
            }
            System.out.println("]");

            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }

            System.out.print("Reversed array = [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    //Mobile Phone Challenge
    class MobilePhone {
        private String myNumber;
        private ArrayList<Contact> myContacts;

        public MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            this.myContacts = new ArrayList<>();
        }

        public boolean addNewContact(Contact contact) {
            if (findContact(contact) == -1) {
                myContacts.add(contact);
                return true;
            }
            return false;
        }

        public boolean updateContact(Contact oldContact, Contact newContact) {
            int position = findContact(oldContact);
            if (position != -1) {
                myContacts.set(position, newContact);
                return true;
            }
            return false;
        }

        public boolean removeContact(Contact contact) {
            int position = findContact(contact);
            if (position != -1) {
                myContacts.remove(position);
                return true;
            }
            return false;
        }

        private int findContact(Contact contact) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(contact.getName())) {
                    return i;
                }
            }
            return -1;
        }

        private int findContact(String contactName) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(contactName)) {
                    return i;
                }
            }
            return -1;
        }

        public Contact queryContact(String contactName) {
            int position = findContact(contactName);
            if (position != -1) {
                return myContacts.get(position);
            }
            return null;
        }

        public void printContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
            }
        }
    }
    class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Contact createContact(String name, String phoneNumber) {
            return new Contact(name, phoneNumber);
        }
    }

    public static void main(String[] args) {

    }

}
