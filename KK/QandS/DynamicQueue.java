package QandS;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if (this.isFull()){
            // doubling the size of the array
            int[] temp = new int[2 * data.length];

            // copying the content to temp array
            for (int index = 0; index < data.length; index++) {
                temp[index] = data[(front+index) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
