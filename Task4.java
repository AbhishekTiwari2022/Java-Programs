
class Task4
{
    public static void main(String []s)
    {
        int a []={1,2,3,1,2,3};
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[j]);
            }

        }
    }
}