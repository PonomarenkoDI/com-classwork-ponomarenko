package cw10112022;

public class Task1_1 implements Runnable {
    private Task1 schet;
    private Task1_1_1 person;

    public void MangeShet (Task1 schet, Task1_1_1 person){
        this.schet = schet;
        this.person = person;

    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.currentThread().setName("person name is: " + person);
                Thread.sleep(500);
                schet.getMyMoney(person.sum);
             }catch (InterruptedException e){
                e.printStackTrace();
                }
            }
        }

    }

