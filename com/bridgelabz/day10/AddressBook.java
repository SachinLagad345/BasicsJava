package com.bridgelabz.day10;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void display() {
		System.out.print("First Name : " + firstName + "\t");
		System.out.print("Last Name : " + lastName + "\t");
		System.out.print("Address : " + address + "\t");
		System.out.print("City : " + city + "\t");
		System.out.print("State : " + state + "\t");
		System.out.print("Zip : " + zip + "\t");
		System.out.print("Email : " + email + "\t");
		System.out.print("Phone : " + phone + "\n");
	}

	public Contact createContact() {
		Contact cs = new Contact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Add new contact");
		System.out.println("Enter first name");
		cs.firstName = sc.next();

		System.out.println("Enter last name");
		cs.lastName = sc.next();

		System.out.println("Enter phone");
		cs.phone = sc.next();

		System.out.println("Enter address");
		cs.address = sc.next();

		System.out.println("Enter city");
		cs.city = sc.next();

		System.out.println("Enter state");
		cs.state = sc.next();

		System.out.println("Enter zip");
		cs.zip = sc.next();

		System.out.println("Enter email");
		cs.email = sc.next();

		return cs;
	}
}

public class AddressBook extends Contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to address book");
		ArrayList<Contact> arr = new ArrayList<Contact>();
		AddressBook adrs = new AddressBook();
	
		Scanner sc1 = new Scanner(System.in);

		int choice = 0;

		do {
			System.out.println("1.Add contact");
			System.out.println("2.Edit contact");
			System.out.println("3.Delete contact");
			System.out.println("4.Display address book");
			System.out.println("5.Exit");
			System.out.println("\nEnter your choice");

			choice = sc1.nextInt();

			switch (choice) {
			case 1:
					arr.add(adrs.createContact());
				break;
			case 2:
				if (arr.size() == 0) {
					System.out.println("No data in address book! Add contacts!");
				} else {
					System.out.println("Enter name of person to edit his details");
					String name = sc1.next();
					
					for (int i = 0; i < arr.size(); i++) {
						if (arr.get(i).getFirstName().equalsIgnoreCase(name)) {
							System.out.println("Change first name");
							String fname = sc1.next();
							arr.get(i).setFirstName(fname);

							System.out.println("Change last name");
							String lname = sc1.next();
							arr.get(i).setLastName(lname);

							System.out.println("Change address");
							String address = sc1.next();
							arr.get(i).setAddress(address);

							System.out.println("Change city");
							String city = sc1.next();
							arr.get(i).setCity(city);

							System.out.println("Change state");
							String state = sc1.next();
							arr.get(i).setState(state);

							System.out.println("Change zip");
							String zip = sc1.next();
							arr.get(i).setZip(zip);

							System.out.println("Change phone");
							String phone = sc1.next();
							arr.get(i).setPhone(phone);

							System.out.println("Change email");
							String email = sc1.next();
							arr.get(i).setEmail(email);
							break;
						} else if (i == arr.size()-1)
							System.out.println("Person with given name " + name + " does not exist!");
					}
				}
				break;
			case 3:if (arr.size() == 0) {
				System.out.println("AddressBook is empty! no contact to delete");
			} 
			else
			{
				System.out.println("Enter first name of person to delete contact");
				String name = sc1.next();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getFirstName().equalsIgnoreCase(name)) {
						arr.remove(i);
						break;
					}
					else if(i == arr.size()-1)
					{
						System.out.println("No person exist with name " + name + " !");
					}
				}
			}
			break;
			case 4:
				System.out.println("Displaying all contacts");
				for (int i = 0; i < arr.size(); i++) {
					arr.get(i).display();
				}
				break;
			default:
				System.out.println("Please enter valid choice");
			}

		} while (choice != 5);

		sc1.close();
	}

}
