//Find a non-unique duplicate in an array of integers
import java.util.*;
class Task5{
    public static void main(String []s) {
        int a[]={1,2,3,1,2,3,5};
        
        Arrays.sort(a);

        int i,j,f;

        for(i=0;i<a.length;i++)
        {
            f=1;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    f++;
                else
                    break;
            }
            i=j-1;
            if(f==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}