public class ArrayAsArg {

    public static void update(int mark[]){
        
        for (int i = 0; i < mark.length; i++) {
            mark[i]=mark[i]+1;
        }
    }

    public static void update(int a){
        a=a+10;
        System.out.println(a);
    }

    public static void main(String[] args) { 
        int mark[] = {91, 92, 83};

   

        update(mark);
   

        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        
    }
}
