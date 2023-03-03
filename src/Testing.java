public class Testing {
    public static int Sum(int a,int b,String opertor1){
        int num =0;
        switch (opertor1){
            case "+"-> num =a+b;
            case "%"-> num =a%b;
            case "*" ->num =a*b;
            case "/" ->num =a/b;
            case "-" ->num =a-b;
        }
        return num ;
    }

    public static void main(String[] args) {
        int sum =Sum(10,3,"/");
        System.out.println("Sum : "+(float)sum);
    }


}
