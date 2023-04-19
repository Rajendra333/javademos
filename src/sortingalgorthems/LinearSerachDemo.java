package sortingalgorthems;

public class LinearSerachDemo {
	

	public static void main(String[] args) {
		int searchitem=9;
		
		int [] array= {99,88,9,8,7,89,90,4,3,2};
		int index=LinearSearch(array,searchitem);
		if(index==-1) {
			System.out.println("Item"+searchitem+"not found");
		}else {
			System.out.println("Item "+searchitem+" found"+ index);
		}
	
  }
	private  static int LinearSearch(int[] array,int searchitem) {
		for(int i=0;i<array.length;i++) {
           if(array[i]==searchitem) {
        	   return i;
           }			
		}
		return -1;
		
	}
}
