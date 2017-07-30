/**
 * Created by mahajani on 7/28/2017.
 */
public class NumberManipulation {

    int[] values;

    NumberManipulation(int[] values) {

        this.values = values;

    }

    public int manipulate(Calculate calculate) {
        int result = 0;
        for(int i = 0 ; i < values.length ; i=i+2 ) {
            result = result + calculate.calc(values[i],values[i+1] );
        }
        return result;
    }

}
