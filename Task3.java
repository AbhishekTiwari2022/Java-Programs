//Create a named loop

class Task3
{
    public static void main(String []s)
    {
       loopname: for(int i = 1; i < 5 ; i++)
       {
            System.out.print(i+" ");

            for(int j = 1 ; j < 3 ; j++)
            {
                System.out.print(j+" ");
                if(i!=j)
                    continue loopname;
            }
       }
    }
}
