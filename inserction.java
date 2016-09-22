public class inserction{


public static void inserction(int[]vector){
       for (int i=1; i < vector.length; i++) {
         int aux = vector[i];
         int j;
         for (j=i-1; j >=0 && vector[j] > aux; j--){
              vector[j+1] = vector[j];
          }
         vector[j+1] = aux;
      }

	for(int i=0;i < vector.length;i++){
	System.out.println(vector[i]);
	}
    }


public static void main (String args[]){

	int colection[]={1,2,3,4,3,2,1,2,1,2};
	inserction ob1 = new inserction();
	ob1.inserction(colection);


}


}

