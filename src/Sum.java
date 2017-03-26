import java.util.ArrayList;

public class Sum {

    @org.junit.Test
    public void sum1(){
        int sum = 10;
        int [] array = {1,5,7,3,6,4,2,8};
        ArrayList<Integer> sumarray = new ArrayList<>();
        int m = 0 ;
        for(int i = 0;i<array.length;i++){
            for(int j = i + 1 ;j<array.length;j++){
                if(array[i] + array [j] == sum){
                    sumarray.add(array [i]);
                    sumarray.add(array[j]);

                }
            }
        }

        System.out.println(sumarray.toString());
    }

}
