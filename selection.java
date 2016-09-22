public class selection{


public static void seleccion(int[]matrix){
        int i, j, k, p, buffer, limit = matrix.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(matrix[i] < matrix[p]) p = i;
                if(p != k){
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
	for(int m=0;m < matrix.length;m++){
	System.out.println(matrix[m]);
	}
    }


public static void main (String args[]){

	int colection[]={4,3,2,1,1,2,1,3,2,1,2,1};
	selection ob1 = new selection();
	ob1.seleccion(colection);


}


}

