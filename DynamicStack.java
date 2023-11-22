package StackAndQueue.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        //if array is full
        if(this.isFull()){
            //double the array size
            int[] temp=new int[data.length*2];

            //copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }

            //System.arraycopy(data, 0, temp, 0, data.length); same thing
            data=temp;
        }
        //insert item,if array is not full
        return super.push(item);

    }
}
