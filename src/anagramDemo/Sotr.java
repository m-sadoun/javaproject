package anagramDemo;

public class Sotr {
    public static void main(String[] args) {
        int A[]={10,3,15,5,600,0};
        int temp;
        for (int i=0; i< A.length; i++){
            for (int j=i+1; j< A.length; j++){
                if(A[i]>A[j]){
                     temp =A[j];
                    A[j]= A[i];
                    A[i]= temp;
                }

            }
        }
        for (int k=0; k< A.length; k++){
            System.out.println(A[k]);
        }
    }
}
