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

// public class array {

//     public static int aaa(int numbers[], int key){
//         int count = 0;

//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 count++;
//             } 
//         }
//         return count;
//     }
//     public static void main (String args[]){
//         int numbers[] = {2,4,6,2,7,2,8,2,7,2,9,};
//         int key = 2;

//         int index = aaa(numbers, key);

//         if(index == 0){
//             System.out.print("Key dont find");
//         } else {
//             System.out.print(key + " occurs "+ index + " times" );
//         }
//     }
// }

// public class array {

//     public static int linearSearch(int number[], int key){
//         for(int i = 0; i < number.length; i++){
//             if(key == number[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int number[] = {2,4,8,1,5,9};
//         int key = 5;

//         int index = linearSearch(number, key);

//         if(index == -1){
//             System.out.print("target not found");
//         } else {
//             System.out.print(index);
//         }
//     }
// }

// public class array {

//     public static int linearSearch(String name[], String target){
//         for(int i = 0; i < name.length; i++){
//             if(target == name[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         String name[] = {"piyush", "virat", "rohit", "kartik"};
//         String target = "rohit";

//         int index = linearSearch(name, target);

//         if(index == -1){
//             System.out.print("not found");
//         } else {
//             System.out.print("name "+ target + index);
//         }
//     }
// }

// public class array {

//     public static int countTarget(int number[], int target){
//         int count = 0;
//         for(int i = 0; i < number.length; i++){
//             if(target == number[i]){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]){
//         int number[] = {2,5,6,2,4,6,8,2,2,6,2,2,2};
//         int target = 2;

//         int index = countTarget(number, target);

//         if(index == 0){
//             System.out.print("not found");
//         } else {
//             System.out.print(index);
//         }
//     }
// }

// public class array {

//     public static void firstOccurence(int number[], int target){

//         boolean found = false;

//         for(int i = 0; i < number.length; i++){
//             if(target == number[i]){
//                 System.out.print(i);
//                 found = true;
//                 break;
//             } 
//         }
//         if(!found){
//             System.out.print("not found");
//         }
//     }
//     public static void main(String args[]){
//         int number[] = {9,5,3,5};
//         int target = 5;

//         firstOccurence(number, target);
//     }
// }

// public class array {

//     public static void findLastindex(int number[], int target){
//         int lastindex = -1;

//         for(int i = 0; i < number.length; i++){
//             if(number[i] == target){
//                 lastindex = i;
//             }
//         }
//         System.out.print(lastindex);
//     }
//     public static void main(String args[]){
//         int number[] = {3,4,6,3,65,8,4,2};
//         int target = 3;

//         findLastindex(number, target);
//     }
// }

// public class array {

//     public static void printMaxNumber(int numbers[]){
//         int largestNumber = 0;

//         for(int i = 0; i < numbers.length; i++){
//             if(largestNumber < numbers[i]){
//                 largestNumber = numbers[i];
//             }
//         }
//         System.out.print(largestNumber);
//     }
//     public static void main(String args[]){
//         int numbers[] = {45,67,3,45,7,8,63,4,5,5};
//         printMaxNumber(numbers);
//     }
// }

// public class array {

//     public static void printSmallestNumber(int numbers[]){

//         int smallestNumber = numbers[0];

//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] < smallestNumber){
//                 smallestNumber = numbers[i];
//             }
//         }
//         System.out.print(smallestNumber);
//     }
//     public static void main(String args[]){
//         int numbers[] = {10,48,58,27,68,47,27,59,37,47};

//         printSmallestNumber(numbers);
//     }
// }

// public class array {

//     public static void sumOfArrayElement(int number[]){

//         int sum = 0;

//         for(int i = 0; i < number.length; i++){
//             sum = sum + number[i];
//         }
//         System.out.print(sum);
//     }
//     public static void main(String args[]){
//         int number[] = {23,5,6,7,5,56,7,64,13,89,};
//         sumOfArrayElement(number);
//     }
// }

// public class array {

//     public static int binarySearch(int numbers[], int target){
//         int start = 0;
//         int end = numbers.length -1;

//         while(start <= end){
//             int mid = (start + end) / 2;

//             if(numbers[mid] == target){
//                 return mid;
//             }
//             if(numbers[mid] < target){
//                 start = mid + 1;
//             } else {
//                 end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]){
//         int numbers[] = {34,56,78,90,112,114,145,567};
//         int target = 56;

//         System.out.print("index of target number is "+binarySearch(numbers, target));
//     }
// }

// public class array {

//     public static void reverseAnArray(int arr[]){

//         int first = 0;
//         int last = arr.length -1;

//         while(first < last){
//             int temp = arr[last];
//             arr[last] = arr[first];
//             arr[first] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main (String args[]){
//         int arr[] = {10,20,30,40,50};

//         reverseAnArray(arr);

//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }