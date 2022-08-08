public class Task6 {
    public static void main(String[] args) {
        int iskl = 0;
        for (int i = 0; i < 99999; i++) {
        String s = String.valueOf(i);
            if(s.indexOf('4')!=-1){
                iskl++;
            }
            else if(s.indexOf('1')!=-1 & s.indexOf('1')+1==s.indexOf('3')){
                iskl++;
            }
        }
        System.out.println("Isklychit " + iskl + " numbers");
    }
}
