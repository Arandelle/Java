/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuorder;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class MenuOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc = new Scanner(System.in);
        ArrayList<String> meal = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();    
        ArrayList<Integer> quantity = new ArrayList<>();     
        ArrayList<Double> totals = new ArrayList<>();
       
   boolean valids = false;
        while(!valids){
            
        try{
        System.out.println("CHOOSE YOUR MAIN \n1.Spaghetti $61.70 \n2.Burger    $79.88 \n3.Steak     $65.67 \n4.AlaKing   $55.30");
        String order ="";
      
        double cost=0, total =0;
        double totalcost =0,totalcostS = 0;
        double payment = 0;
        double change = 0;
        int quans=0;
        
        
        while(true){
           
            System.out.print("\nPress 0 to proceed on Side Dish: ");
            int ch = sc.nextInt();
             if(ch == 0){
                break;
             }
        
             else if(ch >=5){
                    System.out.println("Invalid Option!");
                    continue;
                 
             }else {
            System.out.print("Quantity: ");
            int quan = sc.nextInt();
             
           
            switch(ch){

                case 1:
                    order = "SPAG";
                    cost = 61.70;
                    total = cost * quan;
                    break;
                    
                case 2:
                    order = "BURG";
                    cost = 79.88;
                    total = cost * quan;
                    break;
                    
                case 3:
                    order = "STK ";
                    cost = 65.67;
                    total = cost *quan;
                    break;
                    
                case 4:
                    order = "AKNG";
                    cost = 55.30;
                    total = cost * quan;
                    break;
               
            }
            meal.add(order);
            quantity.add(quan);
            price.add(cost);
            totals.add(total);
            totalcost +=total;
  
        }
        
        } 
        
        while(!valids){
        try{

        System.out.println("CHOOOSE YOUR SIDE: \n1.CokeFLoat $27.60 \n2.Sundae    $29.90 \n3.Pie       $15.50 \n4.Fries     $45.00");
                boolean valid = false;
                
                while(!valid){
                    System.out.print("\nPress 0 to Finilize Order: ");
                    int ch = sc.nextInt();
                    if(ch == 0){
                        
                        valids = true;
                        break;
                        
                    } 
                    else if(ch >=5){
                    System.out.println("Invalid Option!");
                    continue;  
                    }
                    else{
                    System.out.print("Quantity: ");
                     quans =sc.nextInt();
                    switch(ch){
                        
                           case 1:
                           order = "CKFL";
                           cost = 27.60;
                            total= cost * quans;
                            break;
                            
                           case 2:
                            order = "SUND";
                            cost = 29.99;
                            total = cost * quans;
                            break;
                            
                            case 3:
                            order = "PIE ";
                            cost = 15.50;
                            total = cost *quans;
                            break;
                            case 4:
                                order = "FRIE";
                                cost = 45.00;
                                total = cost * quans;
                                break;
                        }
                    
                    
                    }
                    meal.add(order);
                    quantity.add(quans);
                    price.add(cost);
                    totals.add(total);
                    totalcostS += total;
                }
        }catch(InputMismatchException e){
            System.out.println("\nInvalid Input, Integer Only");
            sc.next();
        }
        
        }
       
         
        totalcost += totalcostS;
       
       
        System.out.println("\nTotal: $"+String.format("%.2f",totalcost));
         while(valids){
             
         try{   
        while(payment < totalcost){
        System.out.print("Enter Payment: ");
        payment = sc.nextDouble();
        if(payment < totalcost){
        System.out.println("Invalid Amount, Please provide exact payment!");
        }
        }
        change = payment - totalcost;
        System.out.println("Change: $"+ String.format("%.2f", change));
         System.out.println("\nRESTAURANT's RECEIPT");
        System.out.println("QTY  ITEM   COST   TOTAL");
        while(!meal.isEmpty()){
            
            System.out.println(quantity.remove(0)+"     "+meal.remove(0)+"   $"+price.remove(0)+"  $"+String.format("%.2f",totals.remove(0)));
            
        }
               
        System.out.println("\nTHANK YOU!, COME AGAIN");
        break;
        
        
  }catch(InputMismatchException e){
      System.out.println( "\nInvalid Input,Integer Only");
            sc.next();
  }
         }
        }
         
          catch(InputMismatchException e){
            System.out.println( "\nInvalid Input,Integer Only");
            sc.next();
        }
        }

    }
    
}
