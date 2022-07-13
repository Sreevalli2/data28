package day1;
public class first {

	public static void main(String[] args) {
		// TODO Aut'o-generated method stub
System.out.println("hi");

byte d=45;
long f=7668;
short g=d;
short k=(short)f;
short i= (short) (k-g);
/*"first line"*/
System.out.println("Hi");
System.out.println(i);
float [] values=new float[3];
values[0]=1.56f;
values[1]=2.56f;
values[2]=3.56f;
float sum = 0.0f;
for(int p = 0; p< values.length; p++) {
    sum += values[p];
}   System.out.println(sum);
System.out.println("string");
int x=10,y=15,res=0;
char ch ='a';
switch (ch)
{
    case 'a':
    res= y + x;
        break;
    case 'b':
    res=y/x;
        break;
    case 'c':
     res=y-x;
            break;
    case 'd':
    res=x*y;
        break;
        default:System.out.println("invalid");
}
System.out.println(res);
 

}
	}


