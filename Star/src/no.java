//to display 1-10 no with static member
class no
{static int k;
public static void main(String[] args)
{
m1(k);
}
static void m1(int i)
{System.out.println(i);
if(i==10) return;
m1(++i);
return;
}
}
