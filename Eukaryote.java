public class Eukaryote extends Cell{
    public Eukaryote(String chromosome, int cellNum) {
        this.nucleus = true;
        this.chromosome = chromosome;
        this.centriole = true;
        this.cellNum = cellNum;
    }

    @Override
    public Cell cellDivision() {
        System.out.println("Undergoing Mitosis...");
        return this.clone();
    }
}
