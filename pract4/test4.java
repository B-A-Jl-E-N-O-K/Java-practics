package pract4;

public class test4 {
    public static void main(String[] args) {
        MyExecService executorService = new MyExecService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Второе");
        });

        executorService.execute(() -> System.out.println("Первое"));
        executorService.shutdown();
    }
}
