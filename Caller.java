package com.esjay;

/**
 * Created by Suvajit on 31/07/16.
 */


    public class Caller{
    private Called called;

        public static void main(String[] args)

        {

            Caller obj = new Caller();
            obj.callerClassMethod1();

        }



        public void callerClassMethod1(){
            new Called(this);
        }

        public void callerClassMethod2(){
        }
    }

    class Called{
        private Caller caller;

        public Called(Caller caller){


            this.caller=caller;
        }
        public void calledClassMethod1(){
            System.out.println("First");
            caller.callerClassMethod2();
            System.out.println("Second");

        }
    }

