package Array;

import java.util.Scanner;

// array introduction
class Introduction {
  // array
  // memory [] is 1 byte and int take space 4 byte = [][][][]
  // int [] arr = new int[5]; will take 20 byte,(5 int * 4 byte)
  // it find a space where all 5 int box store one after another
  // when you insert new value it will find new place where total
  // 6 box will get enough space for contigious manner in memory
  // every byte have memory address like 101 then 102 then 103
  // because of this its searching a element is so fast ------>
  // when you want to find a element you dont have to read this
  // array because you can get directly arr[3456] index value
  // getting array operation is king** time complexity is O(1);
  // but problem is )> when [32][44][8][56][90] , want to add 12
  // where 8 is located then i have to shift 90 then 56 then 8
  // insersion time complexity is O(n); its array limitation

  // array data structure is collection of similar data type
  // in a contiguios memory allocation & its zero based indexing

  // --> declaration
  int[] numbers = new int[10]; // size fixed
  int[] ages; // null value

  // array literals declaration
  int[] arrayName = { 1, 34, 45, 4, 65, 5 };
  String nameList[] = { "dev", "posto", "piu" };

  // int [] code = {10,34}
  // int = 4 byte so 4byte * 2int = total 8 byte
  // ----10------ ______ ----34----
  // __[] [] [] [] _____ [] [] [] [] <- bytes
  // 101 102 103 105 ___ 106 107 108 109
  // <- actual memory address is hexadecimel value not 101

  // --> access element (zero based indexing)
  // int[] arrayName = { 1, 34, 45, 4, 65, 5 };
  // -------------------0--1--2--3--4--5--6----index
  // System.out.println(arrayName[1]); // output : 34

  // in java array is also object
  // stack memory contain premitive data type and fn ref
  // and our heap memory contain object,so when we create
  // int [] ages; our stack store only null value, when
  // assign ages = new int[2]; now it store in heap memory but
  // only 1st one memory address ref store within stack memory
  // its mean if i have first address i can get all address
}

// array example :
class typesOfArray {

  void demoArray() {
    // define array
    int[] ages = new int[3];

    // assign value
    ages[0] = 45; // value assign
    ages[1] = 67; // value assign
    ages[2] = 78; // value assign

    // update
    ages[0] = 34;

    // memory restrict because of fix length
    ages[5] = 89; // it gives error
    ages[-5] = 89; // it gives error
    // error : Index 5 out of bounds for length 3

    // print
    System.out.println(ages[0]); // 45
    System.out.println(ages[1]); // 67
    System.out.println(ages[2]); // 78

    // length
    System.out.println(ages.length); // 3

  }

  // 2d array
  void create2d() {
    // define 2d array literal
    // int[][] house = { { 3, 7, 2 }, { 5, 9, 2 } }; // => 24 byte
    // multi dimensional [ [3,7,2] , [5,9,2] ] array of array
    // 0 index contain 0,1,2 index & 1 index contain 0,1,2 index

    // define multidimensional
    int[][] books = new int[1][3]; // one index contain 3 element

    // assign value
    books[0][0] = 90;
    books[0][1] = 67;
    books[0][2] = 34;

    // print
    System.out.println(books[0][0]); // 90
    System.out.println(books[0][1]); // 67
    System.out.println(books[0][2]); // 34

  }

  // 3d array
  void create3d() {
    int[][][] abcd = new int[2][3][3];
    abcd[0][0][0] = 67;
    abcd[0][1][1] = 54;
    abcd[0][2][2] = 21;
  }

}

// terverse array using loop
class printDiffTypeArray {

  // 1d array
  void print() {
    int[] google = { 45, 65, 24, 25, 254, 22, 45 };

    // for loop
    for (int i = 0; i < google.length; i++) {
      System.out.println(google[i]);
    }

    // for each
    for (int i : google) {
      System.out.println(google[i]);
    }

    // while loop
    int i = 0;
    while (i < google.length) {
      System.out.println(google[i]);
      i = i++;
    }
  }

  // 2d array
  void print2d() {
    int[][] google = { { 45, 65, 24 }, { 254, 22, 45 } };

    // for loop in 2d
    for (int i = 0; i < google.length; i++) {
      for (int j = 0; j < google[i].length; j++) {
        System.out.println(google[i][j]);
      }
    }
  }
}

// taking array input in java
class CreateArrayUsingInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("enter " + n + " elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    sc.close(); // close the scanner object

    System.out.println("array list");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " [" + i + "]");
    }
  }
}

// method pass by value
class methodPassByValue {

  // int[] array = { 1, 2, 3, 4, 5 };

  // shallow copy
  // int[] arr_2 = array;
  // reference mean (pointing to same source)
  // array first one memory address stored in stack memory
  // all array element stored in heap memory so when we
  // copy original array it actually store same stack memory
  // first address also it reference the same heap location
  // it mean 2 stack diff variable pointing same heap memory
  // address ,so any change can effect the original data

  // deep copy
  // it create new stack and new heap memory address
  // int[] arr_2 = array.clone();

  // pass by value ------------------>

  // variable
  // variable dont update using method pass by value
  // pass by value 5 so value will copy here so we dont have
  // access variable so change doesnot affect actual variable
  static void change_variable(int a) {
    a = 56;
  }

  // array
  // trying to update array through argument
  // pass by value mean,here array memory address copied
  // so it update heap memory directly,also method execute
  // and change and teminate but permanent change in heap
  static void change_arr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }
  }

  public static void main(String[] args) {

    // variable will not update
    int a = 34;
    change_variable(a); // its passing this vaule,not variable
    System.out.println(a); // 34

    // array will update
    int[] arr = new int[3];
    arr[0] = 15;
    arr[1] = 23;
    arr[2] = 35;

    // array will update value 0
    change_arr(arr);

    // print
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]); // 0 0 0
    }
  }
}