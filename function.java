/*public class function {

    public static void aaa(){
        System.out.println("I am Batman");
        System.out.println("My Name Is Thomas shelby");
        System.out.println("I am joker");
    } 
    public static void main (String args[]){
        aaa();
    }
} */

/*import java.util.*;

public class function {

    public static void aaa(){
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print(sum);
    }
    public static void main (String args[]){
        aaa();
    }
} */

/*import java.util.*;

public class function {

    public static void aaa(){
        Scanner sc = new Scanner (System.in);
        int an = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = an * i;

            System.out.println(an + "*"+ sum);
        }
        
    }

    public static void main (String args[]){
        aaa();
    }
} */

/*import java.util.*;

public class function {

    public static void aaa(){
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
            System.out.print("A is the biggest = "+a);
        }
        else if (b > c){
            System.out.print("B is the biggest = "+b);
        }
        else {
            System.out.print("C is the biggest = "+c);
        }
    }
    public static void main (String args[]){
        aaa();
    }
} */

/*public class function {

    public static void aaa(int a, int b){
        

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A is = "+ temp);
        System.out.println("B is = "+a);
    }
    public static void main (String args[]){
        aaa(12,56);
    }
} */

/*public class function {

    public static int multiply(int a, int b){
         int product = a * b;
         return product;
    }
    public static void main (String args[]) {
       int aaa =  multiply(5,7);

        System.out.print("multiplication of A / B = "+aaa);

    }
} */

/*public class function {

    public static int calculate(int a, int b){
        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int multi = a * b;

        int all = sum + sub + div + multi;

        return all;
    
    }
    public static void main (String args[]){
        int aaa = calculate(34,23);

        System.out.print("calculations of NUM = "+aaa);
    }
} */

/*public class function {

    public static int multi(int a, int b){
        int sum = a * b;
         System.out.println(sum);
        return sum;
    }
    public static void main (String args[]){
        multi(4,6);
        multi(3,9);
    }
} */

/*public class function {

    public static int factorical(int a){
        int b = 1;
        
        for(int i = 1; i <= a; i++){
            b =  b * i;
        }
        System.out.println(b);
        return b;
    }
    public static void main (String args[]){
        factorical(7);
    }
} */

/*public class function {

    public static int factorical(int a){
        int b = 1;
        
        for(int i = 1; i <= a; i++){
            b =  b * i;
        }
        return b;
    }
    public static void main (String args[]){
         System.out.println(factorical(7));
    }
} */

/*public class function {
    public static int table(int a){
        int b = 0;

        for(int i = 1; i <= 10; i++){
            b = a * i;
            System.out.println(a+"*"+b);
        }
        return b;
    }
    public static void main (String args[]){
        table(9);
    }
} */

/*public class function {
    public static int factorical(int a){
        int f = 1;

        for(int i = 1; i <= a; i++){
            f = f * i;
        }
        return(f);
    }
    public static int bincoeff(int n, int r){
        int a = factorical(n);
        int b = factorical(r);
        int c = factorical(n-r);

        int binCoeff = a / (b * c);
        return binCoeff;
    }
    public static void main (String args[]){
        System.out.println(bincoeff(5,2));
    }
} */

/*public class function {

    public static int f1(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int f2(int n, int r){
        int a = f1(n);
        int b = f1(r);
        int c = f1(n-r);

        int d = a / (b * c);

        return d;
    }
    public static void main (String args[]){
        System.out.println(f2(10,7));
    }
} */

/// FUNCTION OVERLOADING USING PARAMETERRS 

/// NOTE === function overloading by parameters means 
///          name of a function is same but the parameters
//           under it needs to be different 

/*public class function {
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main (String args[]){
        System.out.println(sum(40,60, 23));
        System.out.println(sum(56,89));
    }
} */

/*public class function {

    public static int multi(int a, int b){
        return a*b;
    }

    public static int multi(int a, int b, int c){
        return a* b*c;
    }
    public static void main (String args[]){
        System.out.println(multi(34,23));
        System.out.println(multi(34,67,9));
    }
} */

// FUNCTION OVERLOADING USING DATA TYPES 
   
// HERE, DATA TYPES OF FUNCTION NEEDS TO BE DIFFERENT 

/*public class function{

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum (float a, float b){
        return a+b;
    }
    public static void main (String args[]){
        System.out.println(sum(3.7f,8.9f));
        System.out.println(sum(5,9));
    }
} */

/// CHECK THE NUMBER IS PRIME OR NOT 

/*public class function {

    public static boolean isprime(int n){
        boolean isprime = true;

        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isprime = false;
            }
        }
        return isprime;
    }
    public static void main (String args[]){
        System.out.println(isprime(34));
    }
} */

/*public class function {

    public static int factorical(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    
    public static void main (String args[]){
        System.out.println(factorical(8));
    }
} */

/*public class function {

    public static int f1(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int f2(int n, int r){
        int a = f1(n);
        int b = f1(r);
        int c = f1(n-r);

        int d = a / (b * c);

        return d;
    }

    public static void main (String args[]){
        System.out.print(f2(6,3));
    }
} */

/*public class function {

    public static boolean aaa(int n){
        boolean aaa = true;
        for(int i = 2; i <= n-1; i++){
            if(i % n == 0){
                aaa = false;
            }
        }
        return aaa;
    }
    public static void main (String args[]){
        System.out.print(aaa(6));
    }
} */

/*public class function {
    public static void aaa (int a, int b){
        int sum = a + b;
        System.out.print(sum);
    }
    public static void main (String args[]){
        aaa(33,78);
    }
} */

/*public class function{

    public static void fact(int n){
        int fact = 1;
        for(int i = 1; i <=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);

    }
    public static void main (String args[]){
        fact(8);
    }
} */

// public class function{
//     public static boolean isprime(int a){
//         boolean aaa = true;
//         for(int i = 2; i <= a-1; i++){
//             if(a % i == 0){
//                 aaa = false;
//             }
//         }
//         return aaa;
//     }

//     public static void primeinrange (int n){
//         for(int i = 2; i <= n; i++){
//             if(isprime(i)){
//                 System.out.println(i + " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//         primeinrange(20);
//     }
// }

// public class function {
//     public static int multiply (int a, int b){
//         int sum = a * b;
//         return sum;
//     }

//     public static void main (String args[]){
//         int result = multiply(80,80);
//         System.out.print(result);
//     }
// }

// public class function {
//     public static int factorical (int a){
//         int f = 1;

//         for(int i = 1; i <= a; i++){
//             f = f * i;
//         }
//         return f;
//     }

//     public static int binCoeff (int n, int r){
//         int fact_n = factorical(n);
//         int fact_r = factorical(r);
//         int fact_nmr = factorical(n-r);

//         int bincoff = fact_n / (fact_r * fact_nmr);
//         return bincoff;
//     }

//     public static void main (String args[]) {
//         System.out.print(binCoeff(5, 2));
//     }
// }

// public class function {

//     public static int plus(int a, int b){
//         return a + b;
//     }
//     public static void main (String args[]){
//         System.out.print(plus(50, 15));
//     }
// }

// public class function {

//     public static int addof3(int a, int b, int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.print(addof3(4, 10, 10));
//     }
// }

// public class function {

//     public static int rtnMax (int a, int b, int c, int d){
//         if(a > b && a > c && a > d){
//             return a;
//         } else if (b > c && b > d) {
//             return b;
//         } else if (c > d) {
//             return c;
//         } else {
//             return d;
//         }
//     }
//     public static void main(String args[]){
//         System.out.print(rtnMax(56, 89, 9, 67));
//     }
// }

// public class function {

//     public static int avg(int a, int b, int c){
//         return (a + b + c) / 3;
//     }
//     public static void main (String args[]){
//         System.out.print(avg(34, 67, 89));
//     }
// }

// public class function {

//     public static boolean isEven(int n){
//         if(n % 2 == 0){
//             return true;
//         }

//         return false;
//     }
//     public static void main(String args[]){
//         System.out.print(isEven(5988));
//     }
// }

// public class function {

//     public static boolean isPrime(int n){

//         if (n <= 1) {
//             return false;
//         }

//         for(int i = 2; i <= n-1; i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.print(isPrime(7));
//     }
// }

// public class function {

//     public static long factorial(int n){
//         int f = 1;
//         for(int i = 1; i <= n; i++){
//            f = f * i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//         System.out.print(factorial(15));
//     }
// }

// public class function {

//     public static int sumofNum(int n){
//        int sum = 0;

//        for(; n > 0; n = n / 10){
//         int lastDigit = n % 10;

//         sum = sum + lastDigit;
//        }

//        return sum;

//     }
//     public static void main(String args[]){
//         System.out.print(sumofNum(4521));
//     }
// }

// public class function {

//     public static int reverseNum (int n){
//         int reverseNum = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             reverseNum = reverseNum * 10 + lastDigit;

//             n = n / 10;
//         }
//         return reverseNum;
//     }
//     public static void main(String args[]){
//         System.out.print(reverseNum(123456789));
//     }
// }

// public class function {

//     public static int powFunction(int bace, int exponent){
    
//         int sum =1;
//         for(int i = 1; i <= exponent; i++){
//             sum = sum * bace;
//         }
       
//         return sum;
//     }
//     public static void main(String args[]){
//         System.out.print(powFunction(2, 5));
//     }
// }

// public class function {

//     public static int lengthofNum(int n){

//         int count = 0;

//         while (n > 0) {
//              n = n / 10;
//             count = count + 1;            
//         }
//         return count;
//     }
//     public static void main(String args[]){
//         System.out.print(lengthofNum(2434545));
//     }
// }

// public class function {

//     public static void ispilodreme(int n){
//         int originalNumber = n;
//         int reverseNum = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             reverseNum = reverseNum * 10 + lastDigit; 
//             n = n / 10;
//         }

//         if(originalNumber == reverseNum){
//             System.out.print("Palindrome");
//         } else {
//             System.out.print("Not Palindrome");
//         }

//     }
//     public static void main(String args[]){
//         ispilodreme(1221);
//     }
// }

// public class function {

//     public static void ArmstrongNumber (int n){
//         int originalNum = n;
//         int numOfDigit = 0;
//         while (n > 0) {
//             n = n / 10;
//             numOfDigit = numOfDigit + 1; 
//         }

//         int sum = 0;
//         for(int i = 1; i <= numOfDigit; i++){
//             int lastDigit = originalNum % 10;
//             sum = powFunction(lastDigit,numOfDigit);
//             originalNum = originalNum / 10;
//         }

//     }
//     public static void main(String args[]){
//     }
// }

