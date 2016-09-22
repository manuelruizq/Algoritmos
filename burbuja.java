public class burbuja{


public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
	for(int i=0;i < matrix.length;i++){
	System.out.println(matrix[i]);
	}
    }


public static void main (String args[]){

	int colection[]={1,2,3,4,3,2,1};
	burbuja ob1 = new burbuja();
	ob1.burbuja(colection);


}


}
//se pueden hacer menos iteraciones
