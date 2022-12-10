import java.util.*;
public class PrototypePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean nucleus;
        System.out.print("Add Nucleus (Y/N): ");
        char nuc = scan.next().charAt(0);
        if(nuc == 'Y' || nuc == 'y') nucleus = true;
        else nucleus = false;
        System.out.print("Enter chromosome structure: ");
        String chromosome = scan.next();
        System.out.print("Enter number of chromosomes: ");
        int cellNum = scan.nextInt();
        Cell parent = null;
        parent = (nucleus) ? new Eukaryote(chromosome, cellNum) :  new Prokaryote(chromosome, cellNum);
        parent.printRecord();
        System.out.print("Perform Cell Division? (Y/N): ");
        char decision = scan.next().charAt(0);
        Cell child;
        if(decision == 'Y' || decision == 'y') {
            child = parent.cellDivision();
            child.printRecord();
        } else return;
    }
}