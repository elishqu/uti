package lessn_2_homework;

public class Ex4 {
    public static void main(String[] args) {
        boolean isHasebleMIlk = false;
        boolean isHasebleBread = true;

        if (isHasebleMIlk && isHasebleBread == true) {
            System.out.println("молодец сынок, купил и хлеб и молоко!");
        }
       // else if (isHasebleMIlk || isHasebleBread == true) {
            //System.out.println("молодец сынок купил хоть, что-то"); }
         else if (isHasebleMIlk == true) {
            System.out.println("молодец сынок купил молоко");
        } else if (isHasebleBread == true) {
            System.out.println("молодец сынок купил хлеб");
        }
        else {
            System.out.println("ты не молодец сынок, ничего не купил");
        }
    }
}
