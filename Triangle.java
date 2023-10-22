class Triangle {
    Point[] vertices;

    public Triangle(Point[] vertices) {
        if (vertices.length != 3) {
            throw new IllegalArgumentException("A triangle must have 3 vertices.");
        }
        this.vertices = vertices;
    }

    public double calc_perimeter() {
        double p = 0;
        for (int i = 0; i < 2; i++) {
            p += vertices[i].distance_to(vertices[i + 1]);
        }
        p += vertices[2].distance_to(vertices[0]);
        return p;
    }

    public boolean is_equilateral() {
        double side_1 = vertices[0].distance_to(vertices[1]);
        double side_2 = vertices[1].distance_to(vertices[2]);
        double side_3 = vertices[2].distance_to(vertices[0]);
        return (side_1 == side_2) && (side_2 == side_3);
    }

    public boolean is_isosceles() {
        double side_1 = vertices[0].distance_to(vertices[1]);
        double side_2 = vertices[1].distance_to(vertices[2]);
        double side_3 = vertices[2].distance_to(vertices[0]);
        return (side_1 == side_2) || (side_2 == side_3) || (side_3 == side_1);
    }

    public String get_type() {
        if (is_equilateral()) {
            return " equilateral";
        } else if (is_isosceles()) {
            return " isosceles";
        } else {
            return " unknown";
        }
    }
}