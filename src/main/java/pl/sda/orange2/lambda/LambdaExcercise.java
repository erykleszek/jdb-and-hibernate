package pl.sda.orange2.lambda;

public class LambdaExcercise {
    public static void main(String[] args) {


        BoysDontCry boy = new chlopakinieplacza();
        boy.silnoreki();
        // boy.sing();
        chlopakinieplacza boy2 = new chlopakinieplacza();
        boy2.sing();

        //annonymuous class

        BoysDontCry annomymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoręki:");
            }
        }}



    }
}
