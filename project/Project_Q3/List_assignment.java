public class List_assignment {
	//fields
	private Double[] my_array = new Double[100]; //uses wrapper class to allow the use of null values
	private int counter = 0; //new instance of array starts the counter at 0
	
	//adds element to end of array
	public void push(double a){
		try{
			my_array[counter] = a; //adds the value of a into the next spot that is null
		}
		catch(NullPointerException e){
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.printf("The stack is already full\n");//only happens when the array is full
		}
		counter++; //moves to the next position in the array
	}
	
	//methods
	//removes most recent element
	public void pop(){	
		if(counter > 0){//checks if 
			counter--;//decrements the value of counter
			my_array[counter] = null;//sets the value in my_array to null
		}
		else{
			System.out.printf("The stack is empty\n");//prevents run time errors by preventing popping an empty stack
		}
	}
	
	//views recently added element
	public double peek(){
		try{
			return my_array[counter-1];//returns the most recent element
		}
		catch(NullPointerException e){
			return my_array[counter-1];
		}
	}
	
	//gets the size of the array
	public int size(){
		return counter;//returns the value of counter
	}
	
	//prints all elements
	public void printing(){
		int i = 0;//used to compare
		if(counter > 0){	
			while(i < counter){
				System.out.printf("%f\n", my_array[i]);
				i++;
			}
		}
		else{
			System.out.printf("There are no values to show\n");
		}
	}
	//constructor
	List_assignment(){
		
	}
}
