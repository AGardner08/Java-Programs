package OOP.Concurrency;

public class Main {

    public static void main(String[] args) {

        //Create a thread with a Runnable interface
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Printing " + i + " in a worker thread");
                    //Exceptions make apps crash
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } //end for loop

            }
        });
        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("Printing " + i + " in main thread");
            //Exceptions make apps crash
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } //end for loop

    }

}
