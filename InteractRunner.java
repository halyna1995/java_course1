import java.util.Scanner;

public class  InteractRunner{
    public static void main(String[] arg){
        Scanner reader=new Scanner(System.in);
	try{
	   Calculator calc=new Calculator();
	   String exit="no";
	   while (!exit.equals("yes")){
		System.out.println("Enter first arg: ");
		String first=reader.next();
		System.out.println("Enter second arg: ");
		String second=reader.next();
		
                System.out.println("chose operation: 1-> + 2-> - 3-> * 4-> /");
		int a=reader.nextInt();
		
		System.out.println("a=   "+a);
/**switch
case 1:
                //Добавление
                add(Integer.valueOf(first), Integer.valueOf(second));
                break;
*/

if(a == 1) {
		calc.add(Integer.valueOf(first),Integer.valueOf(second));		
}
else if (a == 2){
		calc.mins(Integer.valueOf(first),Integer.valueOf(second));
}
else if (a == 3){
		calc.mnoz(Integer.valueOf(first),Integer.valueOf(second));
}else if (a == 4){
		calc.dil(Integer.valueOf(first),Integer.valueOf(second));
}

		System.out.println("Result: "+calc.getResult());
		


		calc.clearResult();
		System.out.println("Exit: yes/no");
		exit=reader.next();
}	   
} finally{
	reader.close();
}	
}  
}