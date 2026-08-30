// FOR LOOP
/*public class loops {
    public static void main (String args[]){
        for(int i = 1; i <= 10; i++){
            System.out.println("I AM BATAM");
        }
    }
} */

/*public class loops {
    public static void main (String args []){
        for(int i = 1; i <= 50; i++){
            System.out.print(i +" ");
        }
    }
} */


// CODES FOR REVERCE NUMBERS 
/*public class loops {
    public static void main (String args[]){
        int n = 989683;;
        while (n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n / 10;
        }
        System.out.println();

    }
} */

/*public class loops {
    public static void main (String args[]){
        int num = 54321;
        while(num > 0){
            int lastdigit = num % 10;     // % IS USES FOR LAST DIGIT
            System.out.print(lastdigit + " ");
            num = num / 10;        // " / " IS USES FOR REMOVING NUM
        }
        System.out.println();
    }
} */

// PRINT SQURE PATTERN 

/*public class loops {
    public static void main (String args []){
        int i = 1;
        while (i <= 10 ){
            System.out.println("*********");
            i++;
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 1; i <= 10; i++){
            System.out.println("********");
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int i = 1;
        do {
             System.out.println("********");
             i++;
        } while (i <= 10);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 54321;
        
        do {
            int lastdigit = num % 10;
            System.out.print(lastdigit + " ");
            num = num / 10; 
        } while( num > 0 );
    }
} */

/*public class loops {
    public static void main (String args []){
        for(int num = 54321; num > 0;){
            int lastdigit = num % 10;
            System.out.print(lastdigit + " ");
            num = num / 10;
        } System.out.println();
    }
} */

/*public class loops {
    public static void main (String args[]){
        int i = 0 ;
        while( i <= 100){
           if(i % 2 == 0){
            System.out.println(i + " ");
           }
           i++;
        }
    }
} */

/*public class loops {
    public static void main (String args []){
        for(int i = 1; i <= 10; i++){
            int a = i * 7;
            System.out.println(a);
        }
    }
} */

/*public class loops {
    public static void main (String args []){
        int i = 1;
        while (i <= 10){
            int a = i * 9;
            System.out.println(a);
            i++;
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int i = 1;

        do {
            int a = i * 7;
            System.out.println(a);
            i++;
        } while (i <= 10);
    }
} */

// Print numbers from 1 to 50, but skip multiples of 5
/*public class loops {
    public static void main (String args []){
        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0){
                continue;
            }
            else {
            System.out.print(i + " ");
            }
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int i = 1;
        while (i <= 100){
            if (i % 4 == 0){
                i++;
                continue;
            }
              System.out.print(i + " ");
              i++;
            
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int i = 1;

        do {
            if(i % 6 == 0){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        } while (i <= 100);
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
             sum = sum + i ;   // 
        }
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        int i = 1;
        do {
             sum = sum + i;
             i++;
        } while (i <= 100);
         System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args []){
        for(int num = 98765; num > 0;){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
        System.out.println();
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0 ){
                sum = sum + i;
            } 
        } System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        for(int i = 1 ; i <= 50; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        } System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        int i = 1;
        while(i <= 100){
            if(i % 2 == 1){
                sum = sum + i;
            } 
            i++;
        }
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;
        int i = 1;
        do {
             i++;
             if(i % 2 == 0){
                sum = sum + i;
             }
        } while (i <= 100);
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
               count++;
            }
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int count = 0;
        for(int i = 1; i <= 450; i++){
            if(i % 2 == 1){
                count++;
            }
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int num = 567890;

        while (num > 0){
            int lastdigit = num % 10 ;
            System.out.print(lastdigit);
            num = num / 10;
        }
        System.out.println();
    }
} */

/*public class loops {
    public static void main (String args []){
        int count = 0;
        for(int i = 1; i <= 230; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 1; i <= 150; i++){
            if(i % 5 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
         for(int i = 1; i <= 250; i++){
            if(i % 5 == 0){
                continue;
            }
            else if (i % 10 == 0){
                continue;
            }
             System.out.print(i+" ");
         }
         
    }
} */

/*public class loops {
    public static void main (String args[]){
        int count = 0;
        for(int i = 1; i <= 125; i++){
            count++;
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 100; i > 0; i--){
            System.out.print(i+" ");
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 200; i > 0; i--){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
} */



/*public class loops {
    public static void main (String args []){
        for(int i = 1; i <= 70; i++){
            if(i == 45){
                break;
            }
            System.out.print(i+" ");
        }
    }
} */

/*public class loops {
    public static void main (String args []){
        for(int i = 0; i <= 200; i++){
            if(i == 106){
                break;
            }
            else if (i % 2 == 0){
                System.out.print(i+" ");  
            }
            
        }  
    }
} */

/*public class loops {
    public static void main(String args []){
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                continue;
            }
            else if (i == 72){
                break;  
            }
            System.out.print(i+" ");
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 0; i <= 5; i++){
            System.out.println("hello");
            i+=2;
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum = sum + i;
            } 
        }  System.out.println("SUM OF EVEN NUMBERS = "+sum);

        int sun = 0;
        for(int i = 1; i <= 100; i++){
             if(i % 2 == 1){
              sun = sun + i;
            }
            
        }  System.out.println("SUM OF ODD NUMBERS = "+sun);
    }
} */

/*public class loops {
    public static void main (String args []){
        int n = 10 ;
        int fact = 1;

        for(int i = 1; i <= n; i++ ){
            fact = fact * i;
        }
        System.out.print("fictorial of num 10 = "+ fact);
    }
} */

/*import java.util.Scanner;
public class loops {
    public static void main (String args []){
          Scanner sc = new Scanner(System.in);

          int num = sc.nextInt();
         
          for(int i = 1; i <= 10 ; i++){
             int sum = num * i;
             System.out.println(sum);
          }
          System.out.println();
          
    }
} */

/*public class loops {
    public static void main (String args[]){
        int num = 43869;
        int count = 0;
        int sum = 0;

        while (num > 0){
            int lastdigit = num % 10;
            sum = sum +lastdigit ;
            num = num / 10; 
        }
          System.out.print(sum );
        
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        for(int num = 5577745; num > 0;){
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 347859;
        int count = 0;

        while (num > 0){
            num  = num / 10;
            count++;
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 678990;

        while ( num > 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10;
        }
        System.out.println();
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 52423;
        int sum = 1;

        while (num > 0){
            int lastdigit = num % 10 ; 
            sum = sum * lastdigit ;
            num = num / 10;
           
        }
         System.out.print(sum);
        
    }
} */

/*public class loops {
    public static void main (String args[]){
        int num = 347479;
        int max = 0;

        while (num > 0){
            int lastdigit = num % 10;

            if( lastdigit > max ){
                 max = lastdigit;
            }
            num = num / 10;
        }
        System.out.print(max);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 384726;
        int max = 0;

        while (num > 0){
            int bignum = num % 10;

            if(bignum > max){
                max = bignum;
            }
            num = num / 10;
        }
        System.out.print(max);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 2486593;
        int min = 9;

        while (num > 0){
            int minnum = num % 10 ;

            if(minnum < min){
                min = minnum;
            }
            num = num / 10;
        }
        System.out.print(min);
    }
} */

/*public class loops {
    public static void main (String args []){
        int num = 987654321;

        while (num > 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10;
        }
        System.out.println();
    }
} */

/*public class loops {
    public static void main (String args[]){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        for(int j = 1; j <= 100; j++){
            if(j % 2 == 1){
                System.out.print(j+ " ");
            }
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int count = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                count++;
            }

        }  System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }  System.out.print(sum);

    }
} */

/*public class loops {
    public static void main (String args[]){
        int num = 7;
        for(int i = 1; i <= 10; i++){
            int aaa = i * num;
             System.out.println(aaa);
        }
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum = 0;
        for(int num = 345678; num > 0;){
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        System.out.print(sum);
    }
} */

/*public class loops {
    public static void main (String args []){
        int count = 0;

        for(int num = 34569021; num >0;){
            int lastdigit = num % 10;
            count++;
            num = num / 10;
        } 
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int count = 0;

        for(int num = 45679; num > 0;){
            int lastdigit = num % 10;
            count++;
            num = num / 10;
        }
        System.out.print(count);
    }
} */

/*public class loops {
    public static void main (String args []){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 500; i++){
            if(i % 2 == 0){
                count++;
                sum = sum + i;
            }
        }  System.out.println(sum);
        System.out.println(count);
    }
} */

/*import java.util.*;

public class loops {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++){
             fact = fact * i;
        }
            System.out.print(fact);
    }
} */

/*public class loops {
    public static void main (String args[]){
        int sum;
        for(int i = 1; i <= 10; i++){
            sum = i * 7;
            System.out.println(sum);
        }
        System.out.println();
    }
} */





