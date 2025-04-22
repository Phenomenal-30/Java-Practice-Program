public class BankAccountOuterClass {
    long account_num=4023056473L;
    int balance=543215;
    void acc(){
        System.out.println(account_num);
    }
    void bal(){
        System.out.println(balance);
    }
    class Transaction{
        void Withdrawl(){
            System.out.println("Money have been deducted from your account");
        }
        void Deposit(){
            System.out.println("Money have been credited to your account");
        }
    }
    public static void main(String args[]){
        BankAccountOuterClass obj=new BankAccountOuterClass();
        BankAccountOuterClass.Transaction obj2=obj.new Transaction();
        obj.acc();
        obj.bal();
        obj2.Withdrawl();
        obj2.Deposit();
    }
}
