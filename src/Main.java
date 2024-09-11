public class Main {
    public static void main(String[] args){

        int [] tablicalosowa = new int [6];
        for (int i = 0; i <tablicalosowa.length; i++) {
            tablicalosowa[i] = (int) (Math.random()*100+1);
        }
        System.out.println("wylosowana tablica");
        for (int element:tablicalosowa) {

            System.out.print(element + ", ");
        }
    }
}