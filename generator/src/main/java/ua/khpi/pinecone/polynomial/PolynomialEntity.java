package ua.khpi.pinecone.polynomial;

public class PolynomialEntity {

    private String name;
    private String j;

    public PolynomialEntity(String j, String name) {
        this.name = name;
        this.j = j;
    }

    public static PolynomialEntity parsePolynomialEntity(String input){
        String[] spl = input.split(" ");
        return new PolynomialEntity(spl[0], spl[1]);
    }

    public String getName() {
        return name;
    }

    public String getJ() {
        return j;
    }

    @Override
    public String toString() {
        return j + " " + name;
    }
}
