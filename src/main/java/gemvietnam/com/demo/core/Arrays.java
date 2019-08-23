package gemvietnam.com.demo.core;

public class Arrays {
    public static void main(String[] args) {
        String[] cars;

    String[] cars1 = {"Honda", "BMW", "Ford", "Mazda"};
    int[] myNum = {20, 30, 40, 50};
    for (int i = 0; i < cars1.length; i++) {
        System.out.println(cars1[i]);
    }
    for (int a : myNum){
        System.out.println(a);
    }

    int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
    for (int h = 0; h < myNumbers.length; h++) {
        for (int k = 0; k < myNumbers[h].length; k++){
            System.out.println(myNumbers[h][k]);
        }
    }
}
}