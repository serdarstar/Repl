package repl;

import java.util.Scanner;

public class repl56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pr=0;
		String i3="i3";
		String i5="i5";
		String i7="i7";
		int ram1;
		String hdd="HDD";
		String ssd="SSD";
		int memory=0;
		String FullHD="FullHD";
		String FK="4K";
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Select screen size:");
		double screen=sc.nextDouble();
		if (screen==13.3) {pr=pr+200;}else if (screen==15.0) {pr=pr+300;}else if (screen==17.3) {pr=pr+400;}
		System.out.println("Select CPU type");
		String CPU=sc.next();
		if (CPU.equals(i3)) {pr=pr+150;}else if(CPU.equals(i5)) {pr=pr+250;}else if (CPU.equals(i5)) {pr=pr+350;}
		System.out.println("Select RAM size:");
		int ram=sc.nextInt();
		ram1=ram/4;
		pr=pr+ram*50;		
		System.out.println("Select storage type:");
		String stor=sc.next();
		System.out.println("Enter memory size:");
		int memory1=sc.nextInt();
		if (stor.equals(ssd)) {memory=memory1/500; pr=pr+memory*50;}
		else if (stor.equals(hdd)) {memory=memory1/500; pr=pr+memory*50+100;
						}
		System.out.println("Enter screen resolution:");
		String resol=sc.next();
		if (resol.equals(FullHD)) {pr=pr+100;}else if (resol.equals(FK)) {pr=pr+200;}
		System.out.println(pr);
		

	}

}
