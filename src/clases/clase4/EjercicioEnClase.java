package clases.clase4;

public class EjercicioEnClase {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4};
        for(int i=0;i<arr01.length;i++){
            if(i>0 && i<arr01.length-1){
                System.out.println("Valor " + arr01[i]);
            }
        }
    }
}
