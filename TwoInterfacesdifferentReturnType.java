package Assignment2;


    interface InterfaceX
    {
        public int learn();
    }
    interface InterfaceY
    {
        public String learn();
    }
    //Now, Suppose we have a class that implements both those interfaces:

/*public class TwoInterfacesdifferentReturnType  implements InterfaceX, InterfaceY*/
   /* {
        public String learn()
        {
            return "hello";
        }
    }*/


   //ANSWER: We cannot use two interface with same method signature and different return type as it gives an error.