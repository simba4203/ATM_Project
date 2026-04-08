import java.util.Scanner;



public class atmpartices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 4203;
        int enterpin;
        Double balance=5000.00;
        Double limit=2000.00;
        

        System.out.println("enter the pin ");
        enterpin = sc.nextInt();

        if(enterpin == pin){
            int choice;
            do{
                  System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                choice =sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("balance" + balance ) ;    
                        
                        break;
                    case 2: 
                        System.out.print("Enter the amout to deposti:");
                        double deposit = sc.nextDouble();
                        if (deposit>0){
                        balance += deposit;
                        System.out.println(" pasie aagya accout mai bhai");
                        }else{
                            System.out.print("bhai amout sahi daal");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount: ");
                        double paisenikal = sc.nextDouble();
                         if (paisenikal > limit){
                             System.out.println("Limit utni nhi hai bhai " + limit);
                         } else if (paisenikal > balance) {
                        System.out.println("pasie nhi hai bhai!");
                           } else{
                            balance = balance - paisenikal;
                            System.out.println("nikal gye pasie!");
                           }                
                            break;
                    case 4 :
                        System.out.println("thanks bhai use karne kele ");
                        break;
                
                    default:
                        System.out.println("bhai thik se dekh kar prees kar ");
                        break;
                }

            }while (choice !=4); 
                
            
        }else{
            System.out.println(" thik se pin dal ");
        }
        sc.close();
        
    }
    
}
