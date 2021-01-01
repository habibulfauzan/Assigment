class Main {
	public static void main(String[] args) {
		int angka[] = {4, 2, 3, 3, 2, 4, 6, 7, 3, 9};
		System.out.print(ujian(angka));
	}
	
	static int ujian(int no[]){
	  int Array[] = new int [no.length];
	  int Max = 0;
	  
	  for (int i = 0; i < no.length; i++){
	    for (int j = 0; j < i; j++){
	      if (no[i] > no[j]) {
	        Array[i] = Math.max(Array[i], Array[j] + 1);
	      }
	    }
	    Max = Math.max(Array[i], Max);
	  }
	  return Max + 1;
	}
}