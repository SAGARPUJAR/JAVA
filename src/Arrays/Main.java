package Arrays;

public class Main {
    public static void main(String[] args) {
        //Example 1, Single Dimensional Array
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


        //Example 2
        int test[]={1,2,3,4,5,6,7,8};
        for (int j=0;j<test.length;j++){
            System.out.println(test[j]);
        }
        System.out.println("");
        System.out.println("Multi Dimensional Array");
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int k=0;k<array.length;k++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[k][j]+" ");
            }
            System.out.println("");
        }
    }
}
