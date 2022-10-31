package Class17;
public class Task1 {
    /*Create a method that will accept an array as parameters and will return
    a sum of all elements from that array. Method should be visibly only within
    same package and accessible by the creating an instance of the class.
     */
    int sum=0;
    int sumOfElments(int []arr){
        for(int i=0; i<arr.length; i++){
        sum=sum+arr[i];}
        return sum;
    }
    public static void main(String[] args) {
        int []ar={5,15,20,60,100};
        Task1 task=new Task1();
        int sum1= task.sumOfElments(ar);
        System.out.println("Sum of the Array elements is : "+sum1);

    }


    }





