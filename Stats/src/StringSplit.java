import java.util.*;
public class StringSplit {
	

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter numbers");
		String n = k.nextLine();
		String [] numArrayList = n.split(",");
		Integer[] intArray = new Integer[numArrayList.length];
		for (int i=0; i<numArrayList.length;i++) {
			Integer num = Integer.parseInt(numArrayList[i]);
			intArray[i]=num;
			list.add(intArray[i]);
			//System.out.println(intArray[i]);
		}
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		int count = 0;
		//int avg = Collections.
		System.out.println("max = "+max);
		System.out.println("min = "+ min);
		System.out.println("number of elements: " + list.size());
		for(int i = 0; i < list.size(); i++)
		{
			//System.out.println(list.);
			count = count + list.get(i);
		}
		int avg = count/list.size();
		System.out.println("sum = " + count);
		System.out.println("average = "+avg);

	}

}
