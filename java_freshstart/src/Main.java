class ForeachLoopExample {
       static void main(String[] args) {
     // simple for each loop for an 1D array demo
        int[] numbers = {1,2,3,4,5};
        for(int num :numbers){
            System.out.println("numbers are : "+ num);
        }

        // demo for 2D array
           int[][] arr2D = {
                  {1,2,3,4},
                   {5,6,7,8,9,10}};

           for (int[] row : arr2D) {
               for (int val : row) {
                   System.out.print(val + " ");
               }
               System.out.println();
           }
       }
   }
