class Box{
    int width;
    int height;
    int depth;
    
    void setDimensions(int width, int height, int depth){
        width = width;
        height = height;
        depth = depth;
    }
}

class test {
    public static void main(String[] args) {
        Box bux = new Box();
        bux.setDimensions(1, 2, 3);
        System.out.println(bux.width);
    }
}