public class LinearSearch {

    public static void LinearSearch(int numbers[],int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                System.out.println("key found");
                return;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        int numbers[]={1,10,11,18,19,12,20};
        int key=21;
        LinearSearch(numbers,key);
    }
}
