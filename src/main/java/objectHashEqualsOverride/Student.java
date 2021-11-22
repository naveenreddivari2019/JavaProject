package objectHashEqualsOverride;

public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        System.out.println(" Hash Code : "+result);
        if (name != null) {
            result = 31 * result + name.hashCode();
        }
        System.out.println(" Hash Code : "+result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        //System.out.printf(" Equals : "+result);
        if (!(obj instanceof Student)) {
            return false;
        }
        //System.out.printf(" Equals : "+result);
        Student st = (Student) obj;

        return st.name.equals(name) && st.id == id ;
    }
}
