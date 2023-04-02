import java.util.Scanner;
class InsSta{
		String Name;
		int Rollno;
		static String Institutename= "Amrapali group of institute";
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		InsSta h = new InsSta();
		InsSta r = new InsSta();

	
		
	System.out.println("enter your name:-");
		h.Name = s.next(); 
		System.out.println("enter your rollno:-");
		h.Rollno = s.nextInt(); 	
		System.out.println("enter your name2:-");
		r.Name = s.next(); 
		System.out.println("enter your rollno2:-");
		r.Rollno = s.nextInt();
		System.out.println(h.Name+"   "+h.Rollno+"   "+InsSta.Institutename);
		System.out.println(r.Name+"   "+r.Rollno+"   "+r.Institutename);
		}
		}
	// their is a error or exception when we use full name with space ,ex-shubham swarnakar
		
		