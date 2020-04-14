package chapter13_collections;

/**
 * @author T440P 2018年11月29日 上午11:34:26
 * @since 1.0.0
 */
public class WhiterStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (int n = 0; n < fields.length; n++) {
            result += fields[n];
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);
        }
        return sb.toString();
    }

}
