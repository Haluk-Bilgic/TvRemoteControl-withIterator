import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To The Progremme Of Channel Control");
		Scanner scan=new Scanner(System.in);
		String operations="Operations...\n"+
		"1-Show Channels\n"+
				"2-Add The Channel\n"+
		"3-Remove The Channel\n"+
				"4-Find The Number Of Channel\n"+
		"Press 'q' for Exit...";
	System.out.println(operations);	
	
	TelevisionRemoteControl controller=new TelevisionRemoteControl();
	 while(true){
		 System.out.print("Enter your operation:");
		 String operation=scan.nextLine();
		 if(operation.equals("q")){
			 System.out.println("The exit is done...");
			 break;
		 }else if(operation.equals("1")){
			 kanallariGoster(controller);
		 }else if(operation.equals("2")){
			 System.out.print("The channel that you want to add:");
			 String name_of_channel=scan.nextLine();
			 controller.addChannel(name_of_channel);
		 }else if(operation.equals("3")){
			 System.out.print("The channel that you want to remove:");
			 String name_of_channel=scan.nextLine();
			 controller.removeChannel(name_of_channel);
		 }else if(operation.equals("4")){
			 System.out.println("The number of the channel:"+controller.numberOfChannels());
		 }else{
			 System.out.println("invalid transaction...");
		 } 
	 }
	}
public static void kanallariGoster(TelevisionRemoteControl control){
	if(control.numberOfChannels()==0){
		System.out.println("The channel not found" );
	}else{
		for(String channel:control){
			System.out.println("The Channel:"+channel);
		}
	}
}
	
	
}
