class Feature {
    String name;
    double value;
    double weight;
    boolean important;

    public Feature(String name, double value, double weight, boolean important) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        this.important = important;
    }

    public double distance(Feature other) {
        if (!this.name.equals(other.name)) return 0;
        return Math.abs(this.value - other.value) * this.weight;
    }
}
