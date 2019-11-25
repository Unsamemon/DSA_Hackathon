import java.util.*;
import java.util.Scanner;

class Starters{

    public static void main(String args[]){


	
	List<String> items = new ArrayList<>();
	items.add("Garlic bread");
	items.add("Salad");
	items.add("Bread Sticks");
	items.add("Wings");
	items.add("Baked potatoes");
	
	for( int i=0, y=1; i<items.size(); i++, y++){
		System.out.println(y+ ". "+  items.get(i));
	}
    

    Scanner sc = new Scanner(System.in);
	System.out.print("Input your deseried option : " );
	int y = sc.nextInt();

	switch(y){
		case 1 :
		   System.out.println("You have chosen Garlic Bread as your starter, would you like to move to the main course ?");
		   System.out.println("proceeding to main course..");
		   //System("CLS");


		case 2 :
           System.out.println("You have chosen Salad as your starter");
		   System.out.println("proceeding to main course..");
		   //System("CLS");
		   break;


		case 3 :

		   System.out.println("You have chosen Bread Sticks as your starter");
		   System.out.println("proceeding to main course..");
		   //System("CLS");
		   break;



		case 4 :

		  System.out.println("You have chosen Wings as your starter");
		  System.out.println("proceeding to main course..");
		  //System("CLS");
           break;



		case 5 :

		   System.out.println("You have chosen Baked potatoes as your starter");
		   System.out.println("proceeding to main course..");
		   //System("CLS");
		   break;

		default :
		    System.out.println("You input doesnt concide with the starter menu");
            break;

		   }

}
	


    

	}

