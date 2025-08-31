public class charLoop {

    public static void main(String[] args) {

        char i, j,k;


        for (i = 'A'; i <= 'G'; i++)
        {
            for(k='G';k>i;k--)
            {
                System.out.print(" ");
            }
            for (j = 'A'; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
