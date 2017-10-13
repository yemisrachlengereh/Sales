import  java.util.Scanner;
public class Report{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int customer_id;
        String name,answer;
        double sales_amount;
        String tax_code;
        double sales_tax;
        double total_amount;
        double tax_amount = 5;
        double NPF = 0, NRM = 0.6, BIZ = 0.045;

        do {
            System.out.println("enter customer_id:");
            customer_id = sc.nextInt();

            System.out.println("enter customer_name:");
            name = sc.next();

            System.out.println("sale amount:");
            sales_amount = sc.nextInt();

            System.out.println("enter customer_id:");
            customer_id = sc.nextInt();


            sales_tax = sales_amount * tax_amount;
            total_amount = sales_amount * sales_tax;
            sc.nextLine();
            System.out.println("enter tax code:");
            tax_code = sc.nextLine();



            if (tax_code.equalsIgnoreCase("npf")) {
                sales_tax = sales_amount * 0;
            } else if (tax_code.equalsIgnoreCase("biz")) {
                sales_tax = sales_amount * 0.045;

            } else if (tax_code.equalsIgnoreCase("NRM")) {
                sales_tax = sales_amount * 0.6;


            }

            System.out.println("do you want to enter another reord:y/N");
            answer = sc.nextLine();



        }while (answer.equalsIgnoreCase("y")) ;;

    }
}

