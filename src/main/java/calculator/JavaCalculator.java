package calculator;

import java.util.Arrays;
import java.util.List;

public final class JavaCalculator {

    private final List<Double > fList = Arrays.asList();
    private final List<Double> inputUList = Arrays.asList();
    private final List<Double> outputUList = Arrays.asList();

    public final void countDbList(final boolean graphicMode){
        for (int i = 0; i < this.fList.size(); i++) {
            final double coeff = countCoeff(this.inputUList.get(i), this.outputUList.get(i));
            final double db = countDb(coeff);
            if (graphicMode) {
                System.out.print("(" + this.fList.get(i) + ";" + db + ")");
            } else {
                System.out.print(db);
            }
        }
    }

    public final void countCoeffList(){
        for (int i = 0; i < this.fList.size(); i++){
            final double coeff = countCoeff(this.inputUList.get(i), this.outputUList.get(i));
            System.out.print(coeff);
        }
    }

    public final double countSimpleErr(final double theory, final double experimental){
        return (theory - experimental) / theory * 100;
    }

    public final double countBiErr(final double err1, final double err2){
        return Math.sqrt(Math.pow(err1, 2) + Math.pow(err2, 2));
    }

    public final void greeting(){
        System.out.println("Hello Electronics!!!");
    }

    private double countCoeff(final double inputU, final double outputU){
        return outputU / inputU;
    }

    private double countDb(final double countCoeff){
        return 20 * Math.log10(countCoeff);
    }
}