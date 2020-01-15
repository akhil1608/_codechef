class zero {
	public static void main(String args[]) {
		int array[] = {-1,23,40,-10,20,5};
		int i,j;
		int a = array[0], b = array[1];
		double closest = Math.abs(array[0]+array[1]); //Initializing with the sum of first two elements
		for(i=0;i<6;i++) {
			for(j=i+1;j<6;j++) {
				if(Math.abs(array[i]+array[j])<closest) { //if |array[i]+array[j]|<closest, then it is closer to zero
					closest = Math.abs(array[i]+array[j]);
					a = array[i];
					b = array[j];
				}
			}
		}
		System.out.println("The two elements whose sum is closest to zero are "+a+","+b);
	}
}