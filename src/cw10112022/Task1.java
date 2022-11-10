package cw10112022;

public class Task1 {
    private int shetSumm = 3000;

    public synchronized int getMyMoney(int summa) {
        if (shetSumm < summa) {
                throw new IllegalArgumentException("Ne hvataet deneg");
            }
            shetSumm -= summa;
            System.out.println("ja vzal" + summa);
            System.out.println("Ostatok na schetu: "+summa);
            return summa;
        }
    }
