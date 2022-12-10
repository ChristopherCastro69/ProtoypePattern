public abstract class Cell implements Cloneable {
    boolean nucleus;
    String chromosome;
    boolean centriole;
    int cellNum;

    public void printRecord() {
        System.out.println("Cell details: " + "\n\tNucleus: " + nucleus + "\n\tChromosome: " + chromosome + "\n\tCentriole: " + centriole + "\n\tNumber of Chromosomes: " + cellNum);
    }

    @Override
    public Cell clone() {
        Cell copy = null;
        try {
            copy = (Cell) super.clone();
            System.out.println("Clone successful.");
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed.");
        }
        return copy;
    }

    public abstract Cell cellDivision();
}
