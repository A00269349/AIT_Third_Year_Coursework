class SimpleThreadRunnable implements Runnable {
    String name;

    public SimpleThreadRunnable(String name) {
        this.name = name;

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + name);
            try {
                //sleep((long)(Math.random() * 1000));
                Thread.sleep(1000);
                //sleep(1000);
                //sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + name);
    }
}
