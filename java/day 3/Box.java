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
        if (b1.volume() > b2.volume()) {
            System.out.println("Box 1 has greater volume");
            System.out.println("Box 1 details ->");
            System.out.printf("Width = %d\nHeight = %d\nDepth = %d\n", b1.width, b1.height, b1.depth);
        }
        else if (b1.volume() < b2.volume()) {
            System.out.println("Box 2 has greater volume");
            System.out.println("Box 2 details ->");
            System.out.printf("Width = %d\nHeight = %d\nDepth = %d\n", b2.width, b2.height, b2.depth);
        }
        else System.out.println("Both Box 1 and Box 2 has equal volume");
    }

    public static void main(String[] args) {
        Box b1 = new Box(4, 4, 2);
        Box b2 = new Box(5, 5, 3);

        b1.display("Box 1 volume = ");
        b2.display("Box 2 volume = ");
        b1.compareVolume(b1, b2);
    }
}