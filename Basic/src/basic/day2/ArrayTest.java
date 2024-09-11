package basic.day2;

public class ArrayTest {

	public static void main(String[] args) {
	int [] arr=new int[10];
	//or
	//array is start from  0 to n-1;
	//array is store homogenous data type.
	//Array is static in nature.
	//Array can store identical data and  in contagious memory location.
	//Contagious memory location: In the memory for each element is allocated continously.
	//If the size is greater than length of an array , you will get Arrayindexout of bound exception
	//Array can't grow or shrink depending on the current size or current element or it will not  expand if you add new element
	// to the array because array is static in nature 
	//If you add to new element to existing array, it will give arrayindexoutofbound exception/
	
	int arr1[]= {1,2,3,4,5,6};
	String arr3[]={"flow","flower"};
	or//
	int []ob=new int[5];
	
	//Declaration
	String arr2[];
	arr2= {"flow","flower"};
	String arr4[];
	arr4[]=new String{"flow","flower"};
	String[]ob3=new String[10];
	//Can we store 10 different student object  details in  aString?
	//Ans No, we can store 10 different student object in the Student object array but not String array.
	//String can store same kind of data.Student array contain mutiple attributes .so we need to go Object array.

	//Example.
	Student std[]=new Student[10];
	
	
	
	
	

	}

}
