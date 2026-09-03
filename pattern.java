// public class pattern {

//     public static void print(int row, int col){

//         for(int i = 1; i <= row; i++){
//             for(int j = 1; j <= col; j++){
//                 if(i == 1 || i == row || j == 1 || j == col){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]){
//         print(4, 5);
//     }
// }
    
// public class pattern {

//     public static void print(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//              for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//              }
//             System.out.println();
//         }        
//     }
//     public static void main(String args[]){
//         print(4);
//     }
// }

// public class pattern {

//     public static void print(int n){
    
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//              System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         print(5);
//     }
// }

// public class pattern {

//     public static void print(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 if((i + j) % 2 == 0){
//                     System.out.print(1+" ");
//                 } else {
//                     System.out.print(0+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(5);
//     }
// }

// public class pattern {

//     public static void print(int n){
//         int count = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         print(5);
//     }
// }

// public class pattern {

//     public static void print(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         print(5);
//     }
// }

// public class pattern {
    
//     public static void print(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         print(5);
//     }
// }

// public class pattern {

//     public static void print(int rows,int columns){
//         //outer loop 
//         for(int i = 1; i <= rows; i++){
//             //inner loop 
//             for(int j = 1; j <= columns; j++){
//                 if(i == 1 || i == rows || j == 1 || j == columns){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(4, 5);
//     }
// }

// public class pattern {

//     public static void print(int row , int col){
//         //outer loop runs the times of row
//         for(int i = 1; i <= row; i++){
//             //inner loop runs the times of col
//             for(int j = 1; j <= col; j++){
//                 //here conditions what you want to print 
//                 if(i == 1 || i == row || j == col){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             // to gose on next line 
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8, 8);
//     }
// }

// public class pattern {

//     public static void print(int n) {

//         // Outer loop → controls rows
//         for (int i = 1; i <= n; i++) {

//             // Print spaces → n - i spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print stars → i stars
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }

//             // Move to next row
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         print(6);
//     }
// }

// public class pattern {

//     public static void print (int n){
//         // outer loop
//         for(int i = 1; i <= n; i++){
//             // inner loop
//             int count = 1;
//             for(int j = 1; j <= n-i+1; j++){
//                 System.out.print(count);
//                 count++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print(int n){
        
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(5);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("A");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 1; i--){
//             for(int j = i; j >= 1; j--){
//                 System.out.print("*");
//             }
//             System.out.println();;
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("5");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = a; i >= 1; i--){
//             for(int j = i; j >= 1; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(7);
//     }
// }

// public class pattern {

//     public static void print( int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(4, 6);
//     }
// }

// public class pattern {

//     public static void print (int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = )
//         }
//     }
//     public static void main (String args[]){

//     }
// }

// public class pattern {

//     public static void print(int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("A");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6, 6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print (int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6, 6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = a; i >= 1; i--){
//             for(int j = i; j >= 1; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {
//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(50);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print (int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(6, 8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = i; j >= 0; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){print(8);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = a; i >= 0; i--){
//             int num = 1;
//             for(int j = i; j >= 0; j--){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             int num = 1;
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a,int b){
//         for(int i = 1; i <= a; i ++){
//             int num = 1;
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print(num+" ");
//                 } else {
//                     System.out.print("*"+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(4, 6);
//     }
// }


// public class pattern {

//     public static void print(int a){
//         int num = 1;
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1 ; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 if((i +j) % 2 == 0){
//                     System.out.print(1+" ");
//                 } else {
//                     System.out.print(0+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(6);
//     }
// }


// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print (int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public  static void main(String args[]){
//         print(6, 6);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a - i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a - i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a - i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print (int a, int b){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= b; j++){
//                 if(i == 1 || i == a || j == 1 || j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
//     public static void main (String args[]){
//         print(6, 6);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)- 1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(8);
//     }
// }


// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 if(i == 1 || i == a || j == 1 || j == a){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(6);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(4);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a; j++){
//                 if(i == 1 || i == a || j == 1 || j == a){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(a-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();;
//         }
//     }
//     public static void main(String args[]){
//         print(8);
//     }
// }

// public class pattern {

//     public static void print (int a){
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= a; j++){
//                 if(i == 1 || i == a || j == 1 || j == a){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(10);
//     }
// }

// public class pattern {

//     public static void print(int a){
//         for(int i = 1; i <= a; i ++){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = a; i >= 0; i--){
//             for(int j = 1; j <= a-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         print(8);
//     }
// }