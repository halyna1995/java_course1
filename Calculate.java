public class Calculate
{
  public static void main(String[] arg){
	System.out.println("calculate...");
	int first=Integer.valueOf(arg[0]);
	int second=Integer.valueOf(arg[1]);
	int summ=first+second;
	int rizn=first-second;
	int mnozhen=first*second;
	int dilennya=first/second;
	double pidn_do_stepennya=Math.pow(first, second);
	System.out.println("Suma=  "+summ);
	System.out.println("Riznycya=  "+rizn);
	System.out.println("Mnozhennya=  "+mnozhen);
	System.out.println("Dilennya=  "+dilennya);
	System.out.println("Pidnesennya do stepennya=  "+pidn_do_stepennya);
}
};