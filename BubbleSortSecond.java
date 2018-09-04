public class BubbleSortSecond{
  public static void main(String[] args){
    //Create an array, then suffle the array
    int[] array={65,14,28,5,7,24};
    //Create the BubleSortZ's objective
    BubbleSortZ sorter=new BubbleSortZ();
    sorter.sort(array);
  }
  public void sort(int[] array){
    for(int i=1;i<array.length;i++){
      //Compare adjacent elements,the bigger one will move to the right
      boolean isSorted=true;
      //Marking order label, the original value of each round is true
      for(int j=0;j<array.length-i;j++){
        if(array[j]>array[j+1]){
          int temp=array[j]; //Save the value of the first element
          array[j]=array[j+1]; //Assign the second element value to the first element
          array[j+1]=temp; //Assign thetemp value to the second element
          isSorted=false;
          //Neighbor elements exchange exists, so it is out of order, label is marked as false
        }
           }
      if(isSorted){
        break;}
           }
           showArray(array); //Display the sorted array
           }
           /**
           *print all the elements in the array
           *
           *@param array
           */
           public void showArray(int[] array){
             for(int i:array){
               System.out.print(" "+i);
             }
             System.out.println();
           }}