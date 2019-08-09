package chapter12;

/**
 * @author ：handongming
 * @date ：Created in 2019/8/8 14:46
 * @description：
 * @modified By：
 * @version: $
 */
public class DynamicFields2 {

    private Object[][] fields;

    public DynamicFields2(int initalSize) {
        fields = new Object[initalSize][2];
        for (int i = 0; i < initalSize; i++) {
            fields[i] = new Object[]{null,null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] field:fields
             ) {
            result.append(field[0]);
            result.append(":");
            result.append(field[1]);
            result.append("\n");
        }
        return result.toString();

    }

    private int hasField(String id){
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])){
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException{
        int fieldNumber = hasField(id);
        if (fieldNumber == -1){
            throw new NoSuchFieldException();
        }
        return fieldNumber;
    }

    private int makeField(String id){
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null){
                fields[i][0] = id;
                return i;
            }
        }

        Object[][] tmp = new Object[fields.length+1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }

        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[]{null,null};
        }

        fields = tmp;
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException{
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id,Object value) throws DynamicFieldsException{
        if (value == null){
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }

        int fieldNumber = hasField(id);
        if (fieldNumber == -1){
            fieldNumber = makeField(id);
        }

        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e){
            throw new RuntimeException(e);
        }

        fields[fieldNumber][1] = value;
        return result;

    }




}

