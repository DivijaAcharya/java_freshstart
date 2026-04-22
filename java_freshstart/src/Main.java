class Main {
       static void main(String[] args) {
           // ternary operation on all data types
           // //condition ? value_if_true : value_if_false;

           //ternary operator for int
           int a = 10, b = 20;
         int c = (a > b) ? a : b;
           //int c = Math.max(a,b);
           System.out.println(c);

           // ternary operation for double
           double x = 1.2, y = 2.3;
          double z = (x > y) ? x : y;
           // double z = Math.max(x,y);
           System.out.println(z);

           // ternary operation for boolean
           boolean isEven = a % 2 == 0;
           System.out.println(isEven);

           // ternary operation for String
           String str1 = "Apple", str2 = "orange";
           String bigString = (str1.length() > str2.length()) ? str1 : str2;
           System.out.println(bigString);

           // simple for each loop for an 1D array demo
           int[] numbers = {1, 2, 3, 4, 5};
           for (int num : numbers) {
               System.out.println("numbers are : " + num);
           }

           // demo for 2D array
           int[][] arr2D = {
                   {1, 2, 3, 4},
                   {5, 6, 7, 8, 9, 10}};

           for (int[] row : arr2D) {
               for (int val : row) {
                   System.out.print(val + " ");
               }
               System.out.println();
           }
           String[] cars = {"vw", "BMW", "BYD", "Maserati"};

           for (int i = 0; i < cars.length; i++) {
               System.out.println(cars[i]);
           }
           // enhanced for loop
           for (String car : cars){
               System.out.println(car);
           }
       }
   }
