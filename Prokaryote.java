public class Prokaryote extends Cell{
    public Prokaryote(String chromosome, int cellNum) {
        this.nucleus = false;
        this.chromosome = chromosome;
        this.centriole = false;
        this.cellNum = cellNum;
    }

    @Override
    public Cell cellDivision() {
        System.out.println("Undergoing Binary Fission...");
        return this.clone();
    }
}
