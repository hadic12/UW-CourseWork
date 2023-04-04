
/**
 * Write a description of class LineAtOfficeHour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//class for line at office hour
class LineAtOfficeHour{

    private Student line[];
    private int N=0;
    private int back=0;

    //empty constructor
    LineAtOfficeHour() {
        line = new Student[5];
    }
    //parameterized constructor
    LineAtOfficeHour(Student st[]) {
        int i = 0;
        line = new Student[5];
        while(i<st.length && i<5) {
            line[i]=st[i];
            i++;
        }
        this.N = i;
        this.back = i - 1;
    }
    //function to check if line is empty or not
    public boolean isEmpty() {
        if(this.N == 0)
            return true;
        else
            return false;
    }
    //function to check if line is full
    public boolean isFull() {
        if(this.N == 5) {
            return true;
        }else
            return false;
    }
    ///function to get the size of line
    public int size() {
        return this.N;
    }

    //function to add a student to the line
    public void enterLine(Student s) {
        if(isFull())
            System.out.println("Line is full!!!!");
        else {
            line[++back] = s;
            this.N++;
        }
    }

    public Student seeTeacher() {
        Student result = null;
        if(this.N >= 0) {
            result = line[0];
            int i = 0;
            for(i = 1;i < N;i++) {
                line[i-1]=line[i];
            }
            line[i-1]=null;
            this.N--;
            this.back--;
        }

        return result;
    }
    //function to print students in line
    public String whosInLine() {
        String result ="";
        for(int i=0;i<this.N;i++) {
            result+=line[i].fullName()+",";
        }
        return result;
    }
}