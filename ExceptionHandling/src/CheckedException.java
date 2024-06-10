public class CheckedException {

    public static void runTask() throws InterruptedException {
        Thread.sleep(1000); // can throw InterruptedException
    }

        public static void main(String[] args) {
            try {
                runTask(); // throw an InterruptedException
            } catch (InterruptedException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }


