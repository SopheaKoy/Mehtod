
public class Main {
    public static int max(int...num){
        int m = num[0];
        for (int i =0;i< num.length;i++){
            if (m<num[i]){
                m = num[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int m = max(12,34,60,11,3);
        System.out.println(m);
    }
}