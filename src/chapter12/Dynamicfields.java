/**
 *
 */
package chapter12;

/**
 * <p>
 * Title: Dynamicfields
 * </p>
 * <p>
 * Description:
 * </p>
 *
 * @author handongming @date 2019年8月2日
 */
public class Dynamicfields {

    private Object[][] fields;

    /**
     *@Description: 构造函数初始化fields大小
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/9
     */
    public Dynamicfields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    /**
     *@Description: key:value方式打印，StringBuilder的使用
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/9
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object[] field : fields) {
            builder.append(field[0]);
            builder.append(":");
            builder.append(field[1]);
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     *@Description: 是否有当前key
     *@Param: id(key)
     *@return: 容器包含当前key，返回key值的索引，不包含返回-1
     *@Author: your name
     *@date: 2019/8/9
     */
    private int hasfield(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    /**
     *@Description: 根据传入的id获取其所在索引位置
     *@Param:
     *@return:
     *@throws:  NoSuchFieldException,如果容器当前不包含传入的id，抛出异常
     *@Author: your name
     *@date: 2019/8/9
     */
    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNumber = hasfield(id);
        if (fieldNumber == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNumber;
    }

    /**
     *@Description: 向容器中放置新的key并返回放置的key索引 ·1容器容量可以放置 ·2容器容量不足时，扩容
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/9
     */
    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[]{null, null};
        }
        fields = tmp;
        return makeField(id);
    }

    /**
     *@Description: 根据传入key值获取对应的value
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/9
     */
    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }
    
    /**
     *@Description: 向容器中放置字段，key:value形式的
     *@Param: 
     *@return: 
     *@Author: your name
     *@date: 2019/8/9
     */
    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasfield(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;

        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        Dynamicfields df = new Dynamicfields(3);
        System.out.println(df);
        System.out.println("--------------------------");
        try {
            df.setField("a", "a value of a");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("a", "a new value of a");
            df.setField("number3", 11);
            System.out.println("df:" + df);
            System.out.println("df.getField(\"d\"):" + df.getField("d"));
            Object field = df.setField("a", null);
        } catch (DynamicFieldsException e) {
            // TODO: handle exception
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class DynamicFieldsException extends Exception {
}
