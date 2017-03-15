package com.esjay;


public class ThisKey {



    public static void main(String[] args)

    {
         ThisKey obj2 = new ThisKey();
          //  ThisKey obj = new ThisKey();
            obj2.Method2();


    }

    /*

    public void Method1(){

       new ThisKey2(this);
        obj2.Method2();
        System.out.println(this);
       ThisKey2 a = new ThisKey2();

       //System.out.println(a.thisKey);
    }
*/
    public static void Method2(){
        System.out.println("Somethings working");
    }
}

/*

class ThisKey2{

    public ThisKey thisKey;

    public ThisKey2(ThisKey thisKey){


        this.thisKey=thisKey;
        System.out.println(this.thisKey);
        //System.out.println(thisKey);

    }
    public void calledThisKey(){
        System.out.println("First");
        thisKey.Method2();
        System.out.println("Second");

    }



}
*/