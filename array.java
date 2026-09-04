// public class array {
//     public static void main(String args[]){
//         int num[] = {1,2,3};
//         System.out.print(num[1]);
//     }
// }

// public class array {

//     public static void main (String args[]){
//         String name[] = {"piyush", "virat"};
//         System.out.print(name[0]);
//     }
// }

// public class array {

//     public static void print(int marks[]){
//         for(int i = 0; i < marks.length; i++){
//             marks[i] = marks[i] + 4;
//         }
//     }
//     public static void main (String args[]){
//         int marks[] = {56,76,46,26};
//         print(marks);

//         for(int i = 0; i < marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }

// public class array {

//     public static void print(int num[]){
//         for(int i = 0; i < num.length; i++){
//             num[i] = num[i] + 5;
//             System.out.print(num[i] + " ");
//         }
//     }
//     public static void main (String[] args){
//         int num[] = {5,10,15};
//         print(num);
//     }
// }

// public class array {

//     public static int linearSearch(int num[], int key){
//         for(int i = 0; i < num.length; i++){
//             if(key == num[i]){
//                 return i;
//             } 
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int num[] = {34,57,78,79,23,98};
//         int key = 78;

//         int index = linearSearch(num, key);

//         if(index == -1){
//             System.out.print("Key Don't found");
//         } else {
//             System.out.print("key found "+ key + " on index "+ index);
//         }
//     }
// }

// public class array {

//     public static int searchFruits(String fruits[],String key){
//         for(int i = 0; i < fruits.length; i++){
//             if(fruits[i].equals(key)){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]){
//         String fruits[] = {"mango", "banana", "gava", "orange","papaya"};
//         String key = "orange";

//         int index = searchFruits(fruits, key);

//             if(index == -1){
//                 System.out.print("Fruit was not avaliable");
//             } else {
//                 System.out.print("Fruit was avalible " + key + " on index "+ index);
//             }
        
//     }
// }

// public class array {

//     public static int CountKey (int numbers[], int key){

//         int count = 0;
//         for(int i = 0; i < numbers.length; i++){
//             if (numbers[i] == key) {
//                 count++;   
//             } 
//         }
//         return count;
//     }
//     public static void main (String args[]){
//         int numbers[] = {4,5,7,4,4,8,2,4};
//         int key = 4;

//         int index = CountKey(numbers, key);

//         if(index == 0){
//             System.out.print("key don't found");
//         } else {
//             System.out.print(index);
//         }
//     }
// }

// public class array {

//     public static void keyIndexes (int number[], int key){
//         boolean found = false;

//         for(int i = 0; i < number.length; i++){
//             if(number[i] == key){
//                 System.out.print(i+" ");
//                 found = true;
//             }
//         }
//             if(!found){
//                 System.out.print(-1);
//             }
//             System.out.println();
//     }

//     public static void main (String args[]){
//         int number[] = {10,45,23,78,10};
//         int key = 10;

//         keyIndexes(number, key);
//     }
// }

public class array {

    public static int aaa(int numbers[], int key){
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                count++;
            } 
        }
        return count;
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,2,7,2,8,2,7,2,9,};
        int key = 2;

        int index = aaa(numbers, key);

        if(index == 0){
            System.out.print("Key dont find");
        } else {
            System.out.print(key + " occurs "+ index + " times" );
        }
    }
}