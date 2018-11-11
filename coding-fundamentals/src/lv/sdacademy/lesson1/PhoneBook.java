package lv.sdacademy.lesson1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry("Valters", "XXX", "12141412"));
        entries.add(new Entry("Supermens", "XXX", "1231224"));
        entries.add(new Entry("Betmens", "XXX", "99999999"));

        Scanner in = new Scanner(System.in);

        System.out.println("Hello user!");
        while (true) {
            System.out.println("What you want to do?");
            System.out.println("Options:");
            System.out.println("1 - add phone book entry");
            System.out.println("2 - search");
            System.out.println("3 - view all entries");
            System.out.println("0 - exit");
            int optionSelected = in.nextInt();

            switch (optionSelected) {
                case 1: {
                    // adding new entry to phone book
                    Entry newEntry = new Entry();
                    System.out.println("Enter first name:");
                    newEntry.setFirstName(in.next());
                    System.out.println("Enter last name:");
                    newEntry.setLastName(in.next());
                    System.out.println("Enter phone:");
                    newEntry.setPhone(in.next());
                    entries.add(newEntry);
                    break;
                }
                case 2: {
                    // search
                    System.out.println("Type search query:");
                    String query = in.next();
                    int totalResultCount = 0;
                    for (Entry entry : entries) {
                        String entryAsAText = entry.getFirstName() + " " + entry.getLastName() + " " + entry.getPhone();
                        if (entryAsAText.contains(query)) {
                            System.out.println(entryAsAText);
                            totalResultCount++;
                        }
                    }
                    System.out.println("Found " + totalResultCount + " results!");
                    break;
                }
                case 3: {
                    for (Entry entry : entries) {
                        System.out.println(entry.getFirstName() + " " + entry.getLastName() + " " + entry.getPhone());
                    }
                }
            }

            if (optionSelected == 0) {
                break;
            }
        }

        System.out.println("Thank you for using phone book!");

    }
}

class Entry {
    private String firstName;
    private String lastName;
    private String phone;

    public Entry() {
    }

    public Entry(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
