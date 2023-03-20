package QandS;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if (isFull()){
            // doubling the size of the array
            int[] temp = new int[2 * data.length];

            // copying the content to temp array
            for (int index = 0; index < data.length; index++) {
                temp[index] = data[index];
            }
            data = temp;
        }
        return super.push(item);

    }
}
