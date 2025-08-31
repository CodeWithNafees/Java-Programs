import java.sql.SQLOutput;

public class looping {
    public static void main(String[] args) {
        int i, j,k;

        for (i = 1; i <= 5; i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for (j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



/*
*
* *
* * *
* * * *

1
1 2
1 2 3
1 2 3 4

1
2 2
3 3 3
4 4 4 4

    *
   * *
  * * *
 * * * *
 */