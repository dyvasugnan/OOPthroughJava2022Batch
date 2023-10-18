class cricket{
    public static void main(String[] args){
       int test=17,ODI=140,amount=0,IPL=0;
          char country='i';
          char x='m';
    System.out.print("enter number of test matches played:12");
    System.out.print("enter number of ODI's:140");
        if(test>10 && ODI==100){
          System.out.println("amount received is 50,000:");
       }
       else if(test>10){
         System.out.println("amount received is 25,000:");
       }
       else if(ODI>100){
        System.out.println("amount received is 15000:");
       }
      else if(country=='i'){
        System.out.println("amount received is 10000:");
       }
     else if(country=='i' && x=='a'){
          amount+=amount/4;
        System.out.println("amount received:");
      }
    else if(country=='i' && IPL>=1){
       System.out.println("amount recieved is 8000:");
     }
   else{
       
      System.out.println("amount received is 7000:");
    }

    }
}

         