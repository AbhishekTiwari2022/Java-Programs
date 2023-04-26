
/*
Write a  program to print a face. 
Expected Output

 +"""""+                                                                                                      
[| o o |]                                                                                                     
 |  ^  |                                                                                                      
 | '-' |                                                                                                      
 +-----+ 
 
 */

public class Task10 {
    public static void main(String []s)
    {
        String []s1 = new String[5];
        s1[0]=" +\"\"\"\"\"+ ";
        s1[1]="[| o o |]";
        s1[2]=" |  ^  | ";
        s1[3]=" | '-' |";
        s1[4]=" +-----+";

        for(int i=0;i<=4;i++)
        {
            System.out.println(s1[i]);
        }

    }
}
