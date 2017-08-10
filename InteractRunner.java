import java.util.Scanner;

		 public class  InteractRunner{
   public static void main(String[] arg){
	   		Scanner reader=new Scanner(System.in);
			try{
				   Calculator calc=new Calculator();
				   String exit="n";
				   while (!exit.equals("y")){
						System.out.println("Enter first arg: ");
						String first=reader.next();
						System.out.println("Enter second arg: ");
						String second=reader.next();
					    System.out.println("chose operation: 1(dodavanny)+  2(vidnimanny) - 3-(mnozenny) * 4-(dilenny) /");
						int a=reader.nextInt();
								/**switch
								 case 1:
								                 add(Integer.valueOf(first), Integer.valueOf(second));
								                 break;
								 */
					    if(a == 1)
					    {
							calc.add(Integer.valueOf(first),Integer.valueOf(second));
						}
						else if (a == 2)
						{
							calc.mins(Integer.valueOf(first),Integer.valueOf(second));
					    }
						else if (a == 3)
						{
							calc.mnoz(Integer.valueOf(first),Integer.valueOf(second));
						}
						else if (a == 4)
						{
							calc.dil(Integer.valueOf(first),Integer.valueOf(second));
						}
					   System.out.println("Result0: "+calc.getResult());
						String exit1="y";
						while (!exit1.equals("n")){
								System.out.println("prodovzyty: y/n");
								exit1=reader.next();
								int res=calc.getResult();
								//System.out.println("res: "+calc.getResult());
								System.out.println("Enter arg: ");
								String chyslo3=reader.next();
								System.out.println("chose operation: 1(dodavanny)+  2(vidnimanny) - 3-(mnozenny) * 4-(dilenny) /");
							int b=reader.nextInt();
							if(b == 1)
							{
								calc.add(Integer.valueOf(chyslo3));
							}
							else if (b == 2)
							{
								calc.mins(Integer.valueOf(chyslo3));
							}
							else if (b == 3)
							{
								calc.mnoz(Integer.valueOf(chyslo3));
							}
							else if (b == 4)
							{
								calc.dil(Integer.valueOf(chyslo3));
							}
							System.out.println("Result: "+calc.getResult());
							}
							
							System.out.println("Exit: y/n");
							exit=reader.next();
							//calc.clearResult();
				}
			} finally{
				reader.close();
			}
		}
 }