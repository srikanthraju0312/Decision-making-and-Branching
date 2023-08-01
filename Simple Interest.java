//this program displays the loan amount to be repaid by the user.
class Amount
{
    float principle;
    float time;

    void show(float a, float b)
    {
        principle = a;
        time = b;
    }
}

class repay
{   
    public static void main(String[] args) {
        int interest = 3;
        float totrepay;
        Amount user1 = new Amount(); //new object created
        user1.show(10000,1);
        totrepay = user1.principle*(1+ interest*user1.time);

        System.out.println("The total amount to be paid after 1 year is"+totrepay);
    }
}