public class for_each_loop {
    public static void main(String[] args) {
        int[] A={10,20,30,40,50};
        int sum=0;
        for(int i:A){
            sum+=i;
            System.out.println("Elements of Array:"+i);
        }
        System.out.println("sum of the guven array is: "+sum);
    }
}
