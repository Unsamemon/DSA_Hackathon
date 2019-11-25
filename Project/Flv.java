import java.util.*;







class Flv{
	public static void main(String [] args){
	List<String> flv=new ArrayList<>();
	flv.add("Chicken tikka");
	flv.add("BBQ");
	flv.add("Supreme");
	flv.add("Ultimate cheese");
	flv.add("Chicken fajita");
	for(int i=0,y=1;i<flv.size();i++,y++){
	System.out.println(y+ " " +flv.get(i));
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your flavour: ");
	int a=sc.nextInt();
	switch(a){
		case 1:
		System.out.println("You have selected chicken tikka flavour");
		System.out.println("Select your size: ");
		break;

		case 2:
		System.out.println("You have selected BBQ flavour");
		System.out.println("Select your size: ");
        break;
		case 3:
		System.out.println("You have selected Supreme flavour");
		System.out.println("Select your size: ");
        break;
		case 4:
		System.out.println("You have selected Ultimate cheese flavour");
		System.out.println("Select your size: ");
        break;
		case 5:
		System.out.println("You have selected chicken fajita flavour");
		System.out.println("Select your size: ");
		break;
	}






}
}