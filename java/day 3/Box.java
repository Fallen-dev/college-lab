class Box {
    int width;
    int height;
    int depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    void display(String str) {
        System.out.println(str + volume());
    }

    void compareVolume(Box b1, Box b2) {
        if (b1.volume() > b2.volume())
            System.out.println("Box 1 has greater volume");
        else if (b1.volume() < b2.volume())
            System.out.println("Box 2 has greater volume");
        else
            System.out.println("Box 1 and Box 2 has equal volume");
    }

    public static void main(String[] args) {
        Box b1 = new Box(4, 4, 2);
        Box b2 = new Box(5, 5, 3);
        Box b3 = new Box(6, 6, 5);

        b1.display("Box 1 volume = ");
        b2.display("Box 2 volume = ");
        b3.display("Box 3 volume = ");
    }
}