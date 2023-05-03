public class Сhees {
    public static void main(String[] args) {
        char [][] a = new char[8][8];
        for (int i=0; i<a.length; i++){
            for (int j=0;j<a[i].length; j++){
                a[i][j]='B';
                if((i+j)%2 == 0) {
                    a[i][j] = 'W';
                }
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
