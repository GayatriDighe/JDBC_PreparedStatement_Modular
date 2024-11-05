package com.controller;

import java.util.Scanner;

import com.service.Bookservice;


public class BookController {

	
public static void main(String[] args) throws Exception {
		
		
		int bid;
		boolean status=true;
		String book_name,book_type;
		int book_price;


		Bookservice ss = new Bookservice();
	
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1. Insert the Record \n2. Delete the Record \n3. Update the Record\n4. Fetch the Record\n5. Exit");
			int option = sc.nextInt();
		
			
			switch(option) {
				case 1:
					  System.out.println("**select option***");
					  System.out.println("Please enter bid ");
					  bid = sc.nextInt();			
					  System.out.println("Please enter book name");
					  book_name = sc.next();				  
					  System.out.println("Please enter book type");
					  book_type = sc.next();
					  System.out.println("Please enter price of book");
					  book_price = sc.nextInt();
					  ss.insertdata(bid,book_name,book_type,book_price);

					  break;
				case 2:
					  
					  System.out.println("Please enter bid");
					  bid = sc.nextInt();
					  ss.deleteData(bid);

					  break;
				case 3:
					  
					  System.out.println("Please enter book id");
					  bid = sc.nextInt();			
					  System.out.println("Please enter book Name");
					  book_name = sc.next();	
					  ss.updateData(bid, book_name);

					  break;
				case 4:
					  ss.fetchData(); 
					  break;
				case 5:
					  status = false;
					  System.exit(0);
					  break;
				default:
					  System.out.println("Please Select valid Option");
					  break;
			}
			
	
			do {
				System.out.println("\nWould you like to Continue? Y / N");
				String str = sc.next();
				if(str.startsWith("n")) {
					status = false;
				}
				else if(str.startsWith("y")) {
					break;		
				}
				
				
			}while(status);
			
		}while(status);
		
		
	}
	

}
