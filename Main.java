public class Main {
    public static void main(String[] args) {
        ObjectProfile prototype = new ObjectProfile("Ideal Bird", "Bird");
        prototype.addFeature(new Feature("flying", 1.0, 0.5, true));
        prototype.addFeature(new Feature("featherColor", 1.0, 0.3, true));
        prototype.addFeature(new Feature("source", 1.0, 0.2, false));

        ObjectProfile owl = new ObjectProfile("Owl", "Bird");
        owl.addFeature(new Feature("flying", 0.9, 0.5, true));
        owl.addFeature(new Feature("featherColor", 1.0, 0.3, true));
        owl.addFeature(new Feature("source", 0.8, 0.2, false));

        ObjectProfile penguin = new ObjectProfile("Penguin", "Bird");
        penguin.addFeature(new Feature("flying", 0.1, 0.5, true));
        penguin.addFeature(new Feature("featherColor", 0.5, 0.3, true));
        penguin.addFeature(new Feature("source", 1.0, 0.2, false));

        System.out.println("Owl Score: " + owl.similarityScore(prototype));
        System.out.println("Penguin Score: " + penguin.similarityScore(prototype));
    }
}
