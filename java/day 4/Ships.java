class Ship { // output file: MyShip.class
    String name, buildDate;

    Ship(String name, String buildDate) {
        this.name = name;
        this.buildDate = buildDate;
    }

    public String toString() {
        return "Ship: " + this.name + " | Build date: " + this.buildDate;
    }
}

class CruiseShip extends Ship {
    private int seats = 0;

    CruiseShip(String name, String buildDate, int seats) {
        super(name, buildDate);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Cruise: " + super.name + " | Seats: " + this.seats;
    }
}

class CargoShip extends Ship {
    private int capacity = 0;

    CargoShip(String name, String buildDate, int capacity) {
        super(name, buildDate);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cargo: " + super.name + " | Capacity: " + this.capacity;
    }
}

class MyShip {
    public static void main(String[] args) {
        Ship[] ship = new Ship[3];
        ship[0] = new Ship("Ship1", "19/12/2002");
        ship[1] = new CruiseShip("Ship2", "1/2/2005", 700);
        ship[2] = new CargoShip("Ship3", "9/1/2007", 1200);

        for (Ship i : ship)
            System.out.println(i.toString());
    }
}
