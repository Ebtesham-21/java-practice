class Stack {
    private int stck[];
    private int tos;

    // allocate and initilazie stack
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
}